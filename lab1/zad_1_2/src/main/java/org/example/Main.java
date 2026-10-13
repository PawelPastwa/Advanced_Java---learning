package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("du du du dupppaaaaaaaa");

        MathOperation adding = (a, b) -> a + b;
        MathOperation multiply = (a, b) -> a * b;

        double resultAdding1 = MathCalculator1.executeOperation(2.1, -1.3, adding);
        double resultMultiply1 = MathCalculator1.executeOperation(2.1, -1.3, multiply);

        double resultFunction1
                = MathCalculator1.executeOperation(2.1, -1.3, (a, b) -> Math.sin(a) + Math.cos(b));

        System.out.println(resultAdding1);
        System.out.println(resultMultiply1);
        System.out.println(resultFunction1);

        double resultAdding2
                = MathCalculator2.executeOperation(2.1, -1.3, (a, b) -> a + b);

        double resultMultiply2
                = MathCalculator2.executeOperation(2.1, -1.3, (a, b) -> a * b);

        double resultFunction2
                = MathCalculator2.executeOperation(2.1, -1.3, (a, b) -> Math.sin(a) + Math.cos(b));

        System.out.println(resultAdding2);
        System.out.println(resultMultiply2);
        System.out.println(resultFunction2);
    }
}