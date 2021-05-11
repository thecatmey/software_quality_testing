package ro.ase.csie.cts.course11.chain;

public class TestChain {

    public static void main(String[] args) {

        ChatHandler broadcastNode = new BroadcastMessageHandler();
        ChatHandler privateNode = new PrivateMessageHandler();
        ChatHandler filterNode = new EnglishFilter(7);

        filterNode.setNext(privateNode);
        privateNode.setNext(broadcastNode);

        ChatHandler chatServer = filterNode;

        chatServer.processMessage(new ChatMessage("@everyone", "Hello!", 1));
        chatServer.processMessage(new ChatMessage("@everyone", "hit Superman. It's a bot", 1));
        chatServer.processMessage(new ChatMessage("@steve", "Hi, sucker", 1));
    }
}
