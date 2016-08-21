package com.original.dingke.network.controller;

import com.original.dingke.app.App;
import com.original.dingke.network.NetworkUtil;
import com.original.dingke.network.callback.UiDisplayListener;

/**
 * Created by Yang on 15/11/23.
 */
public abstract class BaseHttpController<T> {
    protected UiDisplayListener<T> uiDisplayListener;


    public BaseHttpController() {

    }

    public BaseHttpController(UiDisplayListener<T> uiDisplayListener) {
        this.uiDisplayListener = uiDisplayListener;
    }

    public void setUiDisplayListener(UiDisplayListener<T> uiDisplayListener) {
        this.uiDisplayListener = uiDisplayListener;
    }

    public void loadData() {
        if (NetworkUtil.isNetworkAvailable(App.getsContext())) {
            getNetData();
        } else {
            if (null != uiDisplayListener) {
                uiDisplayListener.onFailDisplay(null);
            }
        }
    }

    protected abstract void getNetData();
}
