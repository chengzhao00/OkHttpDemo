package com.example.administrator.okhttpdemo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator.
 * Time:2016/5/24
 */
public class UserBean implements Parcelable {
    protected UserBean(Parcel in) {
    }

    public static final Creator<UserBean> CREATOR = new Creator<UserBean>() {
        @Override
        public UserBean createFromParcel(Parcel in) {
            return new UserBean(in);
        }

        @Override
        public UserBean[] newArray(int size) {
            return new UserBean[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
