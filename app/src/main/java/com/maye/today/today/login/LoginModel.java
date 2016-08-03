package com.maye.today.today.login;


import okhttp3.ResponseBody;
import rx.Observable;

/**
 * LoginModel接口
 */
public interface LoginModel {

    Observable<ResponseBody> login(String username, String password);
}
