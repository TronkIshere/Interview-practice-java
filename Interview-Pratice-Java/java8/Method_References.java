package java8;

import java.util.Arrays;
import java.util.List;

// Source: https://gpcoder.com/3882-phuong-thuc-tham-chieu-trong-java-8-method-references/
// and
// https://www.baeldung.com/java-method-references

public class Method_References {
    // Method references are a special type of lambda expressions.
    // They’re often used to create simple lambda expressions by referencing existing methods.

    // For example:
    // str -> System.out.println(str)
    // System.out::println

    // There are four kinds of method references:
    // 1. Static methods
    // 2. Instance methods of particular objects
    // 3. Instance methods of an arbitrary object of a particular type
    // 4. Constructor

    public static void main(String args[]){
        //simple example
        List<String> messages = Arrays.asList("hello", "baeldung", "readers!");
        messages.forEach(word -> System.out.println(word));
        messages.forEach(System.out::println);

        // Static methods
        int a = 10, b = 5, sum = 0, minus = 0;

        sum = doAction(a, b, MathUtils::sum);
        System.out.println(a + " + " + b + " = " + sum);

        minus = doAction(a, b, MathUtils::minus);
        System.out.println(a + " - " + b + " = " + minus);

        // Instance methods of particular objects
        MathUtils2 obj = new MathUtils2();

        sum = doAction(a, b, obj::sum);
        System.out.println(a + " + " + b + " = " + sum);

        minus = doAction(a, b, obj::minus);
        System.out.println(a + " - " + b + " = " + minus);

        // Instance methods of an arbitrary object of a particular type
        String[] stringArray = { "Java", "C++", "PHP", "C#", "Javascript" };

        Arrays.sort(stringArray, String::compareToIgnoreCase);
        for (String str : stringArray) {
            System.out.println(str);
        }

        // Constructor
        SayHello ref = Hello::new;
        ref.display("Welcome to gpcoder.com");
    }

    public static int doAction(int a, int b, ExecuteFunction func) {
        return func.execute(a, b);
    }

    public static int doAction2(int a, int b, ExecuteFunction2 func) {
        return func.execute(a, b);
    }
}

// Class and Interface for example
@FunctionalInterface
interface ExecuteFunction {
    public int execute(int a, int b);
}

class MathUtils {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }
}

@FunctionalInterface
interface ExecuteFunction2 {
    public int execute(int a, int b);
}

class MathUtils2 {
    public int sum(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }
}

@FunctionalInterface
interface SayHello {
    void display(String say);
}

class Hello implements SayHello {
    public Hello(String say) {
        System.out.print(say);
    }

    @Override
    public void display(String say) {
        System.out.println(say);
    }
}

