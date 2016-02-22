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
        l.add(5);
        l.add(10);
        l.add(15);
        System.out.print("initial values");
        l.print();
        int c = l.counter();
        System.out.println("Total nodes:"+c);
        System.out.print("the first element is:");
        l.printfirselement();
        l.laselement();
    }
}
