package calculator;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public enum Shape {

     ADDITION       ("+", (first, second) -> first + second)
    ,SUBTRACTION    ("-", (first, second) -> first - second)
    ,MULTIPLICATION ("*", (first, second) -> first * second)
    ,DIVISION       ("/", (first, second) -> first / second);

    private String symbol;
    private IntBinaryOperator operator;

    Shape(String symbol, IntBinaryOperator operator) {
        this.symbol = symbol;
        this.operator = operator;
    }

    public int execute(int first, int second) {
        return operator.applyAsInt(first, second);
    }

    public static Shape findOf(String symbol) {
        return Arrays.stream(Shape.values())
                .filter(shape -> shape.symbol.equals(symbol))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
