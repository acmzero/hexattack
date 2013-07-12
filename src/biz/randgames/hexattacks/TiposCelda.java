package biz.randgames.hexattacks;

import biz.randgames.hexattacks.entidades.Celda;
import biz.randgames.hexattacks.entidades.celdas.Pared;
import biz.randgames.hexattacks.entidades.celdas.Piso;

public class TiposCelda {
	public static Celda getCeldaPorTipo(int x) {
		switch (x) {
		case 0:
			return new Pared();
		case 1:
			return new Piso();
		}

		return new Pared();
	}
}
