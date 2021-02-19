
public class Army{
	
	public Human [] army = new Human[10];
	public int i = 0;
	
	public void add(Human h) {
		this.army[i] = h;
		i++;
	}
	
	public void print() {
		for(int a = 0; a < i ; a++) {
			if(army[a].tellClass().equals("Horseman")){
				System.out.println(((Horseman)army[a]).count + " number of " + army[a].getClass().getName() + " were added your army.");
			}
			else if(army[a].tellClass().equals("Infantry")){
				System.out.println(((Infantry)army[a]).count + " number of " + army[a].getClass().getName() + " were added your army.");
			}
			else if(army[a].tellClass().equals("Archer")){
				System.out.println(((Archer)army[a]).count + " number of " + army[a].getClass().getName() + " were added your army.");
			}
			else if(army[a].tellClass().equals("MountedArcher")){
				System.out.println(((MountedArcher)army[a]).count + " number of " + army[a].getClass().getName() + " were added your army.");
			}
			//we type casted because although we are aware of each of them's classes
			//java is not and needs explaining
		}
	}
}
