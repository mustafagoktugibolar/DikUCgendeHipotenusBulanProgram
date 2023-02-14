import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String process = "1.Calculate Area \n"
        +"2.Calculate Hypotenus";

        System.out.println(process);
        System.out.print("Choose process : ");
        int input = sc.nextInt();

        int a, b;
        double c;

        switch(input){
            case 1:

                System.out.print("A : ");
                a = sc.nextInt();

                System.out.print("B : ");
                b = sc.nextInt();

                System.out.print("C : ");
                c = sc.nextInt();

                Double u = ((a+b+c) / 2);

                double area = Math.sqrt((𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)));


            case 2:
                System.out.print("A : ");
                a = sc.nextInt();

                System.out.print("B : ");
                b = sc.nextInt();
                sc.close();
        
                double res = ((Math.pow(a, 2)) + (Math.pow(b, 2))); 
                c = Math.sqrt(res);

                System.out.println("C is : " + c);
        }
    }
}
