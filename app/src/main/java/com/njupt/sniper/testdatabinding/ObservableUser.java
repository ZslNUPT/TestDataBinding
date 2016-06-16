package com.njupt.sniper.testdatabinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * author：Zsl
 * date：2016/6/16
 */
public class ObservableUser extends BaseObservable {
    private String firstName;
    private String lastName;

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(com.njupt.sniper.testdatabinding.BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(com.njupt.sniper.testdatabinding.BR.lastName);
    }
}
