/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package datastructures.lists;

/**
 *
 * @author Mazen
 */
public class Lists {
  private Lists() {}

  public static void append(Node head, Node end) {

    Node current = head;
    while (current.getNext() != null) {
      current = current.getNext();
    }
    current.setNext(end);

  }

  public static void delete(Node head, String key) {
    Node current = head;
    while (current.getNext() != null) {
      Node next = current.getNext();
      if (next.getKey().equals(key)) {
        current.setNext(next.getNext());
        break;
      }
      current = current.getNext();
    }

  }

  public static void print(Node head) {
    Node current = head;
    while (current != null) {
      System.out.print(current.getKey() + ".");
      current = current.getNext();
    }
    System.out.println();
  }

}
