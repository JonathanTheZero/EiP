public class Schaf extends Animal implements IPetAnimal {
	
	private Owner owner;
	
	public Schaf(String name, Owner own) {
		super("Mäh", name);
		owner = own;
	}

	@Override
	public Owner getOwner() {
		return owner;
	}

	@Override
	public void setOwner(Owner o) {
		owner = o;		
	}

}
