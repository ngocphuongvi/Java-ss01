import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        final double exchange_rate = 25615.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền USD: ");
        double usd = scanner.nextDouble();
        double vnd = usd * exchange_rate;
        System.out.printf("%.2f USD tương đương với %.2f VNĐ", usd, vnd);
        scanner.close();
    }
}
