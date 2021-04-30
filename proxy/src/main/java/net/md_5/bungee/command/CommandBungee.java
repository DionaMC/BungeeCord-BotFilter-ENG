package net.md_5.bungee.command;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class CommandBungee extends Command
{

    public CommandBungee()
    {
        super( "bungee" );
    }

    @Override
    public void execute(CommandSender sender, String[] args)
    {
        sender.sendMessage( "§aBungeeCord by md_5 §7» §bBotFilter-ENG §7» §fhttps://github.com/LoyisaStinks/BungeeCord-BotFilter-ENG" );
    }
}
