package Currency;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số USD: ");
        usd = scanner.nextDouble();
        double convert = usd * vnd;
        System.out.println("Giá trị VND là: " + convert);
    }
}
