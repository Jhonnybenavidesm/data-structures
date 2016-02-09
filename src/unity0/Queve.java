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
public class Queve {
   private int[] data;
    private int top;
    public void add(int d){
        data[top]=d;
        top++;
        
    }
    public int remove(){
       int d= data[0];
       for(int i=0;i<top-1;i++){
           data[i]=data[i++];
           
       }
       top--;
       return d;
    }
    public void print(){
        for(int i=0; i<top; i++){
            System.out.print(" " + data [i]);
        }
        System.out.println();
    }
    public Queve (){
        data = new int [100];
        top=0;
    }

    void println() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
