package ie.dit.git;

public class Critter {
	
	private int eyes;
	
	public String sayHello(String name) {
		return "Hello " + name;
	}
	
	public void printHello() {
		System.out.println("Method call returns: " + sayHello("Triona"));
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	
}
