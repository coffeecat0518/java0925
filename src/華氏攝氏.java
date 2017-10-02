public class 華氏攝氏 {
    public  static void main (String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("請輸入攝氏");
        double 攝氏 = sc.nextDouble();

        double 華氏 = 攝氏 * 9 / 5 + 32;

        System.out.println(華氏 + "華氏:" + 華氏);
        System.out.println(華氏 + "攝氏:" + 攝氏);

    }
}

