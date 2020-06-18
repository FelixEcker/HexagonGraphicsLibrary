package de.hexagonstudios.hgl.general;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * Class creates a generic JFrame window with a canvas.
 * 
 * @author Felix Eckert
 * */
public class GenericWindow extends Canvas {
	private JFrame frame;
	
	/**
	 * Constructor for GenericWindow
	 * 
	 * @param name Name for the JFrame to be given
	 * @param res  Dimensions for the JFrame and the Canvas
	 * 
	 * @author Felix Eckert
	 * */
	public GenericWindow(String name, Dimension res) {
		frame = new JFrame(name);
		frame.setSize(res);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		setSize(res);
		
		frame.add(this);
	}
	
	/**
	 * Displays the JFrame
	 * 
	 * @author Felix Eckert
	 * */
	public void display() {
		setVisible(true);
	}
	
	public JFrame getFrame() { return this.frame; }
}
