/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 William Furie
 */

package base;

import java.util.Scanner;

public class Solution05 {
    /*
        print "What is the first number?"
        `numString1` = string that was read
        print "What is the second number?"
        `numString2` = string that was read

        `num1` = convert numString1 to int
        `num2` = convert numString2 to int

        `sum` = `num1` + `num2`
        `difference` = `num1` - `num2`
        `product` = `num1` * `num2`
        `quotient` = `num1` / `num2`

        `sumMsg` = `num1` + `num2` = `sum`
        `difMsg` = `num1` - `num2` = `difference`
        `prodMsg` = `num1` * `num2` = `product`
        `quoMsg` = `num1` / `num2` = `quotient`

        print `sumMsg`
              `difMsg`
              `prodMsg`
              `quoMsg`
     */

    public static void main(String[] args) {
        System.out.print("What is the first number? ");
        Scanner input = new Scanner(System.in);

        String numString1 = input.nextLine();
        System.out.print("What is the second number? ");
        String numString2 = input.nextLine();

        int num1 = Integer.parseInt(numString1);
        int num2 = Integer.parseInt(numString2);

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;

        String sumMsg = num1 + " + " + num2 + " = " + sum;
        String difMsg = num1 + " - " + num2 + " = " + difference;
        String prodMsg = num1 + " * " + num2 + " = " + product;
        String quoMsg = num1 + " / " + num2 + " = " + quotient;

        System.out.printf("%s%n%s%n%s%n%s%n", sumMsg, difMsg, prodMsg, quoMsg);
    }
}
