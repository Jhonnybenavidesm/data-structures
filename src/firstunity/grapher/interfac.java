/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstunity.grapher;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

/**
 *
 * @author AULA1
 */
public class interfac extends JFrame {
    private graph graph;
    
    public interfac (){
        setTitle("Grapher");
        setSize(400,400);
        launchWidgets();
        lauchEvents();
        setVisible(true);
    }
    public void launchWidgets (){
        graph = new graph();
        add(graph);
    
    }
    public void lauchEvents(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        graph.addMouseMotionListener(new MouseMotionListener() {

            
            public void mouseDragged(MouseEvent e) {
                graph.addCoordinate(e.getX(), e.getY() );
                repaint();
               
            }

           
            public void mouseMoved(MouseEvent e) {
                 
            }
        });
        
       this.addKeyListener(new KeyListener() {

            
            public void keyTyped(KeyEvent e) {
             
            }

           
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()== KeyEvent.VK_BACK_SPACE){
                    graph.removeLast();
                    repaint();
                }
                
            }

            
            public void keyReleased(KeyEvent e) {
               
            }
        });
    }
    
    public static void main(String args[]){
        new interfac();
        
    }
    
    
}
