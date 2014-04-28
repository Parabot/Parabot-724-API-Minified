package org.rev724.min.api.methods;

import java.util.ArrayList;

import org.rev724.min.Loader;
import org.rev724.min.accessors.AnimableNode;
import org.rev724.min.accessors.Client;
import org.rev724.min.accessors.Ground;
import org.rev724.min.api.wrappers.SceneObject;

public class SceneObjects {
	
	public static SceneObject[] getSceneObjects() {
		final Client client = Loader.getClient();
		final Ground[][] groundArr = client.getScene().getSceneWorld().getGroundArray()[0];
		final ArrayList<SceneObject> objects = new ArrayList<SceneObject>();
		for (int x = 0; x < 104; x++) {
			for (int y = 0; y < 104; y++) {
				final Ground ground = groundArr[x][y];
				org.rev724.min.accessors.Animable object = null;
				if (ground == null) {
					continue;
				}
				for (AnimableNode node = ground.getInteractiveObjects(); node != null; node = node
						.getNext()) {
					object = node.getAnimable();
					if (object != null) {
						final SceneObject sceneObject = new SceneObject(object,
								x, y, SceneObject.TYPE_INTERACTIVE);
						objects.add(sceneObject);
					}
				}
			}
		}
		return objects.toArray(new SceneObject[objects.size()]);
	}

}
