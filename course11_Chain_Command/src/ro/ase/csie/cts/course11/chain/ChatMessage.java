package ro.ase.csie.cts.course11.chain;

public class ChatMessage {

    String destination;
    String text;
    int priority;

    public ChatMessage(String destination, String text, int priority) {
        super();
        this.destination = destination;
        this.text = text;
        this.priority = priority;
    }
}
