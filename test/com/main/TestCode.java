package com.main;

import org.junit.jupiter.api.Test;
import java.util.HashMap;

public class TestCode {

    HashMap<String, Integer> items = new HashMap<String, Integer>() {{
        put("Bag of Apples", 5);
        put("Bread", 1);
        put("Peanut Butter", 2);
        put("Trail Mix", 3);
    }};

    @Test
    public void test27() {
        System.out.println("TEST SCENARIO: Capacity is 27");

        Backpack backpack = Service.fillBackpackToCapacity(27, items);
        assert backpack != null;
        backpack.printContents();

        assert backpack.getCount("Bag of Apples") == 4;
        assert backpack.getCount("Bread") == 2;
        assert backpack.getCount("Peanut Butter") == 1;
        assert backpack.getCount("Trail Mix") == 1;
        System.out.println("SUCCESS\n");
    }

    @Test
    public void test38() {
        System.out.println("TEST SCENARIO: Capacity is 38");

        Backpack backpack = Service.fillBackpackToCapacity(38, items);
        assert backpack != null;
        backpack.printContents();

        assert backpack.getCount("Bag of Apples") == 6;
        assert backpack.getCount("Bread") == 1;
        assert backpack.getCount("Peanut Butter") == 2;
        assert backpack.getCount("Trail Mix") == 1;
        System.out.println("SUCCESS\n");
    }

    @Test
    public void test15() {
        System.out.println("TEST SCENARIO: Capacity is 15");

        Backpack backpack = Service.fillBackpackToCapacity(15, items);
        assert backpack != null;
        backpack.printContents();

        assert backpack.getCount("Bag of Apples") == 1;
        assert backpack.getCount("Bread") == 2;
        assert backpack.getCount("Peanut Butter") == 1;
        assert backpack.getCount("Trail Mix") == 2;
        System.out.println("SUCCESS\n");
    }

    @Test
    public void test10() {
        System.out.println("TEST SCENARIO: Capacity is 10, Invalid Capacity");

        Backpack backpack = Service.fillBackpackToCapacity(10, items);
        assert backpack == null;
        System.out.println("SUCCESS\n");
    }

}