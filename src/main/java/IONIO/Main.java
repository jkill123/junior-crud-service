package IONIO;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream geek = new FileInputStream("ABC.txt");

        OutputStream os = new FileOutputStream("file.txt");


        // todo readers
//        Reader reader = new FileReader("c:\\data\\myfile.txt");
//
//        int data = reader.read();
//        while(data != -1){
//            char dataChar = (char) data;
//            data = reader.read();
//        }

//        // Combining Readers With InputStreams
//        Reader reader = new InputStreamReader(inputStream);

//
//        Writer writer = new FileWriter("c:\\data\\file-output.txt");
//
//        writer.write("Hello World Writer");
//        writer.close();
//
//        // Combining Writers With OutputStreams
//        Writer writer = new OutputStreamWriter(outputStream);


        // Combining Readers and Writers
//        Reader reader = new BufferedReader(new FileReader(...));
//
//        Writer writer = new BufferedWriter(new FileWriter(...));
    }
}
