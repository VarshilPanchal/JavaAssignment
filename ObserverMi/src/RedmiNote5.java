public class RedmiNote5 implements SystemMessage 
{
    @Override
    public void update(Message message) {
        System.out.println("RedmiNote5 :: " + message.getMessageContent());
    }
}