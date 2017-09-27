package com.mcndsj.UHC_Lobby.serverSelector;

import com.mcndsj.LobbyServerSelector.LobbyServerSelector;

/**
 * Created by Matthew on 2016/4/18.
 */
public class ServerSelectorController {
    public ServerSelectorController(){
        LobbyServerSelector.getInstance().getApi().register("uhc","极限生存");
    }
}
