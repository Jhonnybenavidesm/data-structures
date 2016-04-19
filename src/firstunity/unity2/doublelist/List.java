/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstunity.unity2.doublelist;

/**
 *
 * @author Asus-PC
 */
public class List {
    private Nodo head;

    public List() {
        head = null;
    }

    public void add(int d) {
        Nodo n = new Nodo(d);
        if (head == null) {
            head = n;
        } else {
            Nodo aux = head;
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = n;
            n.back=aux;
        }
    }

    public void print() {
        Nodo aux = head;
        while (aux != null) {
            System.out.print(" " + aux.data);
            aux = aux.next;
        }
        System.out.println();

    }
    public void Reverse(){
        if (head==null)return;
        Nodo aux = head;
        while(aux.next != null){
            aux = aux.next;
        }
        while ( aux.next!= null){
            System.out.println(" "+aux.data);
            aux=aux.back;
        }
    }
    public void Push(int d){
        Nodo n = new Nodo(d);
        if(head==null){
            head=n;
        }else{
            n.next=head;
            head.back=n;
            head=n;
        }
    
}
    
}

