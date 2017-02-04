package com.example.lzctbyong.firstapp.Data;

import com.example.lzctbyong.firstapp.Data.Bean.Tasks;

import io.reactivex.Observable;


/**
 * Created by lzctbyong on 2017/1/31.
 */

public interface TasksDataSource {

    Observable<Tasks> getTask();

}
