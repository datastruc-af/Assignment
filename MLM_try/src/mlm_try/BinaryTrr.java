
package mlm_try;


public class BinaryTrr {

    
    public static void main(String[] args) {
    
    /*BST<String> tree = new BST<>();
    tree.insert("George");
    tree.insert("Michael");
    tree.insert("Tom");
    tree.insert("Adam");
    tree.insert("Jones");
    tree.insert("Peter");
    tree.insert("Daniel");
    tree.insert("Luqman");
    printTree(tree);*/
    
    BST<Integer>tree =new BST<>();
    tree.insert(20);
    tree.insert(900);
    tree.insert(3);
    tree.insert(201);
    tree.insert(500);
    tree.insert(27);
    tree.insert(65);
    tree.insert(599);
    tree.insert(543);
    printTree(tree);

    /*System.out.println("\nAfter delete George:");
    tree.delete("George");
    printTree(tree);

    System.out.println("\nAfter delete Adam:");
    tree.delete("Adam");
    printTree(tree);

    System.out.println("\nAfter delete Michael:");
    tree.delete("Michael");
    printTree(tree);*/
  }

  public static void printTree(BST<Integer> tree) {
    // Traverse tree
    System.out.print("Inorder (sorted): ");
    tree.inorder();
    System.out.print("\nPostorder: ");
    tree.postorder();
    System.out.print("\nPreorder: ");
    tree.preorder();
    System.out.print("\nThe number of nodes is " + tree.size());
    System.out.println();
    System.out.print("\nThe 2D diagram");
    tree.print2D();
  }
  


    }
    

