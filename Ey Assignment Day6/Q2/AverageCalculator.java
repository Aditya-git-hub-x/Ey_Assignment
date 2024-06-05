package com.ey.exceptions;

public class AverageCalculator {
    public double calAverage(int n) {
        try {
			if (n <= 0) {
			    throw new IllegalArgumentException("n must be a positive integer.");
			}
			else {
				int sum = (n * (n + 1)) / 2;
		        double average = (double) sum / n;
		        System.out.println("Average of first " + n + " natural numbers: " + average);
		        
		        return average;
			}
		
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return 0;
        
    }

    public static void main(String[] args) {
        AverageCalculator calculator = new AverageCalculator();
        
        int n = 5;
        double average = calculator.calAverage(n);
        n = -2;
        average = calculator.calAverage(n); 
    }
}

