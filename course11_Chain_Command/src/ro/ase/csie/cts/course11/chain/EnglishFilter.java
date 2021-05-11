package ro.ase.csie.cts.course11.chain;

import java.util.Locale;

public class EnglishFilter extends ChatHandler{

    public static String[] forbiddenWords = new String[] {"violent", "hit", "kill"};

    public int ageLimit;

    public EnglishFilter(int ageLimit) {
        super();
        this.ageLimit = ageLimit;
    }

    @Override
    public void processMessage(ChatMessage msg) {
        boolean isSafe = true;
        for(String word: forbiddenWords) {
            if(msg.text.toLowerCase().contains(word)){
                isSafe = false;
                break;
            }
        }

        if(isSafe){
            if(this.next != null){
                this.next.processMessage(msg);
            }
        }
    }
}
