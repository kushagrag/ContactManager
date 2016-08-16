package com.example.kushagra.contactmanager;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;

public class MainActivity extends AppCompatActivity {

    Cursor phones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(!this.getResources().getBoolean(R.bool.is_landscape)){
            setContentView(R.layout.activity_main);
            Fragment mFragment = new ContactDisplayFragment();
            getFragmentManager().beginTransaction().replace(R.id.details, mFragment).commit();
        }
        else {
            setContentView(R.layout.activity_main);
        }

    }

}
