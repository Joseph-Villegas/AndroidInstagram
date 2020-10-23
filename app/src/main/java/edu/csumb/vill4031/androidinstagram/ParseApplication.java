package edu.csumb.vill4031.androidinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Tu8CRnr0GuyksFGG3XhSuc7GjRVYWcL5ugVpL5o0")
                .clientKey("8fq4BhwgZVPXvb5duDRL7l8BmUzGB7AfrplBpRVR")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
