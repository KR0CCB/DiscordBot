package me.discordbots;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

public class main extends ListenerAdapter{
    public static JDA api;

    public static void main(String[] args){
        try {
            api = new JDABuilder(AccountType.BOT).setToken(Ref.TOKEN).buildBlocking();
            api.getPresence().setGame(Game.of("자바로 만듬"));
            api.addEventListener(new Commands());
            api.addEventListener(new main());
        } catch (LoginException | IllegalArgumentException | InterruptedException | RateLimitedException e) {
            e.printStackTrace();
        }


    }
}
