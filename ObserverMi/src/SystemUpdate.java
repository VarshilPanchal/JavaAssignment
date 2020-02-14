import java.util.ArrayList;
import java.util.List;
 
public class SystemUpdate implements SystemUpdateInterface {
     
    private List<SystemMessage> systemMessages = new ArrayList<>();
    @Override
  public void add(SystemMessage observer) {
      systemMessages.add(observer);
  }
    @Override
  public void remove(SystemMessage observer) {
	  systemMessages.remove(observer);
  }

    @Override
  public void notifyUpdate(Message message) {
        for(SystemMessage systemMessage: systemMessages) {
        	systemMessage.update(message);
        	
        }
        
    }

}