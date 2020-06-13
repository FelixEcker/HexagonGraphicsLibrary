package de.hexagonstudios.hgl.utils;

import java.awt.Color;
import java.util.HashMap;

/**
 * Class for storing custom colors, to prevent you from having to create a new Color object everytime
 * you need a non standard color
 * 
 * @author Felix Eckert
 * */
public class Colors {
	// HashMap containing all the registered colors and their names
	private HashMap<String, Color> colors = new HashMap<String, Color>();
	
	/**
	 * Store a new color with its name
	 * 
	 * @author Felix Eckert
	 * */
	public void addColor(String name, Color color) {
		colors.put(name, color);
	}
	
	/**
	 * Get a new color from its name
	 * 
	 * @author Felix Eckert
	 * */
	public Color getColor(String name) { return colors.get(name); }
}
