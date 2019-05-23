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
public class btnode<E> {
     
    protected E data; 
    btnode left =null; 
    btnode right = null;
    protected double money;
public btnode(E e) 
    { 
        data=e; 
        left = right = null;
        money=50;
    }

}
