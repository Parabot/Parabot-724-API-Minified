package org.rev724.min.api.methods;

import org.rev724.min.Loader;

public class Game {
	
	public static int getBaseX() {
		return Loader.getClient().getScene().getSceneData().getBaseX();
	}
	
	public static int getBaseY() {
		return Loader.getClient().getScene().getSceneData().getBaseY();
	}

}
