/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.tree;

/**
 *
 * @author Mazen
 */
public class BSTNode {

  private Integer data;
  private BSTNode left;
  private BSTNode right;  

  public BSTNode(Integer data, BSTNode left, BSTNode right) {
    this.data = data;
    this.left = left;
    this.right = right;
  }

  public BSTNode(Integer data) {
    this(data, null, null);
  }

  public Integer getData() {
    return data;
  }

  public void setData(Integer data) {
    this.data = data;
  }

  public BSTNode getLeft() {
    return left;
  }

  public void setLeft(BSTNode left) {
    this.left = left;
  }

  public BSTNode getRight() {
    return right;
  }

  public void setRight(BSTNode right) {
    this.right = right;
  }  
  
}
