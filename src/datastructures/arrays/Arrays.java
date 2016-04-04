/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package datastructures.arrays;

/**
 *
 * @author Mazen
 */
public class Arrays {
  private Arrays() {};

  public static Object[] insert(Object[] original, int insertAtIndex, Object toInsert) throws IndexOutOfBoundsException {
    if (insertAtIndex > original.length)
      throw new IndexOutOfBoundsException();
    Object[] newArray = new Object[original.length + 1];
    int offset = 0;
    for (int i = 0; i < newArray.length; i++) {
      if (i == insertAtIndex) {
        offset = 1;
        newArray[i] = toInsert;
        continue;
      }
      newArray[i] = original[i - offset];
    }
    return newArray;
  }

  public static Object[] delete(Object[] original, int deleteAtIndex) throws IndexOutOfBoundsException {
    if (deleteAtIndex >= original.length)
      throw new IndexOutOfBoundsException();
    Object[] newArray = new Object[original.length - 1];
    int offset = 0;
    for (int i = 0; i < newArray.length; i++) {
      if (i == deleteAtIndex) {
        offset = 1;
        continue;
      }
      newArray[i] = original[i + offset];
    }
    return newArray;
  }

  public static int find(Object[] original, Object element) {
    for (int i = 0; i < original.length; i++) {
      if (element.equals(original[i])) {
        return i;
      }
    }
    return -1;
  }

  public static void update(Object[] original, int indexToUpdate, Object updateObject) throws IndexOutOfBoundsException {
    if (indexToUpdate >= original.length)
      throw new IndexOutOfBoundsException();
    original[indexToUpdate] = updateObject;

  }

}
