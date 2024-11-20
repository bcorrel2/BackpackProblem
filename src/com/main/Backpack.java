package com.main;

import java.util.HashMap;

public class Backpack {

    /** Total Capacity of the Backpack **/
    private final Integer capacity;

    /** Current Capacity of the Backpack **/
    private Integer weight;

    /** Items Currently in the Bag and Their Quantity **/
    private final HashMap<String, Integer> items;

    /** This Constructor assumes the Minimum Capacity required for the Backpack is known before creation.
     *  capacity: max capacity of the backpack.
     *  minimumCapacity: minimum capacity required to fit 1 of every item in the bag.
     *  necessaryItems: the items that will fill the bag. A minimum of 1 of each item is required.
    **/
    public Backpack(int capacity, int minimumCapacity, HashMap<String, Integer> necessaryItems) {

        // Checks that Backpack is being declared with adequate Capacity.
        if (capacity < minimumCapacity) {
            throw new RuntimeException(String.format("Capacity of Backpack is insufficient to hold necessary items. " +
                    "Minimum Capacity is %d", minimumCapacity));
        } else {
            this.capacity = capacity;
            this.weight = 0;
            this.items = new HashMap<>();

            // Place one of each item in the Backpack
            necessaryItems.forEach((key, value) -> {
                items.put(key, 1);
                this.weight += value;
            });
        }
    }

    /** This Constructor is identical to the previous Constructor, with the caveat that this Constructor
     *  does Not Require the Minimum Capacity to be known. Calculating this value adds Complexity to the
     *  Application, but allows for a more dynamic set of Items to be used.
     *  capacity: max capacity of the backpack.
     *  necessaryItems: the items that will fill the bag. A minimum of 1 of each item is required.
     *  **/
    public Backpack(int capacity, HashMap<String, Integer> necessaryItems) {

        // Sum Minimum Required Capacity
        int minimumCapacity = necessaryItems.values().stream().mapToInt(Integer::intValue).sum();

        // Checks that Backpack is being declared with adequate Capacity.
        if (capacity < minimumCapacity) {
            throw new RuntimeException(String.format("Capacity of Backpack is insufficient to hold necessary items. " +
                    "Minimum Capacity is %d", minimumCapacity));
        } else {
            this.capacity = capacity;
            this.weight = 0;
            this.items = new HashMap<>();

            // Place one of each item in the Backpack
            necessaryItems.forEach((key, value) -> {
                items.put(key, 1);
                this.weight += value;
            });
        }
    }

    /** Adds an Item to the Backpack and updates the Weight accordingly **/
    public void addItem(String itemName, int weight) {
        if(items.containsKey(itemName)) {
            this.items.put(itemName, items.get(itemName) + 1);
            this.weight += weight;
        } else {
            this.items.put(itemName, 1);
        }
    }

    /** Prints contents of Backpack **/
    public void printContents() {
        this.items.forEach((key, value) -> System.out.println("Item: " + key + ", Count: " + value));
    }

    public Integer getTotalCapacity() {
        return this.capacity;
    }

    public Integer getCurrentWeight() {
        return this.weight;
    }

    public Integer getRemainingCapacity() {
        return this.capacity - this.weight;
    }

    public HashMap<String, Integer> getItems() {
        return this.items;
    }

    public int getCount(String itemName) {
        return this.items.get(itemName);
    }
}
