package tutorial.basics;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class DisplayExample {
	public static void main(String[] args) {
		DisplayExample displayExample = new DisplayExample();
		displayExample.start();
	}

	private void start() {
		try {
			Display.setDisplayMode(new DisplayMode(800, 600));
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}

		while (!Display.isCloseRequested()) {
			Display.update();
		}
		Display.destroy();
	}
}
