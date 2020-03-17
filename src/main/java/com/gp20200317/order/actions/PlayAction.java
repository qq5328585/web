package com.gp20200317.order.actions;

import com.gp20200317.order.IAction;
import com.gp20200317.order.Player;

/**
 * 2020/3/17
 * author:ljh
 */
public class PlayAction implements IAction {
    private Player player;

    public PlayAction(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.play();
    }
}
