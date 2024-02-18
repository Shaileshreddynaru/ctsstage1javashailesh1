import java.util.HashMap;

public class UserMainCode {
    
    public static int sizeOfResultandHashMap(HashMap<Integer,String> hm) {
        
        //fill the code
        hm.entrySet().removeIf(entry -> entry.getKey() %4 == 0);
        return hm.size();
    
    }
    
}

