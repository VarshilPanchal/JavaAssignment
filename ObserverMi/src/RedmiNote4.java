public class RedmiNote4 implements SystemMessage 
{
    @Override
    public void update(Message message) {
        System.out.println("RedmiNote4 :: " + message.getMessageContent());
    }
}