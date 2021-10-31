package com.correction.entities.relations;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Input extends Device {
private String mode;

public String getMode() {
	return mode;
}

public void setMode(String mode) {
	this.mode = mode;
}



}
