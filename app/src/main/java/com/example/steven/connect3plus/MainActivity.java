package com.example.steven.connect3plus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSignIn;

    private EditText editTextEmail;
    private EditText editTextPassword;

    RelativeLayout activity_main;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();

        btnSignIn = (Button) findViewById(R.id.buttonSignIn);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        activity_main = (RelativeLayout) findViewById(R.id.activity_main);

        btnSignIn.setOnClickListener(this);
    }

    //CHECK if user is signed in
    @Override
    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser == null) {
            this.findViewById(R.id.activity_main);
        } else {
            //startActivity(new Intent(MainActivity.this, Homepage.class));
        }
    }

    @Override
    public void onClick(View view) {

    }
}
