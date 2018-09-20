package com.cadiducho.bot.modules.core.cmds;

import com.cadiducho.bot.BotServer;
import com.cadiducho.bot.api.command.BotCommand;
import com.cadiducho.bot.api.command.CommandInfo;
import com.cadiducho.telegrambotapi.Chat;
import com.cadiducho.telegrambotapi.Message;
import com.cadiducho.telegrambotapi.User;
import com.cadiducho.telegrambotapi.exception.TelegramException;

import java.time.Instant;

@CommandInfo(aliases = {"/cadibot", "/version", "/start", "/about"})
public class VersionCMD implements BotCommand {
    
    @Override
    public void execute(final Chat chat, final User from, final String label, final String[] args, final Integer messageId, final Message replyingTo, Instant instant) throws TelegramException {
        String aboutme = "Hola! Soy Cadibot \n" +
                "Se está ejecutando la versión _" + BotServer.VERSION + "_ \n" +
                "Información y novedades: @Cadibotnews";

        getBot().sendMessage(chat.getId(), aboutme, "markdown", null, false, messageId, null);
    }
}