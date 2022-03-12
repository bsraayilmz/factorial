import java.util.Scanner;

public class problem{
    public static void main(String [] args){
       // Scanner s = new Scanner(System.in);
        int userNumber = 0;
        int multi = 1;
        //System.out.println("Enter a non negative integer");


        for(int i=1; i<=7; i++){
            userNumber++;
            multi = multi*i;
            System.out.println(userNumber+"! : " + multi);
        }

    }
}