package biz.randgames.hexattacks.entidades.enemigos;

import biz.randgames.hexattacks.Inmunidades;
import biz.randgames.hexattacks.entidades.Enemigo;

public class Cuadro extends Enemigo {

	public Cuadro(){
		
		this.hp=100;
		this.inmunidad=Inmunidades.NINGUNA;
	}
}
