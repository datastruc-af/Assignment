/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newone;

/**
 *
 * @author Study
 */
public class NewOnE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bt<Integer> tree = new bt<Integer>(); 
        tree.push(36); /* Last node of Linked List */
        tree.push(30); 
        tree.push(25); 
        tree.push(15); 
        tree.push(12); 
        tree.push(10); /* First node of Linked List */
        btnode node = tree.convertList2Binary(tree.root);
        tree.print2D(node);
        tree.printLevelOrder(node);
        tree.search(node,25);
    }
    
}
