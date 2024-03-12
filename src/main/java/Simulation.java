import java.util.ArrayList;
import java.util.Arrays;

public class Simulation {
    int numberOfDies, numberOfTosses, minRoll, maxRoll;
    Dice dice;
    Bins bins;
    Simulation(int numberOfDies, int numberOfTosses){
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        minRoll = numberOfDies;
        maxRoll = numberOfDies * 6;
        dice = new Dice(numberOfDies);
        bins = new Bins(minRoll, maxRoll);
    }

    public void runSimulation(){
        for(int i = 0; i < numberOfTosses; i++){
            int sumOfDice = dice.tossAndSum();
            bins.incrementBin(sumOfDice);
        }
    }

    public void printResults(){
        System.out.println("***\n" + "Simulation of 2 dice tossed for 1000000 times.\n" + "***");

        for(int i = minRoll; i <= maxRoll; i++){
            int numOccurrences = getNumOccurrences(i);
            double occurrenceRate = getOccurrenceRate(i);
            String asterisk = "";
            for(int j = 0; j < numOccurrences / 10000; j++){
                asterisk += "*";
            }
            //Arrays.fill(asterisk,"*");
            System.out.printf("%2d %9d %s %.2f %s",
                    i, numOccurrences, ": ", occurrenceRate, " " + asterisk + "\n");
        }
    }

    public Double getOccurrenceRate(int rollNum){
        return ((double) getNumOccurrences(rollNum)) / ((double) numberOfTosses);
    }

    public int getNumOccurrences(int rollNum){
        return bins.getBin(rollNum);
    }


    public static void main(String[] args){
        Simulation sim = new Simulation(2, 1000000);

        sim.runSimulation();

        sim.printResults();
    }


}
