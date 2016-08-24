package com.example.owlslubic.databindinglab;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.owlslubic.databindinglab.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.main_activity);
    Dog dog = new Dog("Mimi", "Labradoodle", "Brown/Apricot/Gray",6);
        binding.setDog(dog);



    }

}
