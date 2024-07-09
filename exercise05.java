import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào bán kính đường tròn");
        double r = scanner.nextDouble();
        double perimeter = 2 * Math.PI * r;
        double area = Math.PI * r * r;
        System.out.println("Chu vi của đường tròn là: " + perimeter);
        System.out.println("Diện tích của đường tròn là: " + area);
        scanner.close();
    }
}
