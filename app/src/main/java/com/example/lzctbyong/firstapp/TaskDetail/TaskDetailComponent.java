package com.example.lzctbyong.firstapp.TaskDetail;

import com.example.lzctbyong.firstapp.Data.TasksRepositoryComponent;
import com.example.lzctbyong.firstapp.Utils.FragmentScoped;

import dagger.Component;

/**
 * Created by lzctbyong on 2017/1/31.
 */

@FragmentScoped
@Component(dependencies = TasksRepositoryComponent.class, modules = TaskDetailPresenterModule.class)
public interface TaskDetailComponent {

    void inject(TaskDetailActivity mTaskDetailActivity);

}
