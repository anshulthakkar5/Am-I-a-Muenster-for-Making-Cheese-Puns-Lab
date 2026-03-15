package org.example;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

   
    public String cheesePun(int n) {

        if (n % 3 == 0 && n % 5 == 0) {
            return "Muenster";
        }

        if (n % 3 == 0) {
            return "Cheddar";
        }

        if (n % 5 == 0) {
            return "Gouda";
        }

        return Integer.toString(n);
    }

    public static void main(String[] args) {

        App app = new App();

        System.out.println(app.getGreeting());

        for(int i = 1; i <= 20; i++){
            System.out.println(app.cheesePun(i));
        }
    }
}
