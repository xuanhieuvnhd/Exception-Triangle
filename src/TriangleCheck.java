public class TriangleCheck {
    public void checkTriangle(double a, double b, double c)throws Triangle{
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new Triangle("Loi: Tam giac khong hop le!");
        } else {
            System.out.println("Tam giac hop le!");
        }
    }
}
