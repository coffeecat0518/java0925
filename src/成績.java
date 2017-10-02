public class 成績 {
    public  static void main (String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("請輸入三個成績");
        double 成績 = sc.nextDouble();

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double 總和 = A + B + C;
        double 平均 = (A + B + C) / 3;

        System.out.println("總和:" +總和 + "平均" + 平均);
    }
}
