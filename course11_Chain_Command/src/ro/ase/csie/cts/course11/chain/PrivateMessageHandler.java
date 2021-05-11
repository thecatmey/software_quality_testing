package ro.ase.csie.cts.course11.chain;

import java.util.Locale;

public class PrivateMessageHandler extends ChatHandler{


    @Override
    public void processMessage(ChatMessage msg) {
       if(msg.destination.toLowerCase().equals("@everyone")) {
           if(this.next != null){
               this.next.processMessage(msg);
           }
       } else {
           System.out.println("Private message for " + msg.destination + ":");
           System.out.println(msg.text);
       }
    }
}
