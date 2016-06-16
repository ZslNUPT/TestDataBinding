package com.njupt.sniper.testdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.njupt.sniper.testdatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_main);
         user = new User("zuo", "shenglong", 25);
        binding.setUser(user);

        //
      //  binding.firstName.setText(user.getFirstName());
    }

    public void changeData(View view) {
        user.setFirstName("sniper");
    }
}
