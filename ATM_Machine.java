import java.util.Scanner;
public class ATM_Machine {
    public static void main(String args[]){
        int balance = 0,withdraw,savings ;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("ATM Machine\n");
            System.out.println("choose 1 to deposit");
            System.out.println("choose 2 to check balance");
            System.out.println("choose 3 to withdraw");
            System.out.println("choose 4 to exit\n");
            System.out.println("choose the operation:");
            int choice = sc.nextInt();
            switch(choice ){
                case 1:
                System.out.println("Enter amount to be deposited");
                savings = sc.nextInt();
                balance = balance + savings;
                System.out.println("your money has been deposited sucessfully !");
                System.out.println("");
                break;

                case 2:
                System.out.println("balance :"+balance);
                System.out.println("");
                break;

                case 3:
                System.out.print("Enter money to be withdrawn:");
                withdraw = sc.nextInt();
                if(balance >= withdraw){
                    balance = balance-withdraw;
                    System.out.println("collect your money!");
                }
                else{
                    System.out.println("insufficient balance");
                }
                System.out.println("");
                break;

                case 4:
                System.exit(0);

                default :
                System.out.println("please do the selection correctly");
            }
        }
    }
}