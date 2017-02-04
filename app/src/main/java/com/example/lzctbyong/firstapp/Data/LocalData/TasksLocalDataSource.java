package com.example.lzctbyong.firstapp.Data.LocalData;

import android.content.Context;

import com.example.lzctbyong.firstapp.Data.Bean.Tasks;
import com.example.lzctbyong.firstapp.Data.TasksDataSource;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;

/**
 * Created by lzctbyong on 2017/1/31.
 */
@Singleton
public class TasksLocalDataSource implements TasksDataSource {
    private static final String TAG = "TasksLocalDataSource";

    private Context mContext;

    @Inject
    public TasksLocalDataSource(Context mContext) {
        this.mContext = mContext;
    }


    @Override
    public Observable<Tasks> getTask() {
        return Observable.just(new Tasks(1, "name1", 111));
    }
}
