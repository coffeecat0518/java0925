public class AB {
    public  static void main (String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("請輸入兩數");

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double Sum = A + B;
        double Sub = A - B;
        double Mul = A * B;

        System.out.println(Sum + " " + Sub + " " + Mul);
    }
}
