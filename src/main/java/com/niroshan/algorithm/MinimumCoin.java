package com.niroshan.algorithm;

import java.util.Arrays;

public class MinimumCoin {

    public static void main(String[] args) {
        int[] coins = {1,2};
        System.out.println(coinChange(coins,3));

    }

    public static int coinChange(int[] coins, int amountWeNeed) {
        int[] dp = new int[amountWeNeed+1];
        Arrays.fill(dp, amountWeNeed+1);

        dp[0] = 0;

        for(int currentAmount = 1; currentAmount <= amountWeNeed; currentAmount++) { // get the each amount till the amount we need
            for(int coin : coins) { // get each coin in the available array
                int difference = currentAmount - coin; // get the difference between current amount and coin
                if( difference >= 0) { // if difference is higher than or equal zero we can use that coin else we can't use that cooin
                    int exitingMinimumCoin = dp[currentAmount];
                    int currentCoinAndCoinsInDifference = dp[difference] +1;
//                    int minimumCoinNeeded = Math.min()
                    dp[currentAmount] = Math.min(exitingMinimumCoin, currentCoinAndCoinsInDifference); // set how many minimum coins are needed in the array for each amount
                }
            }
        }

        if(dp[amountWeNeed] != amountWeNeed +1)
            return dp[amountWeNeed];
        else
            return -1;

    }
}
