package java8;

import java.lang.annotation.*;

// Source: https://gpcoder.com/4066-annotation-trong-java-8/ (vietnamese)

public class Type_Annotations_and_Repeatable_Annotations {
    // 1. Declare a Repeatable Annotation Type
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @Repeatable(Filters.class)
    public @interface Filter {
        String value();
    };

    // 2. Declare the Containing Annotation Type
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Filters {
        Filter[] value();
    }

    // 3. Use repeating annotations
    @Filter("filter1")
    @Filter("filter2")
    public interface Filterable {
    }

    public static void main(String[] args) {
        // 4. Retrieving Annotations via the Filter class
        Filter[] arrFilter = Filterable.class.getAnnotationsByType(Filter.class);
        for (Filter filter : arrFilter) {
            System.out.println(filter.value());
        }

        // Another way
        // 4. Retrieving Annotations via the Filters class
        Filters filters = Filterable.class.getAnnotation(Filters.class);
        for (Filter filter : filters.value()) {
            System.out.println(filter.value());
        }
    }
}
