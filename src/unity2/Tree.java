/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity2;

import java.util.Vector;

/**
 *
 * @author AULA1
 */
public class Tree {
    private Node root;
    
    public Tree (){
        root=null;
    }
    
public void add(int d){
    Node n = new Node(d);
        if(root == null) {
            root = n;
        } else {
            Node aux = root, p = null;
            while(aux != null) {
                if(d < aux.Data) {
                    p = aux;
                    aux = aux.left;
                } else if(d > aux.Data) {
                    p = aux;
                    aux = aux.right;
                } else {
                    return;
                }
            }
            if(d < p.Data) {
                p.left = n;
            } else {
                p.right = n;
            }
}
}
public void printPath(int d){
    Vector <Node> path=new Vector <Node>();
    Node aux=root;
    while(aux!=null){
        path.add(aux);
        if(d>aux.Data){
            aux=aux.right;
    }
        else if(d<aux.Data){
            aux=aux.left;
        }
        else{
            for(int i=0;i<path.size();){
                System.out.println();
                return;
            }
        }
    }
    System.out.println("Doesn`t exist");
} 

public boolean isLeaf(int d){
    Node aux=root;
    while(aux!=null){
        if(d>aux.Data){
            aux=aux.right;
    }
        else if(d<aux.Data){
            aux=aux.left;
        }else{
            if(aux.right==null && aux.left==null){
                return true;
            }else{
                return false;
            }
        }
          
   
    
    }
  return false;  
}
}
