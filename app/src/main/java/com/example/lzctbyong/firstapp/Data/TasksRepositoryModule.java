package com.example.lzctbyong.firstapp.Data;

import com.example.lzctbyong.firstapp.Data.LocalData.TasksLocalDataSource;
import com.example.lzctbyong.firstapp.Data.RemoteData.TasksRemoteDataSource;
import com.example.lzctbyong.firstapp.Utils.Local;
import com.example.lzctbyong.firstapp.Utils.Remote;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

/**
 * Created by lzctbyong on 2017/1/31.
 */
@Module
abstract class TasksRepositoryModule {


    @Local
    @Singleton
    @Binds
    abstract TasksDataSource provideTasksLocalDataSource(TasksLocalDataSource mTasksLocalDataSource);

    @Remote
    @Singleton
    @Binds
    abstract TasksDataSource provideTasksRemoteDataSource(TasksRemoteDataSource mTasksRemoteDataSource);
}
