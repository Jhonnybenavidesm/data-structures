/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstunity.doublecircularlist;

/**
 *
 * @author AULA1
 */
public class List {
    private Node head;
    
    public List (){
        head=null;
        
    }
    
     public void add (int d){
         Node n=new Node(d);
         if(head==null){
             head=n;
         }else{
             n.next=head;
             n.back=head.back;
             head.back.next=n;
             head.back=n;
           
         }
         
     }
     
     public void print(){
         if(head==null)return;
         Node aux=head;
         do{
             System.out.print(""+aux.data);
             aux=aux.next;
         } while(aux!=head);
          System.out.println();
     }

}
