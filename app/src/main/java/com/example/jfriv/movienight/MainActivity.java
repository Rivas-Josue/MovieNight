package com.example.jfriv.movienight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setting the toolbar
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        //Josue Rivas - my comment to commit to the repository
        //Gama Tellez - my comment :)
        //cor16004 - my comment
    }

    public void setSupportActionBar(Toolbar myToolbar) {
    }
}
