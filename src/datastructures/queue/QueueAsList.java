/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package datastructures.queue;

import datastructures.lists.Node;

/**
 *
 * @author Mazen
 */
public class QueueAsList {

  private Node head = null;
  private Node tail = null;

  public boolean isEmpty() {
    return head == null;
  }

  public void enqueue(Node n) {
    if (isEmpty()) {
      head = n;
      tail = n;
    } else {
      tail.setNext(n);
      tail = n;
    }
  }

  public Node dequeue() {
    if (!isEmpty()) {
      Node turnOn = head;
      head = turnOn.getNext();
      turnOn.setNext(null);
      return turnOn;
    }
    throw new IndexOutOfBoundsException();
  }

}
