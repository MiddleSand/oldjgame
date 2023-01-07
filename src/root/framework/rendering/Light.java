package root.framework.rendering;

import java.util.Hashtable;

import root.framework.Vector;

public class Light {
	public float luminocity = 0;
	public Hashtable gradient = null;
	
	public Light(float lumenocity, Hashtable gradient) {
		this.luminocity=lumenocity;
		this.gradient=gradient;
	}
	
	
	
}
