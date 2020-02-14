
public class RedmiNote3 implements SystemMessage {

	@Override
	public void update(Message message) {
		// TODO Auto-generated method stub
		 System.out.println("RedmiNote3 :: " + message.getMessageContent());
	}

}
