
public class Horseman implements Sword, Human, Horse{
	int count;
	public Horseman(int count) {
		this.count = count;
	}
	public Horseman() {
		
	}
	public void speak() {
		System.out.println("Riders of Theoden!");
	}
	
	public void useSword(Human h) {
		System.out.print("Your " + this.count + " Horseman used swords against ");
		if(h.tellClass().equals("Horseman")){
			System.out.println(((Horseman)h).count + " " + h.tellClass() );
		}
		else if(h.tellClass().equals("Infantry")){
			System.out.println(((Infantry)h).count + " " + h.tellClass() );
		}
		else if(h.tellClass().equals("Archer")){
			System.out.println(((Archer)h).count + " " +h.tellClass() );
		}
		else if(h.tellClass().equals("MountedArcher")){
			System.out.println(((MountedArcher)h).count + " " +h.tellClass() );
		}
	}
	public void useHorse() {
		System.out.println("Horses were used by " + this.tellClass() + "s");
	}
	public String tellClass() {
		return "Horseman";
	}
}
