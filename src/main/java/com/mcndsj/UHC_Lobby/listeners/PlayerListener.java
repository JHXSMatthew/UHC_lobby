package com.mcndsj.UHC_Lobby.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Created by Matthew on 2016/4/17.
 */
public class PlayerListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent evt){
        evt.setJoinMessage("");
    }
}
