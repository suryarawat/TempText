package com.initial.textApplication;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.annotation.LayoutRes;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;

import co.chatsdk.core.session.ChatSDK;
import co.chatsdk.ui.login.SplashScreenActivity;
import co.chatsdk.ui.main.BaseActivity;
import co.chatsdk.ui.manager.BaseInterfaceAdapter;

public class StartupActivity extends SplashScreenActivity {


    @RequiresApi(api = Build.VERSION_CODES.P)
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        imageView.setImageResource(R.mipmap.icon);
//        progressBar = (ProgressBar) findViewById(R.id.progressBar1);
        //progressBar.setOutlineAmbientShadowColor(111);
        //imageView.setImageResource(ChatSDK.config().logoDrawableResourceID);



    }


}
