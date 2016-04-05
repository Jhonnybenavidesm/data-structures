/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minedzone;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Asus-PC
 */
public class mine {
    protected int x;
    protected int y;
    protected boolean state;
    protected mine next,back;
    protected zona z;
    
    public mine (int posx,int posy,zona zone){
        x=posx;
        y=posy;
        state=false;
        next=null;
        back=null;
        z=zone;
    }
    public void paint (Graphics g,boolean current){
        Image image;
        if(state==false){
            image=Toolkit.getDefaultToolkit().getImage("C:\\Users\\Asus-PC\\Downloads/mine.png");
        }else{
            image=Toolkit.getDefaultToolkit().getImage("C:\\Users\\Asus-PC\\Downloads/boom.png");
            
        }
        g.drawImage(image,x-24,y-24,z);
        if(current ==true){
            g.setColor(Color.RED);
        }else{
            g.setColor(Color.WHITE);
        }
        g.drawRect(x-25, y-25, 50, 50);
        
        
    }
    
}
