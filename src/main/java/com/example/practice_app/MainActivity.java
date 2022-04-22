package com.example.practice_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.util.Log; //equivalent to print statements
import android.widget.Button; //gives access to button
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //boolean isClicked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this.isClicked = false;
    }

    /*public void sayHello(View v)
    {
        System.out.println("Hello World!");
    }*/

    public void sayHello(View v) {
        //int elemId = v.getId(); //get the id attribute of the button
        //v.setEnabled(false);
        //Log.d("success", "Button disabled");//terminal output
        Button b = (Button) v; //create new object b and cast it to type button
        if(b.getText().equals("Click to learn more!")) {
            b.setText("Howdy!");
            //isClicked = true;
            Toast.makeText(this, "thanks for clicking", Toast.LENGTH_LONG).show(); //displays alert
        }
        else
        {
            b.setText("Click to learn more!");
        }


    }
}