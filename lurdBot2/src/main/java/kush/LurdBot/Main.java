package kush.LurdBot;

import events.Roasts;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;



public class Main {

    public static void main(String[] args) throws Exception{
        JDABuilder builder = JDABuilder.createDefault("Nzc5NDI2MTg5Nzk3MzU5NjQ3.X7gXNA.vQgn_oHz3Mcv_QYp7ia-sq6KJic");
        builder.addEventListeners(new Roasts());
        builder.setAutoReconnect(true);
        builder.setActivity(Activity.playing("Why Cailin Built like that"));
        builder.setStatus(OnlineStatus.ONLINE);
        System.out.println("lurdBot is aliveeeee!!!!!");
        builder.build();

    }
}
