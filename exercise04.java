import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào điểm Toán: ");
        float math = scanner.nextFloat();
        System.out.print("Nhập vào điểm Văn: ");
        float literature = scanner.nextFloat();
        System.out.print("Nhập vào điểm Anh: ");
        float english = scanner.nextFloat();

        float average = (math + literature + english) / 3;

        System.out.printf("Trung bình cộng: %.2f%n", average);
        scanner.close();
    }
}
