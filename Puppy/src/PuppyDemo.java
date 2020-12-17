
public class PuppyDemo {

	public static void main(String[] args) {
	
		Puppy Rascal = new Puppy();
		Rascal.setWeight(22.5);
		
		Puppy Scruffy = new Puppy("Scruffy", "Golden Retriever", 11, 45.0);
		
		System.out.print(Scruffy.equals(Rascal));
		System.out.print("\n" + Rascal);
		System.out.print("\n" + Scruffy);
		
		
		
		

	}

}
