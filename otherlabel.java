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
import javax.swing.JLabel;
import java.awt.Graphics;


public class otherlabel extends JLabel implements ActionListener
{
    
    otherlabel(String labelText)
    {   
        super(labelText);
        super.setEnabled(true);
    }
    
    @Override
    public void setBounds (int x, int y, int width, int height)
    {  
        super.setBounds(x, y, width, height);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    { 
        this.setVisible(false); 
    }
    
    @Override
    public void paint (Graphics g) {
        g.drawString(this.getText(), 10,10);
        g.setColor(Color.BLUE);
        g.drawRect(0,0,g.getClipBounds().width-1,g.getClipBounds().height-1);
        
    }
    

}
    
