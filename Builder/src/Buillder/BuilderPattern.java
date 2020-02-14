package Buillder;

public class BuilderPattern {

	private String phoneBrand;
	private double screenSize;
	private int ram;
	
	public BuilderPattern setPhoneBrand(String phoneBrand) {
		this.phoneBrand = phoneBrand;
		return this;
	}

	public BuilderPattern setScreenSize(double d) {
		this.screenSize = d;
		return this;
	}

	public BuilderPattern setRam(int ram) {
		this.ram = ram;
		return this;
	}

		public Phone getPhone() {
			
		return new Phone(phoneBrand, screenSize, ram);
	}
}
