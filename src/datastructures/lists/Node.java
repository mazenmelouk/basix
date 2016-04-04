/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package datastructures.lists;

/**
 *
 * @author Mazen
 */
public class Node {

  private String key;
  private Node next;

  public Node(String key) {
    this.key = key;
    next = null;
  }

  public Node(String key, Node next) {
    this.key = key;
    this.next = next;
  }

  public String getKey() {
    return key;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public void setKey(String key) {
    this.key = key;
  }

}
