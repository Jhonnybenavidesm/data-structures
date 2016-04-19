/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstunity.unity1.simplestructures;

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
    public void duplicate(){
        if(head==null)return;
        Nodo last=head, aux=head;
        while(last.next !=null){
            last=last.next;
        }
        int c=counter();
        for(int i=0; i<c; i++){
            last.next=new Nodo(aux.Data);
            aux=aux.next;
            last=last.next;
        }
    }
    public void duplicatemirror(){
        if(head==null)return;
        Nodo last=head, aux=head;
        while(last.next !=null){
            last=last.next;
        }
       
    }
    
    public void insertzeros(){ 
     
        Nodo aux=head;
        int  c=counter();
        for(int i=1;i<c;i++){
            Nodo n=new Nodo(0);
            n.next=aux.next;
            aux.next=n;
            aux=n.next;
        }
    
    } 
    
    public void removemiddle(){
        Nodo aux=head;
       Nodo p=head;
       int c=counter();
       for (int i=0;i<c/2;i++){
           p=aux;
           aux=aux.next;
           
       }
       p.next=aux.next;
        
    }
    
    public int countodds(){
        Nodo aux= head; 
        int p=0;
        while(aux.next!=null){
            if(aux.Data%2==1){
                p++;
            }
            aux=aux.next;
        }
        return p;
    }
    
    public void reserversprint(){
        if (head==null)return;
        Nodo ok=null,aux;
        do{
            aux=head;
            while(aux.next !=ok){
                aux=aux.next;
            }
            System.out.print(""+aux.Data);
            ok=aux;
       
        } while(ok!=head);
    }
    
    public void invert(){
        if (head==null)return;
        Nodo aux=head,head2=null;
        while(head!=null){
            aux=head;
            head=head2.next;
            head2=aux;
        }
        head=head2;
    }
    public void removeIntercalated(){
        Nodo aux=head;
        Nodo p=head;
        int c = counter();
        for(int i=0; i<c; i++){
            if(i%2==1){
            p=aux;
            aux=aux.next;
        }else{
               aux=aux.next; 
                }
        }
    }
    
    public void duplicateinercalate(){
        Nodo p=head;
        Nodo aux=head;
        while(aux.next!=null){
            Nodo n=new Nodo(p.Data);
            p.next=n;
            aux=aux.next;
            n.next=aux;
            p=aux;
        }
    }
    
    public void remuverecurrents(){
        Nodo aux=head;
        Nodo p=head;
        Nodo back=head;
        while(aux.next!=null){
            p=head;
            while(p!=null){
                if(p.Data==aux.Data){
                    back.next=aux.next;
                    back.next=aux.next;
                }
                p=p.next;
            }
            back=aux;
        }
        back=aux;
        aux=aux.next;
    }
  } 


