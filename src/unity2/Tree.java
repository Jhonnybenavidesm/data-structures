/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity2;

import java.util.Stack;
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
public void print(){
       Node aux=root;
       Stack <Node> s = new Stack <Node>();
       while(aux!=null){
           s.push(aux);
           aux=aux.left;
       }
       while(!s.empty()){
           aux=s.pop();
           System.out.println(""+aux.Data);
           aux=aux.right;
           
           while(aux!=null){
               s.push(aux);
               aux=aux.left;
           }
       }
   }
   
   public int Count(){
       
       int cont=0;
       Node aux=root;
       Stack <Node> s = new Stack <Node>();
       while(aux!=null){
           s.push(aux);
           aux=aux.left;
       }
        while(!s.empty()){
           aux=s.pop();
           cont++;
           aux=aux.right;
           
           while(aux!=null){
               s.push(aux);
               aux=aux.left;
           }
       }
        return cont;
   }
   
   public void Printleafs(){
       
       Node aux = root;
       Stack <Node> s = new Stack <Node>();
       while(aux!=null){
           s.push(aux);
           aux=aux.left;
       }
        while(!s.empty()){
           aux=s.pop();
           aux=aux.right;
           
           if(aux.left==null&&aux.right==null){
               System.out.println(""+aux.Data);
           }
           
           while(aux!=null){
               s.push(aux);
               aux=aux.left;
           }
       }
   }
   
   public int Max(){
       if(root==null)return -1;
       
       Node aux=root;
       while(aux.right!=null){
           aux=aux.right;
       }
       return aux.Data;
   }
   
    public int Min(){
       if(root==null)return -1;
       
       Node aux=root;
       while(aux.left!=null){
           aux=aux.left;
       }
       return aux.Data;
   }

}
