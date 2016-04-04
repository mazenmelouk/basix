/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package datastructures.stack;

/**
 *
 * @author Mazen
 */
public class Stack {

  private static final int MAX_SIZE = 100;
  private final int[] stack = new int[MAX_SIZE];
  private int top = 0;

  public boolean isEmpty() {
    return top == 0;
  }

  public boolean isFull() {
    return top == MAX_SIZE - 1;
  }

  public void push(int element) throws IndexOutOfBoundsException {
    if (isFull()) {
      throw new IndexOutOfBoundsException();
    }
    stack[++top] = element;
  }

  public int pop() throws IndexOutOfBoundsException {
    if (isEmpty()) {
      throw new IndexOutOfBoundsException();
    }
    return stack[top--];
  }

}
