package de.hexagonstudios.hgl;

public class HGL {
	public static final int
		VER_MAJOR = 0,
		VER_MINOR = 1,
		VER_REV   = 0;
	
	public static final String version = "HGL Version "
			+ VER_MAJOR + "."
			+ VER_MINOR + "."
			+ VER_REV;
	
	public static String getInfo() {
		return version+" by Felix Eckert, for more information visit the github wiki!";
	}
	
	public static void main(String[] args) {
		System.out.println(getInfo());
	}
}
