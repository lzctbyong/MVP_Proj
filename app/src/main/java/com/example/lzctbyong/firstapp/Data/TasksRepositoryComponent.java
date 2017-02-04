package com.example.lzctbyong.firstapp.Data;

import com.example.lzctbyong.firstapp.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by lzctbyong on 2017/1/31.
 */
@Singleton
@Component(modules = {TasksRepositoryModule.class, AppModule.class})
public interface TasksRepositoryComponent {

    TasksDataRepository getTasksDataRepository();

}
