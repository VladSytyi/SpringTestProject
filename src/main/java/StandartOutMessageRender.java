/**
 * Created by Admin on 20.11.2017.
 */
public class StandartOutMessageRender implements MessageRender {


    private MessageProvider messageProvider;

    @Override
    public void render() {
        if(messageProvider == null){
            throw  new RuntimeException("You must set the property messageProvider of Class:" +
            StandartOutMessageRender.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
