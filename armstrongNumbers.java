import java.util.Scanner;

public class armstrongNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int basNumber = 0, tempNumber, basValue, result = 0, basPow;

        System.out.print("Sayı Giriniz :");
        number = input.nextInt();

        tempNumber = number;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }
        tempNumber = number;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            tempNumber/=10;
            result+=basValue;

        }
        System.out.println(result);



    }
}
