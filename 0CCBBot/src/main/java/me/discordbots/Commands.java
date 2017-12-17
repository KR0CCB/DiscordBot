package me.discordbots;

import me.discordbots.commands.Ping;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import me.discordbots.commands.Math;
public class Commands extends ListenerAdapter{

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] command = event.getMessage().getContent().split(" ");
        String message = event.getMessage().getContent();

        if(!command[0].startsWith("@")) return;

        if(Ping.isPingCommand(command)){

            String sendMsg = "퐁! " + event.getJDA().getPing() + " /ms";
            event.getChannel().sendMessage(sendMsg).queue();
        }

        if(command[0].equalsIgnoreCase("@계산기")){
            if(command[1].equalsIgnoreCase("+")){
                String sendMsg = String.valueOf(Math.Plus(Double.parseDouble(command[2]),Double.parseDouble(command[3])));
                event.getChannel().sendMessage(sendMsg).queue();
            }
            else if(command[1].equalsIgnoreCase("-")){
                String sendMsg = String.valueOf(Math.Minus(Double.parseDouble(command[2]),Double.parseDouble(command[3])));
                event.getChannel().sendMessage(sendMsg).queue();
            }
            else if(command[1].equalsIgnoreCase("*")){
                String sendMsg = String.valueOf(Math.Multiplication(Double.parseDouble(command[2]),Double.parseDouble(command[3])));
                event.getChannel().sendMessage(sendMsg).queue();
            }
            else if(command[1].equalsIgnoreCase("/")){
                String sendMsg = String.valueOf(Math.Division(Double.parseDouble(command[2]),Double.parseDouble(command[3])));
                event.getChannel().sendMessage(sendMsg).queue();
            }
        }



    }
}
