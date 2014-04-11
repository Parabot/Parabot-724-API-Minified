package org.rev724.min.callback;

public class MenuAction {

	public static void intercept(org.rev724.min.accessors.MenuAction action,
			int n, int n1) {
		System.out.println("ID: " + action.getId() + " Action1: "
				+ action.getAction1() + " Action2: " + action.getAction2()
				+ " Action3: " + action.getAction3() + " Action4: "
				+ action.getAction4() + " mouseX: " + n + " mouseY: " + n1);
	}

}
