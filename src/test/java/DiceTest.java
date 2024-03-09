

import org.junit.Assert;
import org.junit.Test;

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
        int roll = dice.sumDice();
        boolean isInRange = roll >= 2 && roll <= 12;
        Assert.assertTrue(isInRange);
    }

    @Test
    public void testSumDice1(){
        Dice dice = new Dice(5);
        int roll = dice.sumDice();
        boolean isInRange = roll >= 5 && roll <= 30;
        Assert.assertTrue(isInRange);
    }

    @Test
    public void testSumDice2(){
        Dice dice = new Dice(3);
        int roll = dice.sumDice();
        boolean isInRange = roll >= 3 && roll <= 18;
        Assert.assertTrue(isInRange);
    }


}
