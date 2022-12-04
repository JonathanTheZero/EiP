
public class Katze extends Animal implements IPredator, IPetAnimal {

	private Owner owner;

	public Katze(String name, Owner own) {
		super("Miau", name);
		owner = own;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

}
