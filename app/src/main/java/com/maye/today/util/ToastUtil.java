package com.maye.today.util;

import android.widget.Toast;

import com.maye.today.global.TodayApplication;

public class ToastUtil {

    private static Toast toast;

    public static void showShortToast(String text) {
        if (toast == null) {
            toast = Toast.makeText(TodayApplication.getContext(), text, Toast.LENGTH_SHORT);
        } else {
            toast.setText(text);
            toast.setDuration(Toast.LENGTH_SHORT);
        }

        toast.show();
    }

    public static void showLongToast(String text) {
        if (toast == null) {
            toast = Toast.makeText(TodayApplication.getContext(), text, Toast.LENGTH_SHORT);
        } else {
            toast.setText(text);
            toast.setDuration(Toast.LENGTH_LONG);
        }

        toast.show();
    }

}
