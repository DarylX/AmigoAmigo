package com.apps.daryl.amigoamigo.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by Daryl on 9/30/2015.
 */
public class BumpToolBar{

    private Toolbar toolbar;
    private AppCompatActivity context;

    public BumpToolBar(AppCompatActivity context,View id){
        toolbar = (Toolbar)id;
        this.context = context;
    }

    public BumpToolBar(AppCompatActivity context,int id){
        this(context,context.findViewById(id));
    }

    public void setUpToolBar(){
        context.setSupportActionBar(toolbar);
    }

}
