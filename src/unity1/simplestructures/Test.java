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
public class Test {
    public static void main(String args[]){
        List l=new List();
        l.add(3);
        l.add(5);
        l.add(9);
        l.add(12);
        System.out.print("initial values");
        l.print();
        int c = l.counter();
        System.out.println("Total nodes:"+c);
        System.out.println("the first element is");
        l.printfirselement();
        System.out.println("");
        System.out.println("the last element is");
        l.printlastelement();
        
        System.out.println("duplicating...");
        l.duplicate();
        System.out.println("values aster duplication");
        l.print();
        
        System.out.println("duplicating mirror");
        l.duplicatemirror();
        System.out.println("values aster duplication mirror");
        l.print();
        
    
        
    }
}
