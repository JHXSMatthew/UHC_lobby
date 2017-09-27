package com.mcndsj.UHC_Lobby;

import com.mcndsj.Lobby_Display.Lobby_Display;
import com.mcndsj.UHC_Lobby.kitSystem.KitController;
import com.mcndsj.UHC_Lobby.listeners.PlayerListener;
import com.mcndsj.UHC_Lobby.scoreboard.UHCCaller;
import com.mcndsj.UHC_Lobby.serverSelector.ServerSelectorController;
import com.mcndsj.lobby_Control.LobbyControlAPIs;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Matthew on 2016/4/16.
 */
public class UHC_Lobby extends JavaPlugin{
    private ServerSelectorController control;
    private static UHC_Lobby instance;
    private KitController kit;
    public void onEnable() {
        instance = this;
        Lobby_Display.getInstance().getApi().registerBoardCaller(new UHCCaller());
        control = new ServerSelectorController();
        //kit = new KitController();


        getServer().getPluginManager().registerEvents(new PlayerListener(), this);

        LobbyControlAPIs.registerRestartPort(Config.startingPort);
    }

    public static UHC_Lobby get(){
        return instance;
    }
}
