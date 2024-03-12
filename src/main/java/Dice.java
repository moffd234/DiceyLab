public class Dice {
    /*
     ******Breakdown******
     * Generate 2 random numbers between 2 - 12 (inclusive)
     * Add the random numbers to get the sum
     */

    private int numDice;
    private int minRoll;
    private int maxRoll;
    Dice(int numDice){
        this.numDice = numDice;
    }

    public int tossAndSum(){
        int sum = 0;
        for(int i = 0; i < numDice; i++) {
            int randomNum = getRandNum();

            sum += randomNum;
        }
        // System.out.println(sum);
        return sum;
    }

    public int getRandNum() {
        int num = (int) ((Math.random() * 6) + 1);
        return num;
    }


}
