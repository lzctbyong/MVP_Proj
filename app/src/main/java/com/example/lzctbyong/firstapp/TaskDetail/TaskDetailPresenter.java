package com.example.lzctbyong.firstapp.TaskDetail;

import android.util.Log;

import com.example.lzctbyong.firstapp.Data.Bean.Tasks;
import com.example.lzctbyong.firstapp.Data.TasksDataRepository;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by lzctbyong on 2017/1/31.
 */

public class TaskDetailPresenter implements TaskDetailContract.Presenter {
    private static final String TAG = "TaskDetailPresenter";

    private TaskDetailContract.View mView;
    private TasksDataRepository mTasksDataRepository;
    private CompositeDisposable mCompositeDisposable;

    @Inject
    public TaskDetailPresenter(TasksDataRepository mTasksDataRepository, TaskDetailContract.View mView) {
        this.mView = mView;
        this.mTasksDataRepository = mTasksDataRepository;
        mCompositeDisposable = new CompositeDisposable();
    }

    @Inject
    void injectPresenter() {
        mView.setPresenter(this);
    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unsubscribe() {
        mCompositeDisposable.clear();
    }

    @Override
    public void getTask() {
        Disposable mSubscribe = mTasksDataRepository.getTask()
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Tasks>() {
                    @Override
                    public void accept(Tasks mTasks) throws Exception {
                        Log.i(TAG, "accept1: ");
                        mView.setText(mTasks.getName());
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable mThrowable) throws Exception {
                        Log.i(TAG, "accept2: ");
                    }
                }, new Action() {
                    @Override
                    public void run() throws Exception {
                        Log.i(TAG, "run: ");
                    }
                });
        mCompositeDisposable.add(mSubscribe);
    }
}
