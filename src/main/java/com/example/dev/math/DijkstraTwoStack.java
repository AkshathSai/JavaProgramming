package com.example.dev.math;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;
import java.util.Stack;

/**
 * Dijkstra's Two Stack Algorithm for evaluating expressions.
 * This implementation uses two stacks: one for values and one for operations.
 * It processes an infix expression and computes the result.
 */

@Slf4j
public class DijkstraTwoStack {

    public static void main(String[] args) {
        Stack<Double> values = new Stack<>();
        Stack<Character> operations = new Stack<>();

        Scanner sc = new Scanner(System.in);
        log.info("Enter the infinix expression");
        String infixExpr = sc.nextLine();

        if (!infixExpr.isEmpty()) {
            for (int i = 0; i < infixExpr.length(); i++) {
                char ch = infixExpr.charAt(i);

                // Skip whitespace
                if (Character.isWhitespace(ch)) {
                    continue;
                }

                if (Character.isDigit(ch) || ch == '.') {
                    // Parse the number which could be multiple characters
                    StringBuilder sb = new StringBuilder();
                    while (i < infixExpr.length() &&
                            (Character.isDigit(infixExpr.charAt(i)) || infixExpr.charAt(i) == '.')) {
                        sb.append(infixExpr.charAt(i));
                        i++;
                    }
                    // Step back one position as the outer loop will increment i
                    i--;
                    values.push(Double.parseDouble(sb.toString()));
                } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                    operations.push(ch);
                } else if (ch == '(') {
                    // Just ignore left parenthesis
                }  else if (ch == ')') {
                    // Pop 2 values
                    // apply the popped operand
                    // and push the result into the value stack
                    Double value1 = values.pop();
                    Double value2 = values.pop();
                    Character operation = operations.pop();
                    switch (operation) {
                        case '+': values.push(value1 + value2); break;
                        case '-': values.push(value1 - value2); break;
                        case '*': values.push(value1 * value2); break;
                        case '/': values.push(value1 / value2); break;
                    }
                }
            }
        }


        // Print the result
        if (!values.isEmpty()) {
            log.info("Result: {}", values.pop());
        } else {
            log.info("No result calculated");
        }
        sc.close();
    }

}
