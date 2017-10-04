public class 成績 {
    public  static void main (String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("英文成績為？");
        double 英文 = sc.nextDouble();
        System.out.println("國文成績為？");
        double 國文 = sc.nextDouble();
        System.out.println("數學成績為？");
        double 數學 = sc.nextDouble();

        double 總和 = 英文 + 國文 + 數學;
        double 平均 = (英文 + 國文 + 數學) / 3;
        System.out.println("成績總和:" +總和  + "成績平均:" + 平均);
    }
}
