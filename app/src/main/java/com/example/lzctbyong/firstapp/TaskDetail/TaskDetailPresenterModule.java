package com.example.lzctbyong.firstapp.TaskDetail;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lzctbyong on 2017/1/31.
 */
@Module
public class TaskDetailPresenterModule {

    private TaskDetailContract.View mView;

    public TaskDetailPresenterModule(TaskDetailContract.View mView) {
        this.mView = mView;
    }

    @Provides
    TaskDetailContract.View provideView() {
        return mView;
    }


}
