package org.rev724.min.debug;

import java.awt.Graphics;

import org.parabot.core.Context;
import org.parabot.core.paint.AbstractDebugger;
import org.rev724.min.api.methods.Game;
import org.rev724.min.api.methods.Players;
import org.rev724.min.api.wrappers.Tile;

public class DPlayer extends AbstractDebugger {
	private boolean enabled;

	@Override
	public void paint(Graphics g) {
		Context.getInstance().getPaintDebugger().addLine("Base: " + new Tile(Game.getBaseX(), Game.getBaseY()));
		Context.getInstance().getPaintDebugger().addLine("Player: " + Players.getMyPlayer().getLocation());
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

	@Override
	public void toggle() {
		enabled = !enabled;
	}


}
