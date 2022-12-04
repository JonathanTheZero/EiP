
public abstract class Animal implements IAnimal {
	protected String sound;
	protected String name;

	public Animal(String s, String n) {
		sound = s;
		name = n;
	}

	// Alternativ mit default Methoden lösbar, aber das ist wohl nicht im Sinne der
	// Aufgabenstellung
	public void introduce() {
		System.out.println(sound + "! Mein Name ist " + name + ".");
		if (this instanceof IPetAnimal) {
			System.out.println("Ich gehöre " + ((IPetAnimal) this).getOwner().getName() + ".");
		}
		if (this instanceof IPredator) {
			System.out.println("Achtung, ich bin ein Raubtier!");
		}
	}

	@Override
	public String getSound() {
		return sound;
	}

	@Override
	public void setSound(String s) {
		sound = s;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
}
