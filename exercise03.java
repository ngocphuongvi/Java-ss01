import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số đo cạnh hình vuông: ");
        int length = scanner.nextInt();
        int perimeter = 4 * length;
        int area = length * length;
        System.out.println("Chu vi hình vuông là: " + perimeter);
        System.out.println("Diện tích hình vuông là: " + area);
        scanner.close();
    }
}
