package com.niroshan.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KnapsackAlgo {
    public static void main(String[] args) {
        Item item1 = new Item(5,60);
        Item item2 = new Item(3,50);
        Item item3 = new Item(4,70);
        Item item4 = new Item(2,30);

        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
//        itemList.add(item2);
//        itemList.add(item3);
        itemList.add(item4);

        System.out.println(optimumSubjectToCapacity(itemList,2));

    }

    public static class Item {
        public Integer weight;
        public Integer value;

        public Item(Integer weight, Integer value) {
            this.weight = weight;
            this.value = value;
        }
    }
    public static int optimumSubjectToCapacity(List<Item> items,int capacity){
        int[][] V = new int[items.size()][capacity + 1];
        for(int[] v: V) {
            Arrays.fill(v, -1);
        }
        return optimumSubjectToItemAndCapacity(items, items.size()-1, capacity, V);
    }

    private static int optimumSubjectToItemAndCapacity(List<Item> items, int k, int avaiableCapacity, int[][] V) {
        if(k < 0) {
            return 0;
        }

        if(V[k][avaiableCapacity] == -1) {
            int withoutCurrentItem = optimumSubjectToItemAndCapacity(items,k-1, avaiableCapacity, V);

            int withCurrentItem =  0 ;
            if(avaiableCapacity >= items.get(k).weight ) {
                withCurrentItem = items.get(k).value + optimumSubjectToItemAndCapacity(
                        items, k - 1, avaiableCapacity - items.get(k).weight, V);
            }
            V[k][avaiableCapacity] = Math.max(withoutCurrentItem,withCurrentItem);
        }
        return V[k][avaiableCapacity];
    }
}
