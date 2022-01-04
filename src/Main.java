import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD:");
        USD = scanner.nextDouble();
        double rate = USD*VND;
        System.out.println("Giá trị VND:" + " " + rate);
    }
}
