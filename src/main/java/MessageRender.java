/**
 * Created by Admin on 20.11.2017.
 */
public interface MessageRender {

    void render();
    void setMessageProvider(MessageProvider messageProvider);
    MessageProvider getMessageProvider();

}
