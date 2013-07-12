package biz.randgames.hexattacks.entidades;

import biz.randgames.hexattacks.Inmunidades;

public class Torreta extends ObjetoEnMapa {
	protected float rango;
	protected int nivel=-1;
	protected float factor;
	protected int tipoTorreta;
	
	public Torreta(){
		this.nivel=0;
		
	}
	
	public void aumentarRango(){
		if (this.nivel<3)
			this.rango=this.nivel+this.factor;
		else
			this.rango=this.nivel+this.factor*2;
		
	}
	public void aumentarNivel(){
		this.nivel++;
		aumentarRango();
	}
}
