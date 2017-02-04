package com.example.lzctbyong.firstapp.TaskDetail;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.lzctbyong.firstapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class TaskDetailFragment extends Fragment implements TaskDetailContract.View {
    private static final String TAG = "TaskDetailFragment";

    @BindView(R.id.fragment_task_detail_button)
    Button mFragmentTaskDetailButton;
    @BindView(R.id.fragment_task_detail_text)
    TextView mFragmentTaskDetailText;
    private TaskDetailContract.Presenter mPresenter;

    public TaskDetailFragment() {
        // Required empty public constructor
    }

    public static TaskDetailFragment newInstance() {

        Bundle args = new Bundle();

        TaskDetailFragment fragment = new TaskDetailFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mView = inflater.inflate(R.layout.fragment_task_detail, container, false);
        ButterKnife.bind(this, mView);
        return mView;
    }

    @Override
    public void setPresenter(TaskDetailContract.Presenter mPresenter) {
        this.mPresenter = mPresenter;
    }

    @Override
    public void setText(String s) {
        mFragmentTaskDetailText.setText(s);
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.subscribe();
    }

    @Override
    public void onPause() {
        super.onPause();
        mPresenter.unsubscribe();
    }

    @OnClick(R.id.fragment_task_detail_button)
    public void onClick() {
        mPresenter.getTask();
    }
}
