package ro.ase.csie.cts.course11.chain;

import java.util.Locale;

public class BroadcastMessageHandler extends ChatHandler{


    @Override
    public void processMessage(ChatMessage msg) {

        if(msg.destination.toLowerCase().equals("@everyone")){
            System.out.println("@everyone: ");
            System.out.println(msg.text);
        }

        if(this.next != null){
            this.next.processMessage(msg);
        }
    }
}
