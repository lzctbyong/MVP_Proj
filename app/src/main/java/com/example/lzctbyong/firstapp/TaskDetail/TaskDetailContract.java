package com.example.lzctbyong.firstapp.TaskDetail;

/**
 * Created by lzctbyong on 2017/1/30.
 */

public class TaskDetailContract {

    interface View {
        void setPresenter(Presenter mPresenter);

        void setText(String s);
    }

    interface Presenter {

        void getTask();

        void subscribe();

        void unsubscribe();
    }
}
