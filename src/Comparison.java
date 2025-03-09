public class Comparison {
    public static void main(String[] args) {
        int result, a, b;
        a = (int) (Math.random() * 10);
        b = (int) (Math.random() * 10);
        boolean flag = true;
        result = ((a + b) % 2 == 0) ? a + b : b;
        System.out.println((a + b) % 2 == 0);
        System.out.println(a + ", " + b + ", " + result);
        if (a > 8){
            System.out.println(a + " > 8");
            flag = false;
        } else if (a > 4) {
            System.out.println(a + " > 4");
        } else {
            System.out.println(a);
        }

        int c = flag ? a: b;
        System.out.println(c);
    }
}
