/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity0;

/**
 *
 * @author AULA1
 */
public class Test {
    public static void main (String [] args){
        TestingStacks();
        TestingQueves();
        TestingList();
    }
    public static void TestingList(){
           List lis=new List();
      
       for(int i=0;i<5;i++){
           lis.add(i+2, i);
       }
        System.out.println("......list.....");
       System.out.println(".....Initial valves.......");
       lis.print();
       lis.add(10, 1);
       
        System.out.println(".....element removed.....");
       lis.print();
       lis.Remove(2);
        System.out.println("....corruent valves.......");
       lis.print();
    
}
    public static void TestingStacks(){
        Stack s = new Stack();
        System.out.println("....pilas....");
        s.add(10);
        s.add(20);
        s.add(30);
        s.print();
        s.remove();
        s.print();
        for(int i=2; i<20; i+=2){
            s.add(i);
        }
        s.print();
    }
    
       
     public static void TestingQueves(){
        System.out.println(".......Queve Testing.......");
        Queve q= new Queve();
        for(int i=1;i<=20;i++){
            q.add(i);
        }
        System.out.print("....Initial valves.....");
        q.print();
        int d = q.remove();
        System.out.println("the element removed was: " +d);
        System.out.println("corruent valves");
        q.print();
        
    }
}
