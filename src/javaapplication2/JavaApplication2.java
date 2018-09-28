/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 * @
 * @author student
 */
public class JavaApplication2 {
    
    /**
    *This method doesn't return anything
    *Print Hello world
    **/
    
    public static void Hello() {
        System.out.println("Hello Jom!");

    }
    
    /** 
    * This method returns the sum of 2 numbers
    * @param x accepts the first input
    * @param y accepts the second input
    * @return sum - the sum of the two input
    **/
    
    public static int sum(int x, int y) {
        int sum = x + y;
        
        return sum;
    }
    
    /**
     * Shows the power of a base depending on it's exponent without recursion
     * @param base The input to be multiplied by itself
     * @param exponent The input to tell how many times the base to multiplied by itself
     * @return pow_product The product of the power method
     */
    
    public static double power(double base, double exponent) {
        double pow_product = base;
        
        for(int i = 1; i < exponent; i++) {
            pow_product = pow_product * base;
        }
        
        return pow_product;
    }
    
    /**
     * Shows the power of a base depending on it's exponent with recursion
     * @param base The input to be multiplied by itself
     * @param exponent The input to tell how many times the base to multiplied by itself
     * @return base * powerRecursion(base,exponent-1)
     */
    
    public static double powerRecursion(double base, double exponent) {
       
       if(exponent == 1) return base;
       if(exponent == 0) return 1.0;
       else {
          return base * powerRecursion(base,exponent-1); 
       }
    }
    
    public static void main(String[] args) {
        Hello();
        System.out.println(sum(4,5));
        System.out.println(power(2,4));
        System.out.println(powerRecursion(2,4));
    }

}
