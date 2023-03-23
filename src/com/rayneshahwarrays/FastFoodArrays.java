package com.rayneshahwarrays;

public class FastFoodArrays {

    public static void main(String[] args){
        /*
        What is the cheapest meal?
         */
        // array created
        final Double[] foodPricesMenu = {8.49, 1.99, 4.44, 9.99, 5.50};

        // lowestMeal variable created

        double lowestMeal = foodPricesMenu[0];

        //comparing elements in the array
        for(double prices : foodPricesMenu){
            if(lowestMeal > prices)
                lowestMeal = prices;
        }

        System.out.println("Lowest amount is: " + lowestMeal);


        /*
        What is the average price of the menu items?

        To calculate the average, we need to first calculate the sum of all elements in the array. This is
        done using a for-each loop
        finally we calculate the average by the formula

                    average = sum of numbers / total count
         */

        double sum = 0.0;

        for(double avgMealPrice : foodPricesMenu){
            sum += avgMealPrice;
        }
        double average = sum / foodPricesMenu.length;
        System.out.println("The average meal price is: " + average);


    }
}
