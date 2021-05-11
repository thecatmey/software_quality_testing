package ro.ase.csie.cts.course11.chain;

public abstract class ChatHandler {

    ChatHandler next = null;

    public void setNext(ChatHandler next) {
        this.next = next;
    }

    public abstract void processMessage(ChatMessage msg);
}
