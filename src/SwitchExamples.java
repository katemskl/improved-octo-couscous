public class SwitchExamples {
    public static void main(String[] args) {
        int grade = (int) (Math.random() * 5);

        String text = switch (grade){
            case 1 -> "excellent";
            case 2 -> "good";
            case 3 -> "satisfied";
            case 4 -> "enough";
            case 5 -> "not enough";
            default -> "no grade";
        };

        System.out.println(text);

//        int prime_num = 0;
        int counter = 1;
//        while (counter < 15) {
//            prime_num = ((counter % 2 == 0) && (counter % 3 == 0) && (counter % 5 == 0)) ? counter : counter - 1;
//            counter ++;
//        }
//        System.out.println(prime_num);

        for (int i = 1; counter <= 1000; i++){
            counter *= 2;
            System.out.print(counter + " -> " + i);
        }
    }
}
