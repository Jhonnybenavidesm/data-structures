/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minedzone;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author Asus-PC
 */
public class zona extends JFrame {
    protected mine head;
    protected mine current;
    
    public zona(){
        setTitle("zona minada");
        setSize(500,400);
        launchEvents();
        setVisible(true);
        head=current=null;
    }
    public void addmine (int x,int y){
        mine n=new mine(x,y,this);
        if(head==null){
            head=n;
        }else{
            mine aux=head;
            while(aux.next !=null)aux=aux.next;
            aux.next=n;
            n.back=aux;
        }
        current =n;
    }
    public void goforward (){
        if(current.next!=null){
            current=current.next;
        } 
    }
    public void goback (){
        if(current.back!=null){
            current=current.back;
        } 
    }
    public void explode (){
        if(current!=null){
            current.state=true;
        }  
    }
    public void paint (Graphics g){
        if(head==null)return;
        mine aux=head;
        while(aux!=null){
            aux.paint(g, aux==current);
            aux=aux.next;
        }
        
    }
    public void launchEvents (){
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        addMouseListener(new MouseListener(){

            
            public void mouseClicked(MouseEvent me) {
                addmine(me.getX(),me.getY());
                repaint();
                
            }

          
            public void mousePressed(MouseEvent me) {
                
            }

            
            public void mouseReleased(MouseEvent me) {
               
            }

            
            public void mouseEntered(MouseEvent me) {
                
            }

            
            public void mouseExited(MouseEvent me) {
                
            }
            
        });
        
        addKeyListener(new KeyListener() {

            
            public void keyTyped(KeyEvent ke) {
                
            }

            
            public void keyPressed(KeyEvent ke) {
                switch (ke.getKeyCode()){
                    case KeyEvent.VK_RIGHT: goForward(); break;
                    case KeyEvent.VK_LEFT: goBack(); break;    
                    case KeyEvent.VK_ENTER: explode(); break;
                } 
                repaint();
            }

            
            public void keyReleased(KeyEvent ke) {
            
            }

            private void goForward() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            private void goBack() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    } 
    
    public static void main(String args[]){
        new zona();
    }
}
