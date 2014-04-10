package org.rev724.min.loader;

import java.applet.Applet;
import java.applet.AppletStub;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Properties;

public class AppletProvider extends Applet implements AppletStub {
	private static final long serialVersionUID = 6168729758399483281L;
	private Properties parameters;

	public AppletProvider() {
		parameters = new Properties();
		parameters.put("separate_jvm", "true");
		parameters.put("boxbgcolor", "black");
		parameters
				.put("image", "http://www.runescape.com/img/game/splash2.gif");
		parameters.put("centerimage", "true");
		parameters.put("boxborder", "false");
		parameters
				.put("java_arguments",
						"-Xmx256m -Xss2m -Dsun.java2d.noddraw=true -XX:CompileThreshold=1500 -Xincgc -XX:+UseConcMarkSweepGC -XX:+UseParNewGC");
		parameters.put("27", "0");
		parameters.put("1", "0");
		parameters.put("16", "false");
		parameters.put("17", "false");
		parameters.put("21", "1");
		parameters.put("30", "false");
		parameters.put("20", "127.0.0.1");
		parameters.put("29", "");
		parameters.put("11", "true");
		parameters.put("25", "1378752098");
		parameters.put("28", "0");
		parameters.put("8", ".runescape.com");
		parameters.put("23", "false");
		parameters.put("32", "0");
		parameters.put("15", "wwGlrZHF5gKN6D3mDdihco3oPeYN2KFybL9hUUFqOvk");
		parameters.put("0", "IjGJjn4L3q5lRpOR9ClzZQ");
		parameters.put("2", "");
		parameters.put("4", "1");
		parameters.put("14", "");
		parameters.put("5", "8194");
		parameters.put("-1", "QlwePyRU5GcnAn1lr035ag");
		parameters.put("6", "0");
		parameters
				.put("24",
						"true,false,0,43,200,18,0,21,354,-15,Verdana,11,0xF4ECE9,candy_bar_middle.gif,candy_bar_back.gif,candy_bar_outline_left.gif,candy_bar_outline_right.gif,candy_bar_outline_top.gif,candy_bar_outline_bottom.gif,loadbar_body_left.gif,loadbar_body_right.gif,loadbar_body_fill.gif,6");
		parameters.put("3", "hAJWGrsaETglRjuwxMwnlA/d5W6EgYWx");
		parameters.put("12", "false");
		parameters.put("13", "0");
		parameters.put("26", "0");
		parameters.put("9", "77");
		parameters.put("22", "false");
		parameters.put("18", "false");
		parameters.put("33", "");
		parameters.put("haveie6", "false");
	}

	@Override
	public void appletResize(int w, int h) {

	}

	@Override
	public String getParameter(String key) {
		return parameters.getProperty(key);
	}

	@Override
	public URL getDocumentBase() {
		return getCodeBase();
	}

	@Override
	public URL getCodeBase() {
		try {
			return new URL("http://192.184.9.31");
		} catch (Exception localException) {
			localException.printStackTrace();
		}
		return null;
	}
	
	public void supply(Object client) {
		try {
			Method m = client.getClass().getSuperclass().getDeclaredMethod("supplyApplet", new Class<?>[] { Applet.class });
			if(!m.isAccessible()) {
				m.setAccessible(true);
			}
			m.invoke(client, new Object[] { this });
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
