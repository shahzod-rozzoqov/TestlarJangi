package uz.shoh.testlarjangibot.bot;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import uz.shoh.testlarjangibot.config.BotConfig;
import uz.shoh.testlarjangibot.handler.UpdateHandler;

@Component
@RequiredArgsConstructor
public class MySpringBot extends TelegramLongPollingBot {
    private final BotConfig botConfig;
    private final UpdateHandler updateHandler;

    @Override
    public void onUpdateReceived(Update update) {
        updateHandler.handler(update);
    }

    @Override
    public String getBotToken() {
        return botConfig.getToken();
    }

    @Override
    public String getBotUsername() {
        return botConfig.getUsername();
    }
}
