/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity2.doublelist;

/**
 *
 * @author Asus-PC
 */
public class Nodo {
    protected int data;
    protected Nodo next;
    protected Nodo back;
    
    public Nodo(int d){
        
        data = d;
        next = null;
        back= null;
        
    }
    
}
