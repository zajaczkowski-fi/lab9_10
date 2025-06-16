public class App {

    public static void main(String[] args) {
        App app = new App();
        app.safeMethod();
        app.printMessage("Repeat");
    }

    public void safeMethod() {
        try {
            int denominator = 2;
            if (denominator != 0) {
                int x = 10 / denominator;
                System.out.println("Result: " + x);
            }
        } catch (Exception e) {
            System.err.println("Error during division: " + e.getMessage());
        }
    }

    public void printMessage(String message) {
        for (int i = 0; i < 3; i++) {
            System.out.println(message);
        }
    }
}
