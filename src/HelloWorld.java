public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        int first = (int) (Math.random() * 10);
        int second = (int) (Math.random() * 10);
        if (first > second) {
            System.out.println("First: " + first);
        } else if (first == second) {
            System.out.println("First == second: " + first);

        } else {
            System.out.println("Second: " + second);
        }
        System.out.println(Math.min(first, second));
        int counter = 1;
        while (counter <= 15) {
            if (!(counter % 2 == 0) & !(counter % 3 == 0) && !(counter % 5 == 0)) {
                System.out.println(counter);
            }
            counter += 1;
        }
    }
}

// Negation: !
// Oder: || (|)
// Und: && (&)
// XOR: ^
