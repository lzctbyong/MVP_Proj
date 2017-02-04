package com.example.lzctbyong.firstapp.Data;

import com.example.lzctbyong.firstapp.Data.Bean.Tasks;
import com.example.lzctbyong.firstapp.Utils.Local;
import com.example.lzctbyong.firstapp.Utils.Remote;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;

/**
 * Created by lzctbyong on 2017/1/31.
 */
@Singleton
public class TasksDataRepository implements TasksDataSource {

    private final TasksDataSource mTasksRemoteDataSource;

    private final TasksDataSource mTasksLocalDataSource;

    @Inject
    public TasksDataRepository(@Remote TasksDataSource mTasksRemoteDataSource, @Local TasksDataSource mTasksLocalDataSource) {
        this.mTasksRemoteDataSource = mTasksRemoteDataSource;
        this.mTasksLocalDataSource = mTasksLocalDataSource;
    }

    @Override
    public Observable<Tasks> getTask() {
        return mTasksLocalDataSource.getTask();
    }


}
