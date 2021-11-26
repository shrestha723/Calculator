package com.company;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
                System.out.println("Mini Project made by Shrestha Thakur");
                System.out.println();
                Scanner sc = new Scanner(System.in);
                //Take input from user till the user does not press S or s
                int ans = 0;

                while (true) {
                    System.out.println("Enter the operator"); // if this is written before only onnce operator can be taken
                    // take the operator as input
                    char op = sc.next().trim().charAt(0);

                    if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                        System.out.println("Enter  first number");
                        System.out.println("Enter second number");
                        int num1 = sc.nextInt();
                        int num2 = sc.nextInt();

                        if (op == '+') {    // "==" checks whether the operator is add,substract,etc
                            ans = num1 + num2;
                        }
                        if (op == '-') {
                            if (num1>num2) {
                                ans = num1 - num2;
                            }
                        }
                        if (op == '*') {
                            ans = num1 * num2;
                        }
                        if (op == '/') {
                            if (num2 != 0) {
                                ans = num1 / num2;
                            }
                        }
                        if (op == '%') {
                            ans = (num1 % num2);
                        }
                    }
                else if (op == 's' || op == 'S') {
                        break;
                    } else {
                        System.out.println("Invalid operators");
                    }
                    System.out.println(ans);
                }
            }
        }
