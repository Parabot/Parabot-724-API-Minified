package org.rev724.min.api.methods;

import org.rev724.min.api.wrappers.Tile;

/**
 * 
 * @author Everel
 *
 */
public class Calculations {
	
	/** 
	 * Calculates distance between local player and given tile
	 * 
	 * @param tile
	 * @return distance between local player and given tile
	 */
	public static final double distanceTo(Tile tile) {
		return distanceBetween(tile, Players.getMyPlayer().getLocation());
	}
	
	/**
	 * Calculates distance between two given tiles
	 * @param a
	 * @param b
	 * @return distance between a and b
	 */
	public static final double distanceBetween(Tile a, Tile b) {
		int x = b.getX() - a.getX();
		int y = b.getY() - a.getY();
		return Math.sqrt((x * x) + (y * y));
	}

}

