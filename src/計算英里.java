public class 計算英里 {
    public  static void main (String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("請輸入英里");
        double 英里  = sc.nextDouble();

        double 公里 = 英里 * 1.6;

        System.out.println("英里" + 英里);
        System.out.println("公里" + 公里);
    }
}
