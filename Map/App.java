package Map;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        
        Map<String,String> user = new HashMap<>();
    
        user.put("userName","Jack");
        user.put("role","Dev");
    
        System.out.println("User Map : " + user);
        System.out.println("User Map : " + user.get("role"));
    }

    
}
