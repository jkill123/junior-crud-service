package basic.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCExample {

    private static final String GET_USERS_SQL = "SELECT * FROM users";
    private static final String INSERT_USER_SQL =
            "INSERT INTO users(name, email, age)" +
            "VALUES (?, ?, ?)";
    private static final String UPDATE_USER_SQL =
            "UPDATE users SET name = ?, age = ? WHERE id = ?";
    private static final String SELECT_FROM_USERS_WHERE_ID_SQL = "SELECT * FROM users WHERE id = ?";
    private static final String DELETE_FROM_USERS_WHERE_ID_SQL = "DELETE FROM users WHERE id = ?";

    public static void main(String[] args) throws SQLException {
        // todo CRUD
        Connection connection = jdbcConnection();
//        User user = findUserById(connection, 7);
//        List<User> allUsers = findAllUsers(connection);
//        System.out.println(allUsers);
//        save(connection, User.builder()
//                .name("Tony")
//                .email("tony@gmail.com")
//                .age(35)
////                .build());
//                update(connection, User.builder()
//                .name("TonyUpdated")
//                .age(44)
//                .build(), 7);
//        delete(connection, 7);

    }

    public static void save(Connection conn, User user) throws SQLException {
        try (PreparedStatement preparedStatement = conn.prepareStatement(INSERT_USER_SQL)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setInt(3, user.getAge());

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        }
    }

    public static void update(Connection conn, User user, int id) throws SQLException {
        try (PreparedStatement preparedStatement = conn.prepareStatement(UPDATE_USER_SQL)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setInt(2, user.getAge());
            preparedStatement.setInt(3, id);

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        }
    }

    public static void delete(Connection conn, int id) throws SQLException {
        try (PreparedStatement preparedStatement = conn.prepareStatement(DELETE_FROM_USERS_WHERE_ID_SQL)) {
            preparedStatement.setInt(1, id);

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        }
    }

    public static User findUserById(Connection conn, int id) throws SQLException {
        ResultSet resultSet;
        User user = null;
        try (PreparedStatement preparedStatement = conn.prepareStatement(SELECT_FROM_USERS_WHERE_ID_SQL)) {
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                Integer age = resultSet.getInt("age");

                user = User.builder()
                        .name(name)
                        .email(email)
                        .age(age)
                        .build();
                System.out.println(user);
            }
        }
        return user;
    }

    public static List<User> findAllUsers(Connection conn) throws SQLException {
        ArrayList<User> result = new ArrayList<>();
        ResultSet resultSet;
        try (PreparedStatement preparedStatement = conn.prepareStatement(GET_USERS_SQL)) {
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                Integer age = resultSet.getInt("age");

                User user = User.builder()
                        .name(name)
                        .email(email)
                        .age(age)
                        .build();
                result.add(user);
            }
        }
        result.forEach(System.out::println);
        return result;
    }

    public static Connection jdbcConnection() {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5434/dockerdb",
                    "dockeruser",
                    "dockerpassword");

            if (conn != null) {
                System.out.println("Connected to the database!");
                return conn;
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
