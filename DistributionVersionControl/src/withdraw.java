import java.util.Scanner;

public class withdraw {
	public static void main(String args[] )
    { 
        int amount = 5000, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        while(true)
        {    
            System.out.println("======Automated Teller Machine=====");
            System.out.println();
            System.out.println("------Choose 1 For Withdraw--------");
            System.out.println("------Choose 2 For Deposit---------");
            System.out.println("------Choose 3 For Check Balance----");
            System.out.println("------Choose 4 For EXIT-------------");
            System.out.println();
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
	switch(n)
    {
        case 1:
        System.out.print("Enter ammount of money to be withdrawn:");
        withdraw = s.nextInt();
        if(amount >= withdraw)
        {
        	amount = amount - withdraw;
            System.out.println("Withdrawn is Completed, Please Take Your Card!!");
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
        System.out.println("");
        break;
    }
        }}}


