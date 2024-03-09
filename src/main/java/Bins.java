import java.util.HashMap;
import java.util.Map;

public class Bins {

    Map<Integer, Integer> rolls = new HashMap<>();
    int minRoll, maxRoll;

    Bins(int minRoll, int maxRoll){
        this.minRoll = minRoll;
        this.maxRoll = maxRoll;
        setupMap();
    }

    public void setupMap(){
        for(int i = minRoll; i <= maxRoll; i++){
            rolls.put(i, 0);
        }
    }

    public int getBin(int num){
        return rolls.get(num);
    }

    public void incrementBin(int num){
        int oldVal = getBin(num);
        rolls.replace(num, oldVal + 1);
    }
    
    

}
