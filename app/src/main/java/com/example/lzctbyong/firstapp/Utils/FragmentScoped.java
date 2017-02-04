package com.example.lzctbyong.firstapp.Utils;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by lzctbyong on 2017/1/31.
 */

@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface FragmentScoped {
}
