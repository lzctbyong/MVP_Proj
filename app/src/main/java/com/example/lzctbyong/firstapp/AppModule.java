package com.example.lzctbyong.firstapp;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lzctbyong on 2017/1/31.
 */

@Module
public class AppModule {
    private final Context mContext;

    public AppModule(Context mContext) {
        this.mContext = mContext;
    }

    @Provides
    Context provideContext() {
        return mContext;
    }
}
