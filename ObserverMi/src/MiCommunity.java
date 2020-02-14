public class MiCommunity {
	public static void main(String[] args) {
		RedmiNote3 redmiNote3 = new RedmiNote3();
		RedmiNote4 redmiNote4 = new RedmiNote4();
		RedmiNote5 redmiNote5 = new RedmiNote5();

		SystemUpdate systemUpdateof = new SystemUpdate();

		systemUpdateof.add(redmiNote5);
		// RedmiNote5 will receive the update
		systemUpdateof.notifyUpdate(new Message("First Update released "));

		
		systemUpdateof.remove(redmiNote5);
		systemUpdateof.add(redmiNote4);
		systemUpdateof.add(redmiNote3);
		// RedmiNote3 and RedmiNote4 will receive the update
		systemUpdateof.notifyUpdate(new Message("first  Update released after latest model phone"));

	}
}