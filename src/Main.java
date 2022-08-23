import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        TriangleCheck triangleCheck = new TriangleCheck();
        try {
            System.out.print("Nhap vao canh thu nhat: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhap vao canh thu hai: ");
            int b = scanner.nextInt();
            System.out.print("Nhap vao canh thu ba: ");
            int c = scanner.nextInt();
            try {
                triangleCheck.checkTriangle(a, b, c);
            } catch (Triangle triangle) {
                System.out.println(triangle.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Nhap khong dung dinh dang!");
        }
    }
}
