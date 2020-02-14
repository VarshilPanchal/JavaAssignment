package Buillder;

public class Client {

	public static void main(String []args) {
		
		Phone phone1 = new BuilderPattern().setPhoneBrand("Android").setRam(8).setScreenSize(5).getPhone();
		
		System.out.println("Phone is :: "+phone1);
	}
}
