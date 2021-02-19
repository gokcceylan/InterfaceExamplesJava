
public class MountedArcher implements Bow, Human, Horse{

	int count;
	public MountedArcher(int count) {
		this.count = count;
	}
	public MountedArcher() {
		
	}
	public void speak() {
		System.out.println("We must defend Rivendell");
	}
	public void useBow(Human h) {
		System.out.print("Your " + this.count + " MountedArcher used swords against ");
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
		return "MountedArcher";
	}
}
