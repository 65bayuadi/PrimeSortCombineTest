package com.pandaways.kitabisa.helper;

import java.util.*;

public class MockBuilder {

    public static List<Integer> realNumber() {
        return Arrays.asList(4, 3, 6, 5, 1, 2);
    }

    public static List<Integer> negativeNumber() {
        return Arrays.asList(4, 3, 6, -5, 1, -2);
    }

    public static List<String> upperCaseAlphabet() {
        return Arrays.asList("F", "C", "D", "B", "A");
    }

    public static List<String> containEmptyAlphabet() {
        return Arrays.asList("", "C", "D", "B", "A");
    }

    public static List<Map<Integer, String>> mockSortCombine() {
        List<Map<Integer, String>> values = new ArrayList<>();
        Map<Integer, String> helper = new HashMap<>();
        helper.put(1, "A");
        values.add(helper);
        helper = new HashMap<>();
        helper.put(2, "B");
        values.add(helper);
        helper = new HashMap<>();
        helper.put(3, "C");
        values.add(helper);
        helper = new HashMap<>();
        helper.put(4, "D");
        values.add(helper);
        helper = new HashMap<>();
        helper.put(5, "F");
        values.add(helper);
        helper = new HashMap<>();
        helper.put(6, null);
        values.add(helper);
        return values;
    }

    public static List<Map<Integer, String>> mockSortCombineNullNumber() {
        List<Map<Integer, String>> values = new ArrayList<>();
        Map<Integer, String> helper = new HashMap<>();
        helper.put(null, "A");
        values.add(helper);
        helper = new HashMap<>();
        helper.put(null, "B");
        values.add(helper);
        helper = new HashMap<>();
        helper.put(null, "C");
        values.add(helper);
        helper = new HashMap<>();
        helper.put(null, "D");
        values.add(helper);
        helper = new HashMap<>();
        helper.put(null, "F");
        values.add(helper);
        return values;
    }

    public static List<Map<Integer, String>> mockSortCombineNullString() {
        List<Map<Integer, String>> values = new ArrayList<>();
        Map<Integer, String> helper = new HashMap<>();
        helper.put(1, null);
        values.add(helper);
        helper = new HashMap<>();
        helper.put(2, null);
        values.add(helper);
        helper = new HashMap<>();
        helper.put(3, null);
        values.add(helper);
        helper = new HashMap<>();
        helper.put(4, null);
        values.add(helper);
        helper = new HashMap<>();
        helper.put(5, null);
        values.add(helper);
        helper = new HashMap<>();
        helper.put(6, null);
        values.add(helper);
        return values;
    }

    public static List<Map<Integer, String>> mockSortCombineNegativeNumber() {
        List<Map<Integer, String>> values = new ArrayList<>();
        Map<Integer, String> helper = new HashMap<>();
        helper.put(-5, "A");
        values.add(helper);
        helper = new HashMap<>();
        helper.put(-2, "B");
        values.add(helper);
        helper = new HashMap<>();
        helper.put(1, "C");
        values.add(helper);
        helper = new HashMap<>();
        helper.put(3, "D");
        values.add(helper);
        helper = new HashMap<>();
        helper.put(4, "F");
        values.add(helper);
        helper = new HashMap<>();
        helper.put(6, null);
        values.add(helper);
        return values;
    }

    public static List<Map<Integer, String>> mockSortCombineContainEmptyString() {
        List<Map<Integer, String>> values = new ArrayList<>();
        Map<Integer, String> helper = new HashMap<>();
        helper.put(1, "");
        values.add(helper);
        helper = new HashMap<>();
        helper.put(2, "A");
        values.add(helper);
        helper = new HashMap<>();
        helper.put(3, "B");
        values.add(helper);
        helper = new HashMap<>();
        helper.put(4, "C");
        values.add(helper);
        helper = new HashMap<>();
        helper.put(5, "D");
        values.add(helper);
        helper = new HashMap<>();
        helper.put(6, null);
        values.add(helper);
        return values;
    }
}
