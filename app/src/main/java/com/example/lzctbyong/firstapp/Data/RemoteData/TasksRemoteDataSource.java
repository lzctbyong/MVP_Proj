package com.example.lzctbyong.firstapp.Data.RemoteData;

import com.example.lzctbyong.firstapp.Data.Bean.Tasks;
import com.example.lzctbyong.firstapp.Data.TasksDataSource;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;

/**
 * Created by lzctbyong on 2017/1/31.
 */
@Singleton
public class TasksRemoteDataSource implements TasksDataSource {
    private static final String TAG = "TasksRemoteDataSource";

    @Inject
    public TasksRemoteDataSource() {
    }


    @Override
    public Observable<Tasks> getTask() {
        return null;
    }
}
