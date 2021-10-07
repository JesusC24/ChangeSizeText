package com.jesusc24.changesizetext;

import android.app.Application;

import com.jesusc24.changesizetext.data.model.User;

/**
 * Clase que sobreescribe el la creación de la aplicación para que el usuario sea
 * conocido por todas las activitys.
 */

public class ChangeSizeApplication extends Application {

    private User user;

    @Override
    public void onCreate() {
        super.onCreate();
        user = new User("Jesús", "jesus.cortesocana2408@gmail.com");
    }

    public User getUser() {
        return user;
    }
}
