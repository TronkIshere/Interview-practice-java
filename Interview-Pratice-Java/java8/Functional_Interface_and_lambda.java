package java8;

public class Functional_Interface_and_lambda {
    // This annotation is important but not always to use it
    @FunctionalInterface // To make sure there only one method here
    interface Animal {
        void speak();
        // When we add method run it's error
        //void run();
    }

    static class Cat implements Animal {
        @Override
        public void speak(){
            System.out.println("Meow");
        }
    }

    // So functional interface in java is interface but only have 1 method

    // Functional Interface parameters
    @FunctionalInterface
    interface AnimalName{
        void speak(String firstName);
    }

    static class Dog implements AnimalName{
        @Override
        public void speak(String firstName){
            System.out.println("Anime name: " + firstName);
        }
    }

    public static void main(String args[]){
        Animal cat = new Cat();
        cat.speak();

        // Lambda don't need access modifier, return type, method name
        // Don't need through a class to use functional interface
        // Just need communicates how to implement the method through a functional interface
        Animal cat2 = () -> { System.out.println("Meow Meow"); };
        cat2.speak();

        // It's use for write code more clean and understandable

        // Because lambda expressions only use with functional interface
        // and functional interface only have one method so lambda expressions know what to do

        // If lambda expression have one line, we don't need to use {}
        Animal cat3 = () ->  System.out.println("Meow Meow");

        // Example use lambda expressions with parameters
        AnimalName dog = (firstName) -> System.out.println(firstName);
        dog.speak("chihuahua");
    }
}
