public class App {

    // hardcoded credential – S2068 (Security Hotspot)
    private static final String SECRET_KEY = "12345-super-secret";

    public static void main(String[] args) {
        App app = new App();
        app.dangerousMethod();
    }

    // empty catch block – S108 (Code Smell)
    public void dangerousMethod() {
        try {
            int x = 1 / 0; // division by zero – Bug
        } catch (Exception e) {
            // ignoring exception
        }
    }

    // duplicated code block
    public void repeat() {
        System.out.println("Repeat");
        System.out.println("Repeat");
        System.out.println("Repeat");
    }

    // unused method – S1149
    public void unused() {
    }
}
