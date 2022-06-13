package com.example.baterina_firebase_crud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editName;
    private EditText editAddress;
    private EditText editAge;
    private EditText editGender;
    private Button btnSave;
    private Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editName.getText().toString();
                String address = editAddress.getText().toString();
                String age = editAge.getText().toString();
                String gender= editGender.getText().toString();
                Database dao = new Database();

                Person person = new Person(name,address,age,gender);
                dao.add(person).addOnSuccessListener(success -> {
                    Toast.makeText(MainActivity.this, "Successfully saved", Toast.LENGTH_SHORT).show();
                });

                showMessage("Successfully saved!");

                editName.setText("");
                editAddress.setText("");
                editAge.setText("");
                editGender.setText("");
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();

                showMessage("Cleared!");
            }
        });
    }

    private void initComponents() {
        editName = (EditText) findViewById(R.id.editName);
        editAddress = (EditText) findViewById(R.id.editAddress);
        editAge= (EditText) findViewById(R.id.editAge);
        editGender= (EditText) findViewById(R.id.editGender);
        btnSave = (Button) findViewById(R.id.buttonSave);
        btnClear = (Button) findViewById(R.id.buttonClear);
    }

    private void showMessage(String message) {
        Toast toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT);
        toast.show();
    }

    private void clear (){
        editName.setText("");
        editAddress.setText("");
        editAge.setText("");
        editGender.setText("");
    }

}