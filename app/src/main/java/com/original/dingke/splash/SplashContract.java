package com.original.dingke.splash;

import android.content.Context;

import com.original.dingke.tutorial.TutorialItem;

import java.util.ArrayList;


/**
 * @author rebeccafranks
 * @since 15/11/05.
 */
public interface SplashContract {
    interface View {
        void loadTutorial();

        void loadMainScreen();
    }

    interface UserActionsListener {
        void loadSplash();

        ArrayList<TutorialItem> getTutorialItems(Context context);

        void finishedTutorial();
    }
}
