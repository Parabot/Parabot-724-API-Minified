package org.rev724.min.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import org.parabot.core.Context;
import org.parabot.core.paint.PaintDebugger;
import org.rev724.min.debug.DPlayer;
import org.rev724.min.debug.DSceneObjects;

public class BotMenu implements ActionListener {
	
	public BotMenu(JMenuBar bar) {
		PaintDebugger debugger = Context.getInstance().getPaintDebugger();
		
		JMenu debug = new JMenu("Debug");
	
		JMenuItem player = newItem("Player");
		JMenuItem sceneObjects = newItem("SceneObjects");
		
		debugger.addDebugger("Player", new DPlayer());
		debugger.addDebugger("SceneObjects", new DSceneObjects());
		
		debug.add(player);
		debug.add(sceneObjects);
		
		bar.add(debug);
	}
	
	private JMenuItem newItem(String name) {
		JMenuItem item = new JCheckBoxMenuItem(name);
		item.addActionListener(this);
		return item;
	}
 
	@Override
	public void actionPerformed(ActionEvent e) {
		Context.getInstance().getPaintDebugger().toggle(e.getActionCommand());
	}

}