package com.gp20200317.order;

import com.gp20200317.order.actions.PauseAction;
import com.gp20200317.order.actions.PlayAction;
import com.gp20200317.order.actions.SpeedAction;
import com.gp20200317.order.actions.StopAction;

/**
 * 2020/3/17
 * author:ljh
 */
public class Test {
    public static void main(String[] args) {
        Player player = new Player();
        Controller controller = new Controller();

        IAction action1 = new PlayAction(player);
        IAction action2 = new SpeedAction(player);
        IAction action3 = new PauseAction(player);
        IAction action4 = new StopAction(player);

        controller.execute(action1);

        controller.addAction(action1);
        controller.addAction(action2);
        controller.addAction(action3);
        controller.addAction(action4);
        controller.executes();
    }
}
