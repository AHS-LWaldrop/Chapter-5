/**
 * Lucas Waldrop
 * CH5PC6
 * Computer Science III - AP CS
 * 11/28/18
 */

public class PopulationScale {
    
    private int startingNum;
    private double dayPopInc;
    private int days;
    
    public PopulationScale(int SN, int DPI, int D){
        startingNum = SN;
        dayPopInc = DPI;
        days = D;
    }
    
    public void populationMultiplication(){
        dayPopInc = dayPopInc / 100;
        int count = 0;
        int countDay = 0;
        while(count <= days){
            countDay++;
            count++;
            System.out.println("Day " + countDay + ": " + startingNum);
            double addedPop = startingNum * dayPopInc;
            startingNum += addedPop;
        }
    }
}