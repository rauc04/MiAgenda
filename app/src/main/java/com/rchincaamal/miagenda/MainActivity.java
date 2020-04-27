package com.rchincaamal.miagenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = findViewById(R.id.new_user);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), NewUser.class);
                startActivity(i);
            }
        });
    }





    /*private void showUsers(){
        SQLiteDatabase db = conn.getReadableDatabase();
        String[] pars = {"1"};
        String[] campos = {Utils.id_field,Utils.name_field,Utils.age_field};

        Cursor cursor = db.query(Utils.table_user,campos,Utils.id_field+"=?",pars,null,null,null);
        cursor.moveToFirst();
        Toast.makeText(getApplicationContext(),cursor.getString(1),Toast.LENGTH_SHORT).show();
        cursor.close();

    }*/
}