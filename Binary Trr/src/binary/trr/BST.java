/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.trr;

/**
 *
 * @author USER
 */
public class BST<E extends Comparable<E>> implements Tree<E> {
  protected TreeNode<E> root;
  protected int size = 0;
  protected TreeNode<E> revenue;
  static final int COUNT=10;

  /** Create a default binary tree */
  public BST() {
  }

  /** Create a binary tree from an array of objects
     * @param objects */
  public BST(E[] objects) {
    for (int i = 0; i < objects.length; i++)
      add(objects[i]);
  }

  @Override /** Returns true if the element is in the tree */
  public boolean search(E e) {
    TreeNode<E> current = root; // Start from the root
    while (current != null) {
        if (current.left==null) {
          current = current.left;
        }
        else if (current.right==null) {
          current = current.right;
        }
        else if(size==17||size==18){
          current = current.left.left.right;  
        }
        else if(size==15||size==16){
          current = current.left.left.left;  
        }
        else if(size==13||size==14){
          current = current.right.right;  
        }
        else if(size==11||size==12){
          current = current.right.left;  
        }
        else if(size==9||size==10){
          current = current.left.right;  
        }
        else if(size==7||size==8){
          current = current.left.left;  
        }
        
        else if(size==5||size==6){
         current = current.right;
        }
        else if (size==3||size==4){
         current = current.left;
        }
        else// element matches current.element
        return true; // Element is found
    }

    return false;
  }

  @Override /** Insert element e into the binary tree
   * Return true if the element is inserted successfully */
  public boolean insert(E e) {
    if (root == null)
      root = createNewNode(e); // Create a new root
    else {
      // Locate the parent node
      TreeNode<E> parent = null;
      TreeNode<E> current = root;
      double count=0;
      while (current != null)
        if (current.left==null) {
          parent = current;
          current = current.left;
        }
        else if (current.right==null) {
          parent = current;
          current = current.right;
        }
        else if(size==17||size==18){
          parent = current;
          current = current.left.left.right;  
        }
        else if(size==15||size==16){
          parent = current;
          current = current.left.left.left;  
        }
        else if(size==13||size==14){
          parent = current;
          current = current.right.right;  
        }
        else if(size==11||size==12){
          parent = current;
          current = current.right.left;  
        }
        else if(size==9||size==10){
          parent = current;
          current = current.left.right;  
        }
        else if(size==7||size==8){
          parent = current;
          current = current.left.left;  
        }
        
        else if(size==5||size==6){
         parent = current;
         current = current.right;
        }
        else if (size==3||size==4){
         parent = current;
         current = current.left;
        }
        
        else
          return false; // Duplicate node not inserted
    
      // Create the new node and attach it to the parent node
      if (parent.left==null){
        parent.left = createNewNode(e);
        }
      else if(parent.right==null){
        parent.right = createNewNode(e);
        
      }
    }

    size++;
    return true; // Element inserted successfully
  }
  

  protected TreeNode<E> createNewNode(E e) {
    return new TreeNode<>(e);
  }

  @Override /** Inorder traversal from the root */
  public void inorder() {
    inorder(root);
  }

  /** Inorder traversal from a subtree */
  protected void inorder(TreeNode<E> root) {
    if (root == null) return;
    inorder(root.left);
    System.out.print(root.element + " ");
    inorder(root.right);
  }

  @Override /** Postorder traversal from the root */
  public void postorder() {
    postorder(root);
  }

  /** Postorder traversal from a subtree */
  protected void postorder(TreeNode<E> root) {
    if (root == null) return;
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.element + " ");
  }

  @Override /** Preorder traversal from the root */
  public void preorder() {
    preorder(root);
  }

  /** Preorder traversal from a subtree */
  protected void preorder(TreeNode<E> root) {
    if (root == null) return;
    System.out.print(root.element + " ");
    preorder(root.left);
    preorder(root.right);
  }

  /** This inner class is static, because it does not access 
      any instance members defined in its outer class */
  public static class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;
    protected double revenue;

    public TreeNode(double revenue) 
    {
    this.revenue = revenue;
    }
    

    public TreeNode(E e) {
      element = e;
    }

  }
  // Function to print binary tree in 2D 
// It does reverse inorder traversal 
public void print2DUtil(TreeNode<E> root, int space) 
{ 
	// Base case 
	if (root == null) 
		return; 

	// Increase distance between levels 
	space += COUNT; 

	// Process right child first 
	print2DUtil(root.right, space); 

	// Print current node after space 
	// count 
	System.out.print("\n"); 
	for (int i = COUNT; i < space; i++) 
		System.out.print(" "); 
	System.out.print(root.element + "\n"); 

	// Process left child 
	print2DUtil(root.left, space); 
} 

// Wrapper over print2DUtil() 
 void print2D() 
{ 
	// Pass initial space count as 0 
	print2DUtil(root, 0); 
} 

  @Override /** Get the number of nodes in the tree */
  public int getSize() {
    return size;
  }

  /** Returns the root of the tree */
  public TreeNode<E> getRoot() {
    return root;
  }

  /** Returns a path from the root leading to the specified element */
  public java.util.ArrayList<TreeNode<E>> path(E e) {
    java.util.ArrayList<TreeNode<E>> list =
      new java.util.ArrayList<>();
    TreeNode<E> current = root; // Start from the root

    while (current != null) {
      list.add(current); // Add the node to the list
      if (e.compareTo(current.element) < 0) {
        current = current.left;
      }
      else if (e.compareTo(current.element) > 0) {
        current = current.right;
      }
      else
        break;
    }

    return list; // Return an array list of nodes
  }

  @Override /** Delete an element from the binary tree.
   * Return true if the element is deleted successfully
   * Return false if the element is not in the tree */
  public boolean delete(E e) {
    // Locate the node to be deleted and also locate its parent node
    TreeNode<E> parent = null;
    TreeNode<E> current = root;
    while (current != null) {
      if (e.compareTo(current.element) < 0) {
        parent = current;
        current = current.left;
      }
      else if (e.compareTo(current.element) > 0) {
        parent = current;
        current = current.right;
      }
      else
        break; // Element is in the tree pointed at by current
    }

    if (current == null)
      return false; // Element is not in the tree

    // Case 1: current has no left child
    if (current.left == null) {
      // Connect the parent with the right child of the current node
      if (parent == null) {
        root = current.right;
      }
      else {
        if (e.compareTo(parent.element) < 0)
          parent.left = current.right;
        else
          parent.right = current.right;
      }
    }
    else {
      // Case 2: The current node has a left child
      // Locate the rightmost node in the left subtree of
      // the current node and also its parent
      TreeNode<E> parentOfRightMost = current;
      TreeNode<E> rightMost = current.left;

      while (rightMost.right != null) {
        parentOfRightMost = rightMost;
        rightMost = rightMost.right; // Keep going to the right
      }

      // Replace the element in current by the element in rightMost
      current.element = rightMost.element;

      // Eliminate rightmost node
      if (parentOfRightMost.right == rightMost)
        parentOfRightMost.right = rightMost.left;
      else
        // Special case: parentOfRightMost == current
        parentOfRightMost.left = rightMost.left;     
    }

    size--;
    return true; // Element deleted successfully
  }

  @Override /** Obtain an iterator. Use inorder. */
  public java.util.Iterator<E> iterator() {
    return new InorderIterator();
  }

  // Inner class InorderIterator
  private class InorderIterator implements java.util.Iterator<E> {
    // Store the elements in a list
    private java.util.ArrayList<E> list =
      new java.util.ArrayList<>();
    private int current = 0; // Point to the current element in list

    public InorderIterator() {
      inorder(); // Traverse binary tree and store elements in list
    }

    /** Inorder traversal from the root*/
    private void inorder() {
      inorder(root);
    }

    /** Inorder traversal from a subtree */
    private void inorder(TreeNode<E> root) {
      if (root == null)return;
      inorder(root.left);
      list.add(root.element);
      inorder(root.right);
    }

    @Override /** More elements for traversing? */
    public boolean hasNext() {
      if (current < list.size())
        return true;

      return false;
    }

    @Override /** Get the current element and move to the next */
    public E next() {
      return list.get(current++);
    }

    @Override /** Remove the current element */
    public void remove() {
      delete(list.get(current)); // Delete the current element
      list.clear(); // Clear the list
      inorder(); // Rebuild the list
    }
  }

  @Override /** Remove all elements from the tree */
  public void clear() {
    root = null;
    size = 0;
  }
}