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

public class BotMenu implements ActionListener {
	
	public BotMenu(JMenuBar bar) {
		PaintDebugger debugger = Context.getInstance().getPaintDebugger();
		
		JMenu debug = new JMenu("Debug");
	
		JMenuItem player = newItem("Player");
		
		debugger.addDebugger("Player", new DPlayer());
		
		debug.add(player);
		
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