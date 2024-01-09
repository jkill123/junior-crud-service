package basic.unit;

public class Calc {

    public int perform(int first, int second, Operator operator) {
        if (operator == null) {
            operator = Operator.DEFAULT;
        }
        switch (operator) {
            case SUM:
                return first + second;
            case MINUS:
                return first - second;
            case DIVIDE:
                return first / second;
            case MULTIPLY:
                return first * second;
            default:
                throw new IllegalArgumentException();
        }
    }
}
