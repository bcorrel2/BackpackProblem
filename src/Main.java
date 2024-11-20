import java.util.HashMap;

import com.main.Backpack;
import com.main.Service;

public class Main {
    public static void main(String[] args) {

        System.out.println("Initializing Run of PowerReviews Backend Code Test");

        // CONFIGURE CAPACITY HERE
        final int capacity = 27;

        // CONFIGURE ITEMS HERE
        HashMap<String, Integer> items = new HashMap<String, Integer>() {{
            put("Bag of Apples", 5);
            put("Bread", 1);
            put("Peanut Butter", 2);
            put("Trail Mix", 3);
        }};

        Backpack backpack = Service.fillBackpackToCapacity(capacity, items);
        if (backpack != null) {
            // Print Results
            backpack.printContents();
        }

    }
}