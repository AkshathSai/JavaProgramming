package com.example.dev.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RichestCustomerWealth {

    public static void main(String[] args) {
        // 2 x 3 - 2 rows and 3 columns
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1}
        };

        RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();
        int maxWealth = richestCustomerWealth.maximumWealth(accounts);
        log.info("Maximum Wealth: {}", maxWealth);

        // 3 x 2 - 3 rows and 2 columns
        int[][] accounts2 = {
                {1,5},
                {7,3},
                {3,5}
        };
        log.info("Maximum Wealth: {}", richestCustomerWealth.maximumWealth(accounts2));
    }

    /**
     * Time Complexity - O (rows * cols) / O(i * j)
     * <p>
     *  Space Complexity - O(1)
     * </p>
     */
    public int maximumWealth(int[][] accounts) {
        //int[] wealth =new int[accounts.length];
        int maxWealth = 0;
        for(int i=0; i<accounts.length; i++) {
            int currentWealth = 0;
            for (int j=0; j<accounts[i].length; j++) {
                //wealth[i] += accounts[i][j];
                currentWealth += accounts[i][j];
               /* if (wealth[i] > maxWealth) {
                    maxWealth = wealth[i];
                }*/
                if (currentWealth > maxWealth) {
                    maxWealth = currentWealth;
                }
            }
        }
        //log.info("Wealths: {}", Arrays.toString(wealth));
        return maxWealth;
    }

    public int maximumWealth2(int[][] accounts) {
        int maxWealth=0;

        for (int[] customer: accounts) {
            int currentWealth=0;
            for (int bank: customer) {
                currentWealth += bank;
            }
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }

        return maxWealth;
    }
}
