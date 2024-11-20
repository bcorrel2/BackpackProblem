package com.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Service {

    /** Function for filling a Backpack with the fewest possible items.
     *  capacity: max capacity of the backpack.
     *  items: the items that will fill the bag.
     * **/
    public static Backpack fillBackpackToCapacity(int capacity, HashMap<String, Integer> items) {
        try {
            // Create Backpack of specified Capacity with necessary Items
            Backpack backpack = new Backpack(capacity, items);

            // Sort necessary Item list from heaviest to lightest
            List<HashMap.Entry<String, Integer>> list = new ArrayList<>(items.entrySet());
            list.sort((weight1, weight2) -> weight2.getValue().compareTo(weight1.getValue()));

            // Add Items to Backpack until Capacity is full
            list.forEach(item -> {
                while (backpack.getRemainingCapacity() >= item.getValue()) {
                    backpack.addItem(item.getKey(), item.getValue());
                }
            });

            return backpack;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
