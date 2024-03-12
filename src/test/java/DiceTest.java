

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @author leon on 4/19/18.
 */
public class DiceTest {

    @Test
    public void testRandomNum(){
        Dice dice = new Dice(2);
        int roll = dice.getRandNum();
        boolean isInRange = roll >= 1 && roll <= 6;
        Assert.assertTrue(isInRange);
    }

    @Test
    public void testSumDice(){
        Dice dice = new Dice(2);
        int roll = dice.tossAndSum();
        boolean isInRange = roll >= 2 && roll <= 12;
        Assert.assertTrue(isInRange);
    }

    @Test
    public void testSumDice1(){
        Dice dice = new Dice(5);
        int roll = dice.tossAndSum();
        boolean isInRange = roll >= 5 && roll <= 30;
        Assert.assertTrue(isInRange);
    }

    @Test
    public void testSumDice2(){
        Dice dice = new Dice(3);
        int roll = dice.tossAndSum();
        boolean isInRange = roll >= 3 && roll <= 18;
        Assert.assertTrue(isInRange);
    }

    @Test
    public void testSumDiceWithForLoop(){
        Dice dice = new Dice(2);
        ArrayList<Integer> results = new ArrayList<>();

        for(int i = 0; i < 500; i++){
            results.add(dice.tossAndSum());
        }

        for(int i = 2; i <= 12; i++){

            System.out.println(i);
            Assert.assertNotEquals(-1, results.indexOf(i));
        }
    }

    @Test
    public void testSumDiceWithForLoop1(){
        Dice dice = new Dice(5);
        ArrayList<Integer> results = new ArrayList<>();


        for(int i = 0; i < 1000000; i++){
            results.add(dice.tossAndSum());
        }

        for(int i = 5; i <= 30; i++){
            System.out.println(i);

            Assert.assertNotEquals(-1, results.indexOf(i));
        }
    }


}
