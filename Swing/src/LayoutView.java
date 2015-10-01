import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class LayoutView extends JFrame{


	public LayoutView(String s) {
		// TODO Auto-generated constructor stub
	
	super(s);
	
    //Définit sa taille : 400 pixels de large et 100 pixels de haut
    this.setSize(400, 100);
    
    //Nous demandons maintenant à notre objet de se positionner au centre
    this.setLocationRelativeTo(null);
    
    //Termine le processus lorsqu'on clique sur la croix rouge
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
	JButton button1 = new JButton("button1");
	JButton button2 = new JButton("button2");
	JButton button3 = new JButton("button3");
	JButton button4 = new JButton("button4");
	JButton button5 = new JButton("button5");
	JButton button6 = new JButton("button6");
	
	JSlider slide1 = new JSlider();
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	
	Container pan = this.getContentPane();
	pan.setLayout(new BorderLayout());
	//pan.setLayout(new GridLayout(10,10));
	//pan.setLayout(new GridBagLayout());
	
	JPanel sousPanel = new JPanel();
	sousPanel.setLayout(new BorderLayout());
	
	pan.add(button1,BorderLayout.EAST);
	pan.add(button2,BorderLayout.NORTH);
	pan.add(button3,BorderLayout.WEST);
	pan.add(button4,BorderLayout.SOUTH);
	
	
	sousPanel.add(button5,BorderLayout.WEST);
	sousPanel.add(button6,BorderLayout.EAST);
	
	pan.add(sousPanel,BorderLayout.CENTER);
	
	//pan.add(slide1);
	//pan.add(text1);
	//pan.add(text2);
	
	button1.addActionListener(new FenetreEvent());
	button2.addActionListener(new FenetreEvent());
	button3.addActionListener(new FenetreEvent());
	button4.addActionListener(new FenetreEvent());
	button5.addActionListener(new FenetreEvent());
	button6.addActionListener(new FenetreEvent());
	
	this.pack();
	this.setVisible(true);
	}
}
