package com.gp20200317.order;

import java.util.ArrayList;
import java.util.List;

/**
 * 2020/3/17
 * author:ljh
 */
public class Controller {
    private List<IAction> actionList = new ArrayList<IAction>();

    public void addAction(IAction action) {
        actionList.add(action);
    }

    public void execute(IAction action) {
        action.execute();
    }

    public void executes() {
        for(IAction action : actionList) {
            action.execute();
        }
    }

}
