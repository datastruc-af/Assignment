
package binary.trr;

import java.util.Random;
import java.util.Scanner;


public class BinaryTrr {

    
    public static void main(String[] args) {
    BST<String>tree =new BST<>();
    Random r= new Random();
    Scanner sc=new Scanner(System.in);
    int exit=0;
    while(exit!=-1){
    int a=r.nextInt(1000);
    System.out.println("Input your Name: ");
    tree.insert(sc.next());
    System.out.println("Exit press -1 if not press 1: ");
    exit=sc.nextInt();
    System.out.println("Number of Entered: "+tree.size);
    for(int i=0;i<3;i++)
    System.out.println("\n");}
    /*tree.insert(20);
    tree.insert(900);
    tree.insert(3);
    tree.insert(201);
    tree.insert(500);
    tree.insert(27);
    tree.insert(65);
    tree.insert(599);
    tree.insert(543);
    tree.insert(7);
    tree.insert(9);
    tree.insert(2);
    tree.insert(33);
    tree.insert(41);
    tree.insert(98);
    tree.insert(56);
    tree.insert(39);
    tree.insert(90);*/
    printTree(tree);
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

  public static void printTree(BST<String> tree) {
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
    

