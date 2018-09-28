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
    
    public static void main(String[] args) {
        Hello();
        sum(4,2);
    }

}
