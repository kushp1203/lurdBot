package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Roasts extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String roast[] = new String[] {"STFU libtard", "Hello dumbass", "Hi", "Like you want me to eat your butt"
        , "Hi friend", "Do not say Hi to lurdBot peasant", "Hi, but why you built like a pubic stache", "Hello", "Yo!",
                "Whats good with you"};
        String messageSent = event.getMessage().getContentRaw();
        if(messageSent.equalsIgnoreCase("Hello lurdBot")){
            event.getChannel().sendMessage(roast[(int)(Math.random() *9)]).queue();

        }
    }

}
