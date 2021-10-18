package com.niroshan.algorithm;

import java.util.ArrayList;
import java.util.List;

public class KnapsackGreedy {
    public static void main(String[] args) throws IllegalAccessException {
        int capacity = 10;
        int[] V = {1, 4, 8, 5};
        int[] W = {3, 3, 5, 6};
        System.out.println(knapsack(capacity, W, V));
    }


    public static int knapsack(int capacity, int[] W, int[] V) {

        if (W == null || V == null || W.length != V.length || capacity < 0)
            throw new IllegalArgumentException("Invalid input");

        final int N = W.length;

        // Initialize a table where individual rows represent items
        // and columns represent the weight of the knapsack
        int[][] DP = new int[N + 1][capacity + 1];

        for (int i = 1; i <= N; i++) {

            // Get the value and weight of the item
            int weight = W[i - 1], value = V[i - 1];

            for (int sz = 1; sz <= capacity; sz++) {

                // Consider not picking this element
                DP[i][sz] = DP[i - 1][sz];

                // Consider including the current element and
                // see if this would be more profitable
                if (sz >= weight && DP[i - 1][sz - weight] + value > DP[i][sz]) DP[i][sz] = DP[i - 1][sz - weight] + value;
            }
        }

        int sz = capacity;
        List<Integer> itemsSelected = new ArrayList<>();

        // Using the information inside the table we can backtrack and determine
        // which items were selected during the dynamic programming phase. The idea
        // is that if DP[i][sz] != DP[i-1][sz] then the item was selected
        for (int i = N; i > 0; i--) {
            if (DP[i][sz] != DP[i - 1][sz]) {
                int itemIndex = i - 1;
                itemsSelected.add(itemIndex);
                sz -= W[itemIndex];
            }
        }

        // Return the items that were selected
        // java.util.Collections.reverse(itemsSelected);
        // return itemsSelected;

        // Return the maximum profit
        return DP[N][capacity];
    }
}
