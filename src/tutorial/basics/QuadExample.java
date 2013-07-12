package tutorial.basics;

import java.util.Random;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

public class QuadExample {
	int posX = 100, posY = 100;
	int dirX = 1, dirY = 1;
	int velocidadX = 10, velocidadY = 13;
	int alto = 700, ancho = 1366;
	int tamano = 350;
	int limiteX = ancho - tamano, limiteY = alto - tamano;
	float r = 0.5f, b = 0.5f, g = 0.5f;
	Random rand = new Random();

	public void start() {
		try {
			Display.setDisplayMode(new DisplayMode(ancho, alto));
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}

		// init OpenGL
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, ancho, 0, alto, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);

		while (!Display.isCloseRequested()) {
			// Clear the screen and depth buffer
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);

			// set the color of the quad (R,G,B,A)
			GL11.glColor3f(r, g, b);

			// draw quad

			GL11.glBegin(GL11.GL_QUADS);
			if (posX > limiteX || posX <= 0) {
				dirX *= -1;
				r = rand.nextFloat();
				g = rand.nextFloat();
				b = rand.nextFloat();
				if (velocidadX > ancho*3)
					velocidadX = 0;
				velocidadX += 5;

			}
			if (posY > limiteY || posY <= 0) {
				dirY *= -1;
				r = rand.nextFloat();
				g = rand.nextFloat();
				b = rand.nextFloat();
				if (velocidadY > alto*3)
					velocidadY = 0;
				velocidadY += 5;
			}

			posX += dirX * velocidadX;
			posY += dirY * velocidadY;

			GL11.glVertex2f(posX, posY);
			GL11.glVertex2f(posX + tamano, posY);
			GL11.glVertex2f(posX + tamano, posY + tamano);
			GL11.glVertex2f(posX, posY + tamano);
			GL11.glEnd();

			Display.update();
		}

		Display.destroy();
	}

	public static void main(String[] argv) {
		QuadExample quadExample = new QuadExample();
		quadExample.start();
	}
}