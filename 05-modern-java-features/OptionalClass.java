package modern;

import java.util.Optional;

/**
 * Module 05: Modern Java
 * Topic: Optional
 * 
 * Objectives:
 * 1. Avoid NullPointerException.
 * 2. Optional.of(), Optional.ofNullable(), Optional.empty().
 * 3. Handling value presence: ifPresent, orElse, orElseGet, orElseThrow.
 */
public class OptionalClass {

    public static void main(String[] args) {

        // --- Creation ---
        Optional<String> empty = Optional.empty();
        Optional<String> hasValue = Optional.of("Java");

        // String text = null;
        // Optional<String> nullable = Optional.of(text); // Throws NPE immediately!
        // Optional<String> safe = Optional.ofNullable(text); // Creates empty Optional

        // --- Usage ---

        // 1. Check presence
        if (hasValue.isPresent()) {
            System.out.println("Value: " + hasValue.get());
        }

        // 2. Functional approach (ifPresent)
        hasValue.ifPresent(v -> System.out.println("Value (Functional): " + v));

        // 3. Defaults (orElse)
        String r1 = empty.orElse("Default Value");
        System.out.println("Result 1: " + r1);

        // 4. Transform (map)
        // If value exists, apply function. If empty, return empty.
        Optional<Integer> length = hasValue.map(String::length);
        System.out.println("Length: " + length.orElse(0));

        // --- Practical Example ---
        User user = findUserById(1); // Returns User
        User missing = findUserById(99); // Returns null (Old way) or Empty Optional (New way)

        // New Way Simulation
        Optional<User> optUser = findUserOptional(99);
        String userName = optUser.map(User::getName).orElse("Unknown User");
        System.out.println("User Name: " + userName);
    }

    // Checking if id is 1, else return empty
    static Optional<User> findUserOptional(int id) {
        return id == 1 ? Optional.of(new User("Admin")) : Optional.empty();
    }

    // Stub methods
    static User findUserById(int id) {
        return null;
    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
