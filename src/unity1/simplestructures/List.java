/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.simplestructures;

/**
 *
 * @author AULA1
 */
public class List {
    private Nodo head;
    private Object aux;
    
    public List (){
        head=null;
        
    }
    public void add (int d){
        Nodo n = new Nodo (d);
        if(head==null){
            head=n;
            
        }else {
            Nodo aux=head;
            while(aux.next!=null){
                aux=aux.next;
            }
            aux.next=n;
        }
    }
    public void print(){
        Nodo aux=head;
        while(aux != null){
            System.out.print(" "+aux.Data);
            aux=aux.next;
        }
        System.out.println();
    }
    public int counter(){
    Nodo aux=head;
    int counter=0;
    while(aux !=null){
    counter++;
    aux=aux.next;
    
}
    return counter;

}
    public void printfirselement(){
     if (head==null){
         System.out.print("-1");
     } 
     else{
         System.out.print(head.Data);
     }
    }
    public void printlastelement(){ 
         Nodo aux=head; 
         if(aux.next!=null){ 
              while(aux.next!=null){ 
                aux=aux.next; 
              } 
              System.out.println(aux.Data); 
         } else { 
             System.out.println("-1"); 
         }
           
    } 

    public void removefirtselement(){ 
         head=head.next; 
   } 
    public void removeLastelement(){ 
        Nodo aux=head, p=null; 
         while(aux.next!=null){ 
             p=aux; 
             aux=aux.next; 
         } 
         p.next=null; 
     } 
  } 


