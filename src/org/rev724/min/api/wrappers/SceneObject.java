package org.rev724.min.api.wrappers;

import org.rev724.min.api.methods.Calculations;
import org.rev724.min.api.methods.Game;

public class SceneObject {
	
	public static final int TYPE_INTERACTIVE = 0;
	private org.rev724.min.accessors.Animable accessor;
	private int x;
	private int y;
	private Tile cached;
	//private long actionKey;
	private int type;

	public SceneObject(org.rev724.min.accessors.Animable accessor, int x, int y, int type) {
		this.accessor = accessor;
		this.x = x;
		this.y = y;
		this.type = type;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Tile getLocation() {
		if(cached == null) {
			cached = new Tile(Game.getBaseX() + x, Game.getBaseY() + y);
		}
		return cached;
	}

	public int getId() {
		/*try {
			return ((InteractiveObject) accessor).method57((byte) 115);
		} catch(AbstractMethodError e) {
			return -1;
		}*/
		return accessor.method45();
	}

	public int getType() {
		return type;
	}

	public long getActionKey() {
		/*if(actionKey == 0L) {
			actionKey = Loader.getClient().getActionKey(accessor, x, y);
		}
		return actionKey;*/
		return 0;
	}

	public int distanceTo() {
		return (int) Calculations.distanceTo(getLocation());
	}

	public void interact(int id) {
		/*Packet packet = new Packet(id, getActionKey(), getX(), getY(), "<col=00ffff>Rocks");
		packet.execute();*/
	}


}
