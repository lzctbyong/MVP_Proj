package com.example.lzctbyong.firstapp;

import android.app.Application;

import com.example.lzctbyong.firstapp.Data.DaggerTasksRepositoryComponent;
import com.example.lzctbyong.firstapp.Data.TasksRepositoryComponent;


/**
 * Created by lzctbyong on 2017/1/29.
 */


public class App extends Application {

    private TasksRepositoryComponent mTasksRepositoryComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mTasksRepositoryComponent = DaggerTasksRepositoryComponent.builder()
                .appModule(new AppModule(getApplicationContext()))
                .build();
    }

    public TasksRepositoryComponent getTasksRepositoryComponent() {
        return mTasksRepositoryComponent;
    }
}
