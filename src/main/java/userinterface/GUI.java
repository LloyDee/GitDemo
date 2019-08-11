package userinterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import testing.Testing;

public class GUI {
    JFrame frame; JButton goToButton;
    public GUI(){
        frame = new JFrame("Lloyd Jayson APP");
        frame.setSize(500,300);
        frame.setLayout(null);
        
        goToButton = new JButton("One Piece");
        goToButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Testing t = new Testing();
				t.openBrowser();
				t.goToOnepiece();
			}
		});
        goToButton.setBounds(30,30,100,40);

        frame.add(goToButton);
        frame.setVisible(true);

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new GUI();
    }
}
