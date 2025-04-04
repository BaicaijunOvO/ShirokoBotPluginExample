package ovo.baicaijun;

import ovo.baicaijun.ShirokoBot.Bot.CommandChain;
import ovo.baicaijun.ShirokoBot.Bot.MessageApi;
import ovo.baicaijun.ShirokoBot.Bot.MessageChain;
import ovo.baicaijun.ShirokoBot.Plugins.PluginExecutor;

/**
 * @Autho BaicaijunOvO
 * @Github https://github.com/BaicaijunOvO
 * @Date 2025/4/5 00:21
 */
public class Main implements PluginExecutor {

    @Override
    public void OnMessage(MessageChain messageChain) {

    }

    @Override
    public void OnCommand(String[] strings, CommandChain commandChain) {
        if (strings.length == 0){
            return;
        }
        MessageApi.send_msg(commandChain.getGroupId(),commandChain.getUserId(),commandChain.getBotId(),strings[0]);

    }
}