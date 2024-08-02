package java8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Stream cover inside it collection or Array
// Stream provides reinforcement method for lambda expressions
// Some operations usually use: forEach(), filter(), map(), reduce(),...
public class Stream_API {
    static class Staff{
        String name;
        double salary;
        public Staff(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String args[]){
        Staff nv1 = new Staff("nv1", 100);
        Staff nv2 = new Staff("nv2", 100);
        Staff nv3 = new Staff("nv3", 100);
        List<Staff> list = Arrays.asList(nv1, nv2, nv3);

        // Created new stream
        Stream<Staff> s1 = Stream.of(nv1, nv2, nv3);

        // Created from collection
        Stream<Staff> s2 = list.stream();

        // Processing operations example
        List<Integer> numsList = Arrays.asList(2, 1, 6, 8, 7);
        double a = numsList.stream()       // call stream method to make stream thread with each element is Integer
                .filter(i -> i % 2 == 0)   // filter element with lambda expression
                .peek(System.out::println) // use Peek to take element on top and print is out
                .map(n -> Math.sqrt(n))    // every element on stream will map to value(Math.sqrt(n))
                .mapToDouble(d -> d)       // to make every element covert to double
                .average().getAsDouble();  // to calculate the average value
        System.out.println(a);

        // Use forEach to review each element
        list.stream().forEach(staff -> staff.setSalary(staff.getSalary() * 1.15));

        // Use forEach to review each element and uppercase
        list.stream().forEach(staff -> {
            staff.setSalary(staff.getSalary() * 1.15);
            staff.setName(staff.getName().toUpperCase());
        });

        list.forEach(staff -> {
            System.out.println("Name: " + staff.getName());
            System.out.println("Salary: " + staff.getSalary());
            System.out.println("---------------------------");
        });
    }
}
