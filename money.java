import java.util.Scanner;
public class Main
        public static void main(String[] args) {
        Scanner keyboard=new Scanner(system.in);
        int x,y;
        double n,m;
        System.out.println("enter the month's payment");
        System.out.println("enter the outstanding balance of the account");
                x=keyboard.nextInt();
                y=keyboard.nextInt();

                n= ((1200 * x) / (6.25 + 24));
                m = n/50;
                double interest = x - m;
                double balance =y - (interest + x);

                System.out.println("Interest paid:" +interest);
                System.out.println("ammount applied to principal:" +m);
                System.out.println("after the paymebt, the account balance is:" + balance);
        }
}
