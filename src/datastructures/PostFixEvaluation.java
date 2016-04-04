/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package datastructures;

import datastructures.stack.Stack;

/**
 *
 * @author Mazen
 */
public class PostFixEvaluation {
  private static Stack s;

  private static int performOperation(char c) throws IndexOutOfBoundsException, UnsupportedOperationException {
    if (s.isEmpty()) {
      throw new IndexOutOfBoundsException();
    }
    int op2 = s.pop();
    if (s.isEmpty()) {
      throw new IndexOutOfBoundsException();
    }
    int op1 = s.pop();
    switch (c) {
      case '+':
        return op1 + op2;
      case '-':
        return op1 - op2;
      case '*':
        return op1 * op2;
      case '/':
        return op1 / op2;
      default:
        throw new UnsupportedOperationException();
    }
  }

  private PostFixEvaluation() {}

  private static boolean isOperator(char c) {
    return c == '+' || c == '-' || c == '*' || c == '/';
  }

  public static int evaluate(String expression) throws InternalError {
    s = new Stack();
    char[] charArr = expression.toCharArray();
    for (char c : charArr) {
      int result = c - '0';
      if (isOperator(c)) {
        result = performOperation(c);

      }
      s.push(result);
    }
    if (s.isEmpty()) {
      throw new InternalError();
    }
    int result = s.pop();
    if (!s.isEmpty()) {
      throw new InternalError();
    }
    return result;
  }

}
