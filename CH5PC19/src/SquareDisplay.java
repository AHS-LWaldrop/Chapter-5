/**
 * Lucas Waldrop
 * CH5PC19
 * Programming III - AP CS
 * 11/29/18
 */

import java.util.Scanner;

public class SquareDisplay {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        int input;
        String square = "";
        
        //User enters int <= 15
        System.out.print("Please enter a number less than or equal to 15: ");
        input = keyboard.nextInt();
        
        //Compares input to 15
        if(input > 15){
            System.out.println("Number must be less than 15...");
        }else{
            for(int y = 0; y < input; y++){
                for(int x = 0; x < input; x++){
                    square += "X";
                }
                square += "\n";
            }
        }
        
        System.out.println(square);
        
    }

}
