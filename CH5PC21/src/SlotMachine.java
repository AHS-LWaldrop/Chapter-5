/**
 * Lucas Waldrop
 * CH5PC21
 * Programming III - AP CS
 * 11/29/18
 */

import java.util.Scanner;
import java.util.Random;

public class SlotMachine {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        String slotOutput = "";
        String first = "", second = "", third = "";
        int random = 0;
        int money = 0;
        
        System.out.println("Please enter the amount of money you want to bet: ");
        money = keyboard.nextInt();
        
        Random r = new Random();
        
        random = r.nextInt(5);
        switch(random){
            case 0: slotOutput = "Cherries ";
                    first = "Cherries";
                break;
            case 1: slotOutput = "Oranges ";
                    first = "Oranges";
                break;
            case 2: slotOutput = "Plums ";
                    first = "Plums";
                break;
            case 3: slotOutput = "Bells ";
                    first = "Bells";
                break;
            case 4: slotOutput = "Melons ";
                    first = "Melons";
                break;
            default: slotOutput = "Bars ";
                    first = "Bars";
        }
            System.out.print(slotOutput);
                    
        random = r.nextInt(5);
        switch(random){
            case 0: slotOutput = "Cherries ";
                    second = "Cherries";
                break;
            case 1: slotOutput = "Oranges ";
                    second = "Oranges";
                break;
            case 2: slotOutput = "Plums ";
                    second = "Plums";
                break;
            case 3: slotOutput = "Bells ";
                    second = "Bells";
                break;
            case 4: slotOutput = "Melons ";
                    second = "Melons";
                break;
            default: slotOutput = "Bars ";
                    second = "Bars";
        }
            System.out.print(slotOutput);
        
        random = r.nextInt(5);
        switch(random){
            case 0: slotOutput = "Cherries \n";
                    third = "Cherries";
                break;
            case 1: slotOutput = "Oranges \n";
                    third = "Oranges";
                break;
            case 2: slotOutput = "Plums \n";
                    third = "Plums";
                break;
            case 3: slotOutput = "Bells \n";
                    third = "Bells";
                break;
            case 4: slotOutput = "Melons \n";
                    third = "Melons";
                break;
            default: slotOutput = "Bars \n";
                    third = "Bars";
        }
            System.out.print(slotOutput);
            
            if(!(first.equals(second)) && !(first.equals(third)) && !(second.equals(third))){
                System.out.println("You won $0");
            }else if(first.equals(second)){
                if(first.equals(third)){
                    int jackpot = money * 3;
                    System.out.println("You won $" + jackpot);
                }
            }else{
                int doubleMoney = money * 2;
                System.out.println("You won $" + doubleMoney);
            }
            if(first.equals(third)){
                if(first.equals(second)){
                    int jackpot = money * 3;
                    System.out.println("You won $ " + jackpot);
                }
                int doubleMoney = money * 2;
                System.out.println("You won $ " + doubleMoney);
            }else if(second.equals(third)){
                if(second.equals(first)){
                    int jackpot = money * 3;
                    System.out.println("You won $ " + jackpot);
                }
                int doubleMoney = money * 2;
                System.out.println("You won $ " + doubleMoney);
            }
    }

}
