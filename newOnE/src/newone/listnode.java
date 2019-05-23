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
public class listnode<E> {
    protected E element;
    
    listnode next;
public listnode (E e){
        element=e;
        next=null;
    }
       
}
