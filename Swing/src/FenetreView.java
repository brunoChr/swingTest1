import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class FenetreView extends JFrame{

	public FenetreView(String string) {
		// TODO Auto-generated constructor stub
	
		super(string);
		
		JLabel label = new JLabel("Hello world");
		JButton button = new JButton("Cliquer ici");
		
		Container pan = this.getContentPane();
		//Instanciation d'un objet JPanel
	    //JPanel pan = new JPanel();
	    
		pan.setLayout(new GridBagLayout());
		pan.add(label);
		pan.add(button);
		
		//pan.setBackground(Color.blue);
		this.pack();
		
		//this.setTitle("Ma première fenêtre Java");
	    this.setSize(400, 500);
	    //Nous demandons maintenant à notre objet de se positionner au centre
	    this.setLocationRelativeTo(null);
	    //Termine le processus lorsqu'on clique sur la croix rouge
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    //button.addActionListener(new FenetreEvent());
	    
	    this.setContentPane(new Panneau());
	    //label.setVisible(true);
	    //button.setVisible(true);
	  //On prévient notre JFrame que notre JPanel sera son content pane
	    //this.setContentPane(pan);
		this.setVisible(true);
		
		
	}
	
	
}
