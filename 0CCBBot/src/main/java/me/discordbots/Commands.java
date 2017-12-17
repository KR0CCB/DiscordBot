package me.discordbots;

import me.discordbots.commands.Ping;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter{

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] command = event.getMessage().getContent().split("");
        String message = event.getMessage().getContent();
        System.out.println(command[0]);
        if(!command[0].startsWith("@")) return;


        if(Ping.isPingCommand(command)){
            String sendMsg = "퐁!" + event.getJDA().getPing();
            event.getChannel().sendMessage(sendMsg).queue();
        }

    }
}
