package com.example.lzctbyong.firstapp.TaskDetail;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.example.lzctbyong.firstapp.App;
import com.example.lzctbyong.firstapp.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TaskDetailActivity extends AppCompatActivity {

    @BindView(R.id.contentFrame)
    FrameLayout mContentFrame;

    @Inject
    TaskDetailPresenter mTaskDetailPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_detail);
        ButterKnife.bind(this);

        TaskDetailFragment mTaskDetailFragment = (TaskDetailFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);
        if (mTaskDetailFragment == null) {
            mTaskDetailFragment = TaskDetailFragment.newInstance();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.contentFrame, mTaskDetailFragment);
            transaction.commit();
        }
        DaggerTaskDetailComponent.builder()
                .taskDetailPresenterModule(new TaskDetailPresenterModule(mTaskDetailFragment))
                .tasksRepositoryComponent(((App) getApplication()).getTasksRepositoryComponent())
                .build().inject(this);
    }
}
