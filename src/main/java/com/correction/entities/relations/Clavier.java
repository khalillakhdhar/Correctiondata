package com.correction.entities.relations;

import javax.persistence.Entity;

@Entity
public class Clavier extends Input {
private int capacite;

public int getCapacite() {
	return capacite;
}

public void setCapacite(int capacite) {
	this.capacite = capacite;
}




}
