package de.hexagonstudios.hgl.general;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * Class creates a generic JFrame window with a canvas.
 * 
 * @author Felix Eckert
 * */
public class GenericWindow extends JFrame {
	private Canvas cvs;
	
	/**
	 * Constructor for GenericWindow
	 * 
	 * @param name Name for the JFrame to be given
	 * @param res  Dimensions for the JFrame and the Canvas
	 * 
	 * @author Felix Eckert
	 * */
	public GenericWindow(String name, Dimension res) {
		super(name);
		setSize(res);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		cvs = new Canvas();
		cvs.setSize(res);
		
		add(cvs);
	}
	
	/**
	 * Displays the JFrame
	 * 
	 * @author Felix Eckert
	 * */
	public void display() {
		setVisible(true);
	}
	
	public Canvas getCvs() { return this.cvs; }
}
