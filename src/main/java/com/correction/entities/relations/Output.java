package com.correction.entities.relations;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Output extends Device {
private String qualite;

public String getQualite() {
	return qualite;
}

public void setQualite(String qualite) {
	this.qualite = qualite;
}




}
