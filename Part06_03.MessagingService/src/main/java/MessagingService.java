import java.util.ArrayList;

/**
 *
 * @author trist
 */
public class MessagingService {

    private ArrayList<Message> list;

    public MessagingService() {
        list = new ArrayList<>();
    }
    
    public void add(Message message){
        if(message.getContent().length() <= 280){
            list.add(message);
        }
    }
    
    public ArrayList<Message> getMessages(){
        return list;
    } 
}
