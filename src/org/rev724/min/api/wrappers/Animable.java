package org.rev724.min.api.wrappers;

import org.rev724.min.api.methods.Calculations;
import org.rev724.min.api.methods.Game;

public class Animable {
	private org.rev724.min.accessors.Animable accessor;
	
	public Animable(org.rev724.min.accessors.Animable accessor) {
		this.accessor = accessor;
	}
	
	public short getX() {
		return accessor.getX();
	}
	
	public short getY() {
		return accessor.getY();
	}
	
	public int distanceTo() {
		return (int) Calculations.distanceTo(getLocation());
	}
	
	public Tile getLocation() {
		return new Tile(Game.getBaseX() + getX(), Game.getBaseY() + getY());
	}

}
