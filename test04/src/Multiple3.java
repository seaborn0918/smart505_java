import java.util.Scanner;

public class Multiple3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("정수 10개 입력 >> ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("3의 정수 >> ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }


    }
}
