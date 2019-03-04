package application;


public class Electronic {

private int UniqueID;
private String name;
private int release;
private int weight;
private boolean instock;


//Constructor to uniquely set an ID
public Electronic() {
this.UniqueID = this.setID();	
}	

//Constructor which calls the other constructor and sets the object up completely
public Electronic (String name, int release, int weight, boolean instock) {
this();
this.name = name;
this.release = release;
this.weight = weight;
this.instock = instock;
}

//Method for creating the UniqueID
private int setID(){
int UniqueID =-1;
UniqueID = UniqueID++;
return UniqueID;
}


//Getters and Setter

public int getUniqueID() {
	return UniqueID;
}

public void setUniqueID(int uniqueID) {
	UniqueID = uniqueID;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getRelease() {
	return release;
}

public void setRelease(int release) {
	this.release = release;
}

public int getWeight() {
	return weight;
}

public void setWeight(int weight) {
	this.weight = weight;
}

public boolean isInstock() {
	return instock;
}

public void setInstock(boolean instock) {
	this.instock = instock;
}
	



}






