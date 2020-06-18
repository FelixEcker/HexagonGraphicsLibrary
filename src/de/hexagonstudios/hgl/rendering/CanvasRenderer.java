package de.hexagonstudios.hgl.rendering;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

/**
 * This class contains a method for drawing to a Canvas.
 * 
 * @author Felix Eckert
 * */
public class CanvasRenderer {
	private IRenderer userRenderer;
	private JFrame frame;
	private BufferStrategy bs;
	private Graphics g;
	
	/**
	 * Constructor for Canvas Renderer
	 * @param userRenderer Implementation of the Renderer interface, of which the render method is executed every time this class's render function is called
	 * @param frame The JFrame which holds the canvas.
	 * 
	 * @author Felix Eckert
	 * */
	public CanvasRenderer(IRenderer userRenderer, JFrame frame) {
		this.userRenderer = userRenderer;
		this.frame = frame;
	}
	
	/**
	 * Handles creation of buffer strategy and clears the window every call. Also executes the user set render function
	 * */
	public void render() {
		bs = frame.getBufferStrategy();
		
		if (bs == null) {
			frame.createBufferStrategy(3);
			return;
		}
		
		g = bs.getDrawGraphics();
		g.clearRect(0, 0, frame.getWidth(), frame.getHeight());
		
		userRenderer.render(g);
		
		g.dispose();
		bs.show();
	}
}
