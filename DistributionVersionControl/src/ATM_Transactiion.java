import java.util.Scanner;

public class ATM_Transactiion {
	public static void main(String args[] )
    { 
        int balance = 5000, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        while(true)
        {    
            System.out.println("======Automated Teller Machine=====");
            System.out.println("........................");
            System.out.println("------Choose 1 For Withdraw--------");
            System.out.println("------Choose 2 For Deposit---------");
            System.out.println("------Choose 3 For Check Balance----");
            System.out.println("------Choose 4 For EXIT-------------");
            System.out.println("..................................");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter ammount of money to be withdrawn:");
                withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                	balance = balance - withdraw;
                    System.out.println("Withdrawn is Completed Successfully");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
               
                case 2:
                System.out.print("Enter money to be deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully depsited");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
                System.exit(0);
            }
        }
    }
}