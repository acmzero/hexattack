package biz.randgames.hexattacks.entidades.enemigos;


import biz.randgames.hexattacks.Colores;
import biz.randgames.hexattacks.Formas;
import biz.randgames.hexattacks.Inmunidades;
import biz.randgames.hexattacks.entidades.Enemigo;

public class Cuadro extends Enemigo {

	public Cuadro(){
		
		this.hp=100;
		this.inmunidad=Inmunidades.NINGUNA;
		this.color=Colores.AMARILLO;
		this.velocidad= 1;
		this.forma= Formas.CUADRADO;
		
	}
}
