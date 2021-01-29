package com.company;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {1.23, -2.24, 3.25, 4.26, -5.27, 6.28, 7.29, 8.30, -9.31, 10.32, 11.33, -12.34, 13.35, 14.36, -15.37,};
        double sum = 0;
        double col = 0;
        boolean k = false;
        for (double num : numbers) {
            if (num < 0) {
                k = true;
                //System.out.println(num);
            } else {
                sum += num;
                col++;
                //System.out.println(sum);
            }

        }
        System.out.println(sum / col); //sum 7.977


    }
}
