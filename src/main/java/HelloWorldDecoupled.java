/**
 * Created by Admin on 20.11.2017.
 */
public class HelloWorldDecoupled  {
    public static void main(String[] args) {
        MessageRender mr = new StandartOutMessageRender();
        MessageProvider provider = new HelloWorldMessageProvider();
        mr.setMessageProvider(provider);
        mr.render();
    }
}
