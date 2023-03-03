import java.util.Scanner;
class NumberGuessing {
    public static void main(String args[]){
        int rounds = 3;
        int attempts= 10;
        int score = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 1;i<= rounds; i++){
            int guess = (int)((Math.random()*(100-1))+1);
            System.out.println();
            System.out.println("~~~~~ROUND NUMBER"+i+"~~~~~");
            for(int j = 1;j<attempts;j++){
                System.out.println();
                System.out.println("you have "+(attempts-j+1)+" attempts to go\n");
                System.out.println("Guess a number between 1 to 100");
                int ans = sc.nextInt();
                if(ans == guess){
                    System.out.println("Hurrah! you have guessed correctly");
                    score += (int) 100/i ;
                    break; 
                }
                else{
                    if(ans > guess)
                        System.out.println("No. to be guessed is less than "+ans+"\n");
                    else
                    System.out.println("No. to be guessed is greater than "+ans+"\n");
                }
            }
        }
        sc.close();
        System.out.println();
        System.out.println("Total score is" + score);
    }
}