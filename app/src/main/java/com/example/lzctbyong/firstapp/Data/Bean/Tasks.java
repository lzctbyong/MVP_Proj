package com.example.lzctbyong.firstapp.Data.Bean;

/**
 * Created by lzctbyong on 2017/1/31.
 */

public class Tasks {

    private long id;

    private String name;

    private int age;

    public Tasks(long mId, String mName, int mAge) {

        id = mId;
        name = mName;
        age = mAge;
    }

    public long getId() {
        return id;
    }

    public void setId(long mId) {
        id = mId;
    }

    public String getName() {
        return name;
    }

    public void setName(String mName) {
        name = mName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int mAge) {
        age = mAge;
    }
}
