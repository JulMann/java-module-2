package com.julmann;

public class Main {
    public static void main(String[] args) {

        // Арифметические операции ( + , -, * , /) над двумя примитивами типа int
        int a = 81;
        int b = 9;

        int sumInt = a + b;
        int diffInt = a - b;
        int productInt = a * b;
        int quotientInt = a / b;

        System.out.println("Арифметические операции ( + , -, * , /) над двумя примитивами типа int:");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + sumInt);
        System.out.println("a - b = " + diffInt);
        System.out.println("a * b = " + productInt);
        System.out.println("a / b = " + quotientInt + "\n");

        // Арифметические операции над int и double в одном выражении
        double c = 9.0;

        double sumDouble = a + c;
        double diffDouble = b - c;
        double productDouble = b * c;
        double quotientDouble = a / c;
        double remainderDouble = (1 - a) % c ;

        System.out.println("Арифметические операции над int и double в одном выражении:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("a + c = " + sumDouble);
        System.out.println("b - c = " + diffDouble);
        System.out.println("b * c = " + productDouble);
        System.out.println("a / c = " + quotientDouble);
        System.out.println("(1 - a) % c = " + remainderDouble + "\n");

        // Логические операции ( < , >, >=, <= )
        boolean isLess = b < a;
        boolean isGreater = b > a;
        boolean isGreaterOrEqual = a >= b;
        boolean isLessOrEqual = b <= c;

        System.out.println("Логические операции ( < , >, >=, <= ):");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("b < a: " + isLess);
        System.out.println("b > a: " + isGreater);
        System.out.println("a >= b: " + isGreaterOrEqual);
        System.out.println("b <= c: " + isLessOrEqual + "\n");

        // Диапазоны типов данных для вещественных чисел, чисел с плавающей точкой. Максимальные, минимальные значения и переполнение
        System.out.println("Диапазоны типов данных для вещественных чисел, чисел с плавающей точкой. Максимальные, минимальные значения и переполнение:");
        System.out.println("double min normal = " + Double.MIN_NORMAL);
        System.out.println("double max value = " + Double.MAX_VALUE);
        System.out.println("double positive infinity = " + Double.POSITIVE_INFINITY);
        System.out.println("double negative infinity = " + Double.NEGATIVE_INFINITY + "\n");

        System.out.println("float min normal = " + Float.MIN_NORMAL);
        System.out.println("float max value = " + Float.MAX_VALUE);
        System.out.println("float positive infinity = " + Float.POSITIVE_INFINITY);
        System.out.println("float negative infinity = " + Float.NEGATIVE_INFINITY + "\n");

        // Переполнение при арифметической операции
        double maxDouble = Double.MAX_VALUE;
        double overflowedDouble = maxDouble * 2.0;

        System.out.println("Переполнение при арифметической операции:");
        System.out.println("maxDouble = " + maxDouble);
        System.out.println("maxDouble * 2 = " + overflowedDouble);
        System.out.println(overflowedDouble +" is Infinite? " + Double.isInfinite(overflowedDouble) + "\n");

        double nanExampleDouble = 0.0 / 0.0;
        System.out.println("0.0 / 0.0 = " + nanExampleDouble);
        System.out.println(nanExampleDouble + " is NaN? " + Double.isNaN(nanExampleDouble) + "\n");

        float  maxFloat = Float.MAX_VALUE;
        float  overflowedFloat = maxFloat * 2.0f;

        System.out.println("maxFloat = " + maxFloat);
        System.out.println("maxFloat * 2 = " + overflowedFloat);
        System.out.println(overflowedFloat + " is Infinite? " + Float.isInfinite(overflowedFloat) + "\n");

        float nanExampleFloat = 0.0f / 0.0f;
        System.out.println("0.0f / 0.0f = " + nanExampleFloat);
        System.out.println(nanExampleFloat + " is NaN? " + Float.isNaN(nanExampleFloat));
    }
}