
public class Application {

	
	public static void main(String []args) {
		Wizard wizard1 = new Wizard("Jeff");
		
		System.out.println(wizard1.toString());
		
		wizard1.isLocked();
		
		System.out.println(wizard1.isLocked());
		
		wizard1.takeDamage(10);
		
		wizard1.locked = true;
		
		System.out.println(wizard1.isLocked());
		
		wizard1.setKey(1);
		
		wizard1.takeDamage(10);
		
		System.out.println(wizard1.toString());
		
		System.out.println();
	
		
		
		
		
		
	}
	
}
