public class Dice {
    /*
     ******Breakdown******
     * Generate 2 random numbers between 2 - 12 (inclusive)
     * Add the random numbers to get the sum
     */
    private int sum;
    private int numDice;
    Dice(int numDice){
        this.numDice = numDice;
    }

    public int sumDice(){
        int sum = 0;
        for(int i = 0; i < numDice; i++){
            sum += getRandNum();
        }
        return sum;
    }

    public int getRandNum() {
        return (int) (Math.random() * (6 - 1) + 1);
    }


}
