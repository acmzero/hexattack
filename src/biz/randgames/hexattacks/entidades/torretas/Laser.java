package biz.randgames.hexattacks.entidades.torretas;

import biz.randgames.hexattacks.Colores;
import biz.randgames.hexattacks.Formas;
import biz.randgames.hexattacks.Inmunidades;
import biz.randgames.hexattacks.entidades.Torreta;

public class Laser extends Torreta {
	public Laser(){
		this.color=Colores.VERDE;
		this.forma=Formas.LASER;
		this.factor=2;
		aumentarNivel();
		this.tipoTorreta=Inmunidades.LASER;
		
	}
	
	
}
