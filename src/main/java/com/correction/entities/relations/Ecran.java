package com.correction.entities.relations;

import javax.persistence.Entity;

import org.springframework.lang.NonNull;

@Entity
public class Ecran extends Output {
@NonNull
private int resolution;

public int getResolution() {
	return resolution;
}

public void setResolution(int resolution) {
	this.resolution = resolution;
}




}
