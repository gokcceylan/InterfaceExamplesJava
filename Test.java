
public class Test {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		
		Army army = new Army();
		Horseman hmans = new Horseman(1);
		Infantry infantry = new Infantry(2);
		Archer archer = new Archer(3);
		MountedArcher marcher = new MountedArcher(5);
		Infantry infantry_2 = new Infantry(10);
		Archer archer_2 = new Archer(10);
		
		hmans.speak();
		infantry.speak();
		archer.speak();
		marcher.speak();
		army.add(hmans);
		army.add(infantry);
		army.add(archer);
		army.add(marcher);
		army.print();
		hmans.useHorse();
		marcher.useHorse();
		hmans.useSword(infantry_2);
		hmans.useSword(archer_2);
		infantry.useSword(infantry_2);
		archer.useBow(archer_2);
		marcher.useBow(archer_2);
	}
}
