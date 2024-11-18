package lashukolga;

public class Main {
    public static void main(String[] args) {
        System.out.println("Version 2");

        calculations();

        System.out.println("Hello from the collaborator!");
    }

    public static void calculations() {
        int a = 10;
        int b = 20;
        int c = a * a + b;

        System.out.println(a + " ^ 2 + " + b + " = " + c);
    }
}
