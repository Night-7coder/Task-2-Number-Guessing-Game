import java.io.*;
import java.util.*;
public class exam {
    HashMap<String,Integer> info = new HashMap<String,Integer>();
    Scanner sc = new Scanner(System.in);
    public void login(){
        info.put("Abhay",200);
        info.put("Bidita",210);
        info.put("Chinmay",215);
        info.put("Dhara",220);
        System.out.println("Enter USER ID:");
        String uid = sc.nextLine();
        System.out.println("Enter PASSWORD");
        int pw = sc.nextInt();
        if(info.containsKey(uid) && info.get(uid)==pw){
            System.out.println("Successfully Logged-in !");
        }
        else{
            System.out.println("Try again !");
            login();
        }
    }
    public void menu(){
        System.out.println("\n select any one ");
        System.out.println("1. Update profile and password\n2. Start the exam\n3. Logout");
        System.out.println("\n enter your option : ");
        int op = sc.nextInt();
        switch(op){
            case 1 : info = update();
                     menu();
                     break;
            case 2 : writeExam();
                     menu();
                     break;
            case 3 : System.exit(0);
                     break;
            default: System.out.println("INVALID OPTION");                  
        }
    }
    public HashMap<String,Integer> update(){
        System.out.println("Update Profile");
        System.out.println("Enter Username : ");
        Scanner sc = new Scanner(System.in);
        String newuid = sc.nextLine();      
        if(info.containsKey(newuid)){
            System.out.println("Enter new password");
            int newpw = sc.nextInt();
            info.replace(newuid,newpw);
        }
        else{
            System.out.println("user does not exist");
        }
        System.out.println("profile updated successfully !!");
        return info ; 
    }
    public void writeExam(){
        long start = System.currentTimeMillis();
        long end1 = start+15*1000;
        long end2 = start+30*1000;
        int score1 = 0,score2=0;
        int cnt1=0,cnt2=0;
        char ans;
        System.out.println("Start the exam!");
        System.out.println("You have just 15 seconds to answer each question in section 1.");
        System.out.println("You have just 30 seconds to answer each question in section 2.");
        System.out.println("In section 1 : 5 marks for correct and -1 for incorrect");
        System.out.println("In section 2 : 10 marks for correct and -2 for incorrect");
        System.out.println("All the best !");
        while(System.currentTimeMillis()<end1){
            System.out.println("***SECTION 1***");
            System.out.println("1. Who developed java ?");
            System.out.println("a. James Gosling\nb. Dennins Rithce\nc. Guido Van Rossum\nd. Bjarne Stroustrup");
            System.out.println("Enter your answer");
            ans = sc.next().charAt(0);
            if(ans == 'a'){
                cnt1+=1;
            }
            System.out.println("2. old name of java");
            System.out.println("a.Tea\nb. Oak\nc. Orange\nd. Jakarta");
            System.out.println("Enter your answer");
            ans = sc.next().charAt(0);
            if(ans == 'b'){
                cnt1+=1;
            }
            System.out.println("3. What is the size of float and double in java?");
            System.out.println("a. 64 and 32\nb. 32 and 64\nc. 32 and 32\nd. 64 and 64");
            System.out.println("Enter your answer");
            ans = sc.next().charAt(0);
            if(ans == 'b'){
                cnt1+=1;
            }
            System.out.println("4.Automatic type conversion is possible in which of the possible cases?");
            System.out.println("a. short to int\nb. long to int\nc. byte to int\nd. int to long");
            System.out.println("Enter your answer");
            ans = sc.next().charAt(0);
            if(ans == 'd'){
                cnt1+=1;
            }
            break;
        }
        while(System.currentTimeMillis()<end2){
            System.out.println("***SECTION 2***");
            System.out.println("5. Guess the output...");
            System.out.println("public static vpoid main(String args[]){\n\tint x =5;\n\tint y=x++ + ++x + x++;\n\tSystem.out.println(y)");
            System.out.println("a. 20\nb. 12\nc. 19\nd. 18");
            System.out.println("Enter your answer");
            ans = sc.next().charAt(0);
            if(ans == 'c'){
                score2+=10;
                cnt2+=1;
            }
            else
            score2-=2;
            break;
    }
         System.out.println("You have completed the exam!");
         score1=cnt1*5-((4-cnt1)*1);
         System.out.println("Marks in section 1 :"+cnt1);
         System.out.println("Marks in section 2 :"+cnt2);
         System.out.println("Total score is :"+(score1+score2));
} 
public static void main(String[]args){
    exam can=new exam();
    can.login();
    can.menu();
}
}