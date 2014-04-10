package org.rev724.min;

import java.applet.Applet;
import java.net.URL;

import javax.swing.JMenuBar;

import org.parabot.core.Context;
import org.parabot.core.asm.ASMClassLoader;
import org.parabot.core.asm.adapters.AddInterfaceAdapter;
import org.parabot.core.asm.hooks.HookFile;
import org.parabot.environment.scripts.Script;
import org.parabot.environment.servers.ServerManifest;
import org.parabot.environment.servers.ServerProvider;
import org.parabot.environment.servers.Type;
import org.rev724.min.loader.AppletProvider;



/**
 * 
 * @author Everel
 *
 */
@ServerManifest(author = "Everel", name = "Infinity724", type = Type.INJECTION, version = 0.1)
public class Loader extends ServerProvider {
	private Object instance;

	@Override
	public Applet fetchApplet() {
		try {
			final Context context = Context.getInstance();
			final ASMClassLoader classLoader = context.getASMClassLoader();
			final Class<?> clientClass = classLoader.loadClass("client");
			instance = clientClass.newInstance();
			
			AppletProvider provider = new AppletProvider();
			provider.supply(instance);
			return provider;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public void initMouse() {
		try {
			instance.getClass().getDeclaredMethod("init", new Class<?>[] { }).invoke(instance, new Object[] { });
			instance.getClass().getSuperclass().getDeclaredMethod("start", new Class<?>[] { }).invoke(instance, new Object[] { });
		} catch (Throwable t) {
			t.printStackTrace();
		}
		super.initMouse();
	}

	@Override
	public URL getJar() {
		try {
			return new URL("http://bot.parabot.org/servers/infinity.jar");
		} catch(Throwable t) {
			t.printStackTrace();
		}
		return null;
	}
	
	/*public static Client getClient() {
		return (Client) Context.getInstance().getClient();
	}*/
	
	@Override
	public void addMenuItems(JMenuBar bar) {
		//new BotMenu(bar);
	}
	
	@Override
	public void injectHooks() {
		AddInterfaceAdapter.setAccessorPackage("org/rev724/min/accessors/");
		// default injection is done by bot, it basically parses the hooks file
		super.injectHooks();
	}
	
	@Override
	public void initScript(Script script) {
		//ScriptEngine.getInstance().setScript(script);
		//ScriptEngine.getInstance().init();
	}
	
	@Override
	public HookFile getHookFile() {
		/*try {
			return new HookFile(new URL("http://bot.parabot.org/hooks/724api_hooks_min.xml"), HookFile.TYPE_XML);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}*/
		return null;
	}
	
	public void unloadScript(Script script) {
		//ScriptEngine.getInstance().unload();
	}

}
