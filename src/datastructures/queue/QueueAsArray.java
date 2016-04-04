/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package datastructures.queue;

/**
 *
 * @author Mazen
 */
public class QueueAsArray {

  private static final int MAX_SIZE = 4;
  private final int[] queue = new int[MAX_SIZE];
  private int headIndex = 0;
  private int tailIndex = -1;

  public boolean isEmpty() {
    return headIndex > tailIndex;
  }

  public boolean isFull() {

    return tailIndex - headIndex == MAX_SIZE - 1;
  }

  public void enqueue(int element) {
    if (!isFull()) {
      tailIndex++;

      queue[tailIndex % MAX_SIZE] = element;

    }
  }

  public int dequeue() {
    if (!isEmpty()) {
      headIndex++;
      int element = queue[headIndex % MAX_SIZE];
      return element;
    }
    throw new IndexOutOfBoundsException();
  }

}
