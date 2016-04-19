/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstunity.unity0;

/**
 *
 * @author Asus-PC
 */
public class List {
    private int [] data;
    private int top;
    
    public List (){
        top = 0;
        data= new int [100];
        
    }
    public void print(){
        for(int i=0;i<top;i++){
            System.out.print("  "+data[i]);
        }
        System.out.println();
    }
     public void add(int d, int index){
        top++;
        if(index<top){
            for(int i=top-1;i>=index;i--){
            data[i+1]=data[i];
            }
            data[index]=d;
        }
    }
    public int Remove(int num){
       int a;
       a=data[num];
        System.out.println(a);
       for(int i=num;i<top;i++){
           data[i]=data[i+1];
       }
       top--;
        return a;
    } 
     
    
}
