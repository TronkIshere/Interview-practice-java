package java8;

// Source: https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html
// https://gpcoder.com/3945-optional-trong-java-8/ (vietnamese)

public class Optional_class {
    // A container object which may or may not contain a non-null value.
    // If a value is present, isPresent() will return true and get() will return the value.

    // Additional methods that depend on the presence or absence of a contained value are provided,
    // such as orElse() (return a default value if value not present) and ifPresent()
    // (execute a block of code if the value is present).

    // This is a value-based class; use of identity-sensitive operations
    // (including reference equality (==), identity hash code, or synchronization)
    // on instances of Optional may have unpredictable results and should be avoided.
    public final class Optional<T> extends Object{}
}
