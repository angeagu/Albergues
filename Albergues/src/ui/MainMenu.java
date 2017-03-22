package ui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainMenu extends JFrame {

	public void createMenu() {
		this.setSize(300, 600);
		//Creo GridLayout
		GridLayout layout = new GridLayout(4,1);
		this.setLayout(layout);
		
		//JPanel
		JPanel panel = new JPanel();
		//Creo Botones
		JButton button = new JButton("Ver Lista Albergues");
		this.add(button,0);
		
		this.setVisible(true);
	}
}
