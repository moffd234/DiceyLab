import org.junit.Assert;
import org.junit.Test;

public class BinsTest {
    @Test
    public void testSetupMap(){
        int minNum = 2;
        int maxNum = 12;
        Bins bins = new Bins(minNum, maxNum);

        for(int i = minNum; i <= maxNum; i++){
            Assert.assertTrue(bins.rolls.containsKey(i));
            Assert.assertEquals(0, (int) bins.rolls.get(i));
        }
    }

    @Test
    public void testSetupMap1(){
        int minNum = 5;
        int maxNum = 30;
        Bins bins = new Bins(minNum, maxNum);

        for(int i = minNum; i <= maxNum; i++){
            Assert.assertTrue(bins.rolls.containsKey(i));
            Assert.assertEquals(0, (int) bins.rolls.get(i));
        }
    }

    @Test
    public void testGetBin(){
        int minNum = 2;
        int maxNum = 12;
        Bins bins = new Bins(minNum, maxNum);

        int expected = 0;
        int actual = bins.getBin(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetBin1(){
        int minNum = 5;
        int maxNum = 30;
        Bins bins = new Bins(minNum, maxNum);

        int expected = 0;
        int actual = bins.getBin(25);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetBinAfterIncrement(){
        int minNum = 2;
        int maxNum = 12;
        Bins bins = new Bins(minNum, maxNum);

        int expected = 1;
        bins.incrementBin(minNum);
        int actual = bins.getBin(minNum);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetBinAfterIncrement1(){
        int minNum = 5;
        int maxNum = 30;

        int expected = 1;
        Bins bins = new Bins(minNum, maxNum);

        bins.incrementBin(minNum);
        int actual = bins.getBin(minNum);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIncrementBin(){

        int minNum = 2;
        int maxNum = 12;
        Bins bins = new Bins(minNum, maxNum);
        int expected = 1;

        bins.incrementBin(minNum);
        int actual = bins.getBin(minNum);

        Assert.assertEquals(expected, actual);
    }
}
