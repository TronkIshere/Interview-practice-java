package java8;

// Source: https://viblo.asia/p/interface-trong-java-8-gioi-thieu-default-method-va-static-method-PDOkqLqjejx (vietnamese)
// https://www.tutorialspoint.com/difference-between-default-and-static-interface-method-in-java-8#:~:text=Default%20methods%20enable%20you%20to,rather%20than%20with%20any%20object.

public class Interface_Default_and_Static {
    public interface DefaultStaticExampleInterface {
        default void show() {
            System.out.println("In Java 8- default method - DefaultStaticExampleInterface");
        }
        static void display() {
            System.out.println("In DefaultStaticExampleInterface I");
        }
    }
    public class DefaultStaticExampleClass implements DefaultStaticExampleInterface {
    }
    public class Main {
        void main(String args[]) {
            // Call interface static method on Interface
            DefaultStaticExampleInterface.display();
            DefaultStaticExampleClass defaultStaticExampleClass = new DefaultStaticExampleClass();

            // Call default method on Class
            defaultStaticExampleClass.show();
        }
    }
}

