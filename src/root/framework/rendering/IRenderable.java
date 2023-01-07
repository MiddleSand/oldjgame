package root.framework.rendering;

import java.util.Hashtable;

import root.framework.Vector;

public interface IRenderable {

	public Hashtable render(RenderData renderDat, Vector renderVector);
	
}
