/* This example an adapted version of: https://beginnersbook.com/2015/07/swing-jbutton-class/ */

package butttonapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;

public class Butttonapp 
{
    Butttonapp()
    {  
        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setLayout(null);      
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        
        SubmitButton submitButton = new SubmitButton("Submit");
        submitButton.setBounds(50,50,90, 50);  
        frame.add(submitButton);     

        
        ConfirmationLabel confirmSubmissionLabel = new ConfirmationLabel("Thank you."); 
        confirmSubmissionLabel.setBounds(150,50,90, 50);  
        confirmSubmissionLabel.setVisible(false);
        frame.add(confirmSubmissionLabel);                   
        
        
        ConfirmationLabel comlab = new ConfirmationLabel("thanks"); 
        comlab.setBounds(250,50,90, 50);  
        comlab.setVisible(false);
        frame.add(comlab);  
        
        otherlabel vislab = new otherlabel("hello"); 
        vislab.setBounds(50,200,90, 50);  
        vislab.setVisible(true);
        frame.add(vislab); 
        
        submitButton.addActionListener(confirmSubmissionLabel);
        submitButton.addActionListener(comlab);
        submitButton.addActionListener(vislab);
        

        
        

    }  
              
     public static void main(String[] args) 
	 {  
            new Butttonapp();  
     }  
}
