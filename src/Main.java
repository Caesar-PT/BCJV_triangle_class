import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 3 cạnh của tam giác");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        System.out.println("Nhập vào màu sắc của hình");
        String color = scanner.next();

        if ( x + y > z && x + z > y && y + z > x) {
            Triangle triangle = new Triangle(color, x, y, z);
            System.out.println(triangle.toString());
        } else
            System.out.println("Ba cạnh không thỏa mãn tam giác");
    }
}
