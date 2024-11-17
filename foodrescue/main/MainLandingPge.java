/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodrescue.main;

/**
 *
 * @author NagbontianAliciaBene
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainLandingPge extends JFrame {
    public MainLandingPge(){
                //main window
        setTitle("Food Rescure Network");
        setSize (200, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);//centre screen
        
        initComponents();
    }

    private void initComponents() {

        JPanel panel = new JLabel();
        panel.setLayout(null);

        JLabel welcomeLabel = new Jlabel("Welcome to Food Rescue Network");
        panel.add(welcomeLabel); //welcomelabel
            
        JButton donorButton = new Jbutton("Donor Section");
        panel.add(donorButton);

        JButton recipientButton = new Jbutton("Recipient Section");
        panel.add(recipientButton);

        JButton adminButton = new Jbutton("Admin Section");
        panel.add(adminButton);

        donorButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                JOptionPane.showMessageDialog(null,"Here is donor section");
                        }
});
            recipientButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null,"Here is recipient section");
                        }
});

            adminButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null,"Here is admin section");
                        }
});
        add(panel);
    }
    public static void main(String[]args){
        MainLandingPge mainPage = new MainLandingPge();
        mainPage.setVisible(true);
    }
}