package Buillder;

public class Phone {
		private String phoneBrand;
		private double screenSize;
		private int ram;
		
		

		public Phone(String phoneBrand, double screenSize, int ram) {
			super();
			this.phoneBrand = phoneBrand;
			this.screenSize = screenSize;
			this.ram = ram;
		}

		@Override
		public String toString() {
			return "Phone [phoneBrand= " + phoneBrand + " , screenSize= " + screenSize + " inches , ram= " + ram + " GB]";
		}
		
		

}
