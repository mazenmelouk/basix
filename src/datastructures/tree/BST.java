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
public class BST {
  private final BSTNode root;

  public BST(BSTNode root) throws NullPointerException {
    if (root == null) {
      throw new NullPointerException("Root cannot be null !");
    }
    this.root = root;
  }

  public BSTNode getRoot() {
    return root;
  }  
  
}
