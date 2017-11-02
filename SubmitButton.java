/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package butttonapp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Graphics;

/**
 *
 * @author 16003059
 */
public class SubmitButton extends JButton{
            
    SubmitButton(String text)
    {
        super(text);
    }
    
    @Override
    public void setBounds (int x, int y, int width, int height)
    {        
        super.setBounds(x, y, width, height);
    }


    @Override
    public void paint (Graphics g) {
        g.drawString(this.getText(), g.getClipBounds().width/2 - g.getFontMetrics().stringWidth(this.getText())/2,g.getClipBounds().height/2);
        g.setColor(Color.blue);
        g.drawRect(0,0,g.getClipBounds().width-1,g.getClipBounds().height-1);
        g.drawRect(1,1,g.getClipBounds().width-3,g.getClipBounds().height-3);
        
    }
    
    
}
