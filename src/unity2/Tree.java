 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity2;

import java.awt.Graphics;
import java.util.Stack;
import java.util.Vector;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

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
    
    public void recursivePrint(){
            recursivePrint(root);
            System.out.println();
        }
        
    private void recursivePrint(Node r){
        if(r==null)return;
          recursivePrint(r.left);
          System.out.print(" "+r.Data);
          recursivePrint(r.right);
        }
        
    public int recursiveCount(){
        return recursiveCount(root);
            
        }
        
    private int recursiveCount(Node r){
       if(r==null) return 0;
          return recursiveCount(r.left)+recursiveCount(r.right)+1;
        }
        
    public int rHeight(){
         return rHeight (root);
         }
        
        
    private int rHeight(Node r){
        if (r==null)return 0;
          int a = rHeight(r.left);
          int b = rHeight(r.right);
          return Math.max(a, b)+1;
            }
    
    public void rDraw(){
        JFrame f= new JFrame(){
            public void paint(Graphics g){
                
                rDraw(root,20,40,g);
            }  
        };
                f.setSize(600,400);
                f.setVisible(true);
                f.setDefaultCloseOperation(EXIT_ON_CLOSE);      
    }
    
    private int rDraw (Node r,int x,int y,Graphics g){
        if(r==null) return x;
        x=rDraw(r.left,x,y+40,g);
        g.drawString(""+r.Data,x+10,y+20);
        g.drawOval(x, y, 30, 30);
        x=rDraw(r.right,x+30,y+40,g);
        return x;
    }
    
    public boolean isComplete(){
       return isComplete(root);
    }
    
    private boolean isComplete(Node r){
        if (r==null)return true;
        if ((r.left==null && r.right!=null)||(r.left!=null && r.right==null)){
            return false;
        }
        return isComplete(r.left) && isComplete(r.right);
    }
    
  
    private boolean exists(int d){
       Node aux=root;
       while(aux!=null){
           if(d==aux.Data){
               return true;
           }
           else if(d> aux.Data){
               aux=aux.right;
           }
           else{
               aux=aux.left;
           }
       }
       return false;
    }
  
}
