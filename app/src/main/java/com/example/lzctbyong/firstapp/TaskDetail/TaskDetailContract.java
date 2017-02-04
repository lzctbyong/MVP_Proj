package com.example.lzctbyong.firstapp.TaskDetail;

import com.example.lzctbyong.firstapp.Utils.BasePresenter;
import com.example.lzctbyong.firstapp.Utils.BaseView;

/**
 * Created by lzctbyong on 2017/1/30.
 */

public class TaskDetailContract {

    interface View extends BaseView<Presenter> {

        void setText(String s);
    }

    interface Presenter extends BasePresenter {

        void getTask();

    }
}
