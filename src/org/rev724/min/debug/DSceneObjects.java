package org.rev724.min.debug;

import java.awt.Graphics;

import org.parabot.core.paint.AbstractDebugger;
import org.rev724.min.api.methods.SceneObjects;
import org.rev724.min.api.wrappers.SceneObject;

public class DSceneObjects extends AbstractDebugger {

	@Override
	public void paint(Graphics g) {
		
	}

	@Override
	public boolean isEnabled() {
		return false;
	}

	@Override
	public void toggle() {
		for(SceneObject s : SceneObjects.getSceneObjects()) {
			System.out.println(s.getLocation());
		}
		
	}

}
