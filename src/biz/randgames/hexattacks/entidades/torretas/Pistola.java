package biz.randgames.hexattacks.entidades.torretas;

import biz.randgames.hexattacks.Colores;
import biz.randgames.hexattacks.Formas;
import biz.randgames.hexattacks.Inmunidades;
import biz.randgames.hexattacks.entidades.Torreta;

public class Pistola extends Torreta {
	public Pistola(){
		this.color=Colores.BLANCO;
		this.forma=Formas.PISTOLA;
		this.factor=2;
		aumentarNivel();
		this.tipoTorreta=Inmunidades.PISTOLA;
		
	}
	
	
}
