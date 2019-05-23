/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newone;
import java.util.*; 
/**
 *
 * @author Study
 */
public class bt<E> {
    listnode head;
    btnode root;
    btnode money;
    static final int COUNT=10;
    

public void push(E e){
    listnode new_node= new listnode(e);
    new_node.next=head;
    head=new_node;
}
public btnode convertList2Binary(btnode node){
    
        Queue<btnode> q =  new LinkedList<btnode>(); 
   
        if (head == null)  
        { 
            node = null;  
            return null; 
        } 
   

        node = new btnode(head.element); 
        q.add(node); 
   
        head = head.next; 
   

        while (head != null)  
        { 

            btnode parent = q.peek(); 
            btnode pp = q.poll(); 
               
            btnode leftChild = null;
            btnode rightChild = null;
            
            leftChild = new btnode(head.element); 
            q.add(leftChild); 
            head = head.next; 
            if (head != null)  
            { 
                rightChild = new btnode(head.element); 
                q.add(rightChild); 
                head = head.next; 
            } 
   
            // 2.b) assign the left and right children of 
            //      parent 
            parent.left = leftChild; 
            parent.right = rightChild;
        } 
           
        return node; 
    }
public void print2DUtil(btnode node, int space) 
{ 
	// Base case 
	if (node == null) 
		return; 
	// Increase distance between levels 
	space += COUNT; 

	// Process right child first 
	print2DUtil(node.right, space); 

	// Print current node after space 
	// count 
	System.out.print("\n"); 
	for (int i = COUNT; i < space; i++) 
		System.out.print(" "); 
	System.out.print(node.data + "\n"); 

	// Process left child 
	print2DUtil(node.left, space); 
} 

// Wrapper over print2DUtil() 
 void print2D(btnode node) 
{ 
	// Pass initial space count as 0 
	print2DUtil(node, 0); 
}
 void printLevelOrder(btnode node) 
{ 
    int h = height(node); 
    int i; 
    for (i=1; i<=h; i++) 
    { 
        System.out.println("level "+i);
        printGivenLevel(node, i);
        System.out.println(); 
    } 
} 
/* Print nodes at a given level */
void printGivenLevel(btnode node, int level) 
{ 
    if (node == null) 
        return; 
    if (level == 1) 
        System.out.println(node.data); 
    else if (level > 1) 
    { 
        printGivenLevel(node.left, level-1); 
        printGivenLevel(node.right, level-1);
        
    } 
}
void searchGivenLevel(btnode node,E e,int level) 
{ 
    if (node == null) 
        return; 
    if (e.equals(node.data)&& level==1)
        System.out.println(node.data+" HERE");
    else if (!(e.equals(node.data))) 
    { 
        searchGivenLevel(node.left,e, level-1); 
        searchGivenLevel(node.right,e, level-1);
        
    }
    else
        System.out.println("NOT FOUND");
}
int height(btnode node) 
    { 
        if (node == null) 
           return 0; 
        else
        { 
            /* compute  height of each subtree */
            int lheight = height(node.left); 
            int rheight = height(node.right); 
              
            /* use the larger one */
            if (lheight > rheight) 
                return(lheight+1); 
            else return(rheight+1);  
        } 
    }
void  search(btnode node,E e){
    int h = height(node); 
    int i; 
    for (i=1; i<=h; i++) 
    { 
        System.out.println("level "+i);      
        searchGivenLevel(node,e, i);
        System.out.println(); 
    } 
}
}
