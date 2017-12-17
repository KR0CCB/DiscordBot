package me.discordbots.commands;


public class Ping {
    public static boolean isPingCommand(String[] command){
        return (command[0].equalsIgnoreCase("@핑")) ? true : false;
    }

}
