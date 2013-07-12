package biz.randgames.hexattacks.entidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import biz.randgames.hexattacks.TiposCelda;

public class Mapa {
	int tamanoX = 400, tamanoY = 712;
	String dirMapas = "";
	protected Celda[][] mapa = new Celda[5][5];

	public void ponerCelda(int x, int y, int tipoCelda) {

		this.mapa[x][y] = TiposCelda.getCeldaPorTipo(tipoCelda);
	}

	private void leerMapa(String nombreMapa) throws FileNotFoundException {
		File fMapa = new File(dirMapas, nombreMapa + ".map");
		Scanner sc = new Scanner(fMapa);
		for (int i = 0; i < this.mapa.length; i++) {
			for (int j = 0; j < this.mapa[0].length; j++) {
				ponerCelda(i, j, sc.nextInt());
			}
		}
	}
}
