package com.rchincaamal.miagenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.rchincaamal.miagenda.OpenHelper.SQLiteOpenHelper;
import com.rchincaamal.miagenda.utils.Utils;

public class NewUser extends AppCompatActivity {

    SQLiteOpenHelper conn;
    Button btn_add;
    TextInputEditText name_field, age_field, phone_field;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);

        conn = new SQLiteOpenHelper(this, Utils.dbName,null,Utils.db_version);

        btn_add = findViewById(R.id.btn_add_user);
        name_field = findViewById(R.id.name_field);
        age_field = findViewById(R.id.age_field);
        phone_field = findViewById(R.id.phone_field);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                store();
            }
        });
    }

    private void store(){
        SQLiteDatabase db = conn.getWritableDatabase();

        if( !validateFields() ){
            ContentValues val = new ContentValues();
            val.put(Utils.name_field, String.valueOf(name_field.getText()));
            val.put(Utils.age_field,String.valueOf(name_field.getText()));
            val.put(Utils.phone_field, String.valueOf(phone_field.getText()));
            Long res = db.insert(Utils.table_user,Utils.id_field,val);

            Toast.makeText(getApplicationContext(),"id registrado "+res,Toast.LENGTH_SHORT).show();
        }
    }

    private boolean validateFields(){

        if (name_field.getText()==null || name_field.getText().toString().isEmpty() ||
                age_field.getText()==null || age_field.getText().toString().isEmpty() ||
                phone_field.getText()==null || phone_field.getText().toString().isEmpty()) {
            return true;
        }
        return false;
    }
}
