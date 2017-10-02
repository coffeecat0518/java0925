public class input {
    public  static void main (String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("What's your name?");
        String Name = sc.next();

        System.out.println("How old are you?");
        int Age = sc.nextInt();

        System.out.println(Name + ",You're " + Age + " years old.");

    }
}
