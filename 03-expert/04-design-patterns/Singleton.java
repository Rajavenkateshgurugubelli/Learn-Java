// package expert.designpatterns; // Commented out for easier compilation

/**
 * The Singleton Pattern ensures a class has only one instance
 * and provides a global point of access to it.
 */
public class Singleton {

    // 1. Private static variable to hold the single instance
    // volatile ensures that multiple threads handle the unique instance variable
    // correctly
    private static volatile Singleton instance;

    public String data;

    // 2. Private constructor prevents instantiation from other classes
    private Singleton(String data) {
        this.data = data;
    }

    // 3. Public static method to get the instance
    public static Singleton getInstance(String data) {
        // Double-Checked Locking for Thread Safety
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(data);
            }
            return instance;
        }
    }

    public void showMessage() {
        System.out.println("Singleton Data: " + data);
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance("First Instance");
        Singleton s2 = Singleton.getInstance("Second Instance"); // This data is ignored

        s1.showMessage();
        s2.showMessage();

        System.out.println("Are s1 and s2 the same object? " + (s1 == s2));
    }
}
