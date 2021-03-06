interface Helper{
	public void help();
}

class Man implements Helper {
	public void help() {
		System.out.println("man helping...");
	}
}

class Woman implements Helper {
	public void help() {
		System.out.println("woman helping...");
	}
}

class Elephant implements Helper {
	public void help() {
		System.out.println("elephant helping...");
	}
}

public class Sample {
	public static void seekHelpFrom(Helper helper) {
		helper.help();
	}

	public static void main(String[] args) {
		Man bob = new Man();
		
		seekHelpFrom(bob);
		
		Woman sarah = new Woman();
		
		seekHelpFrom(sarah);
		
		Elephant dumbo = new Elephant();
		
		seekHelpFrom(dumbo);
 
	}

}
