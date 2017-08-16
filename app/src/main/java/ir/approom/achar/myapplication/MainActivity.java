package ir.approom.achar.myapplication;

import android.content.DialogInterface;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button facebookLoginButton = (Button) findViewById(R.id.login_facebook_button);
        final Button loginButton = (Button) findViewById(R.id.login_button);
        Button forgetButton = (Button) findViewById(R.id.forget_button);

        EditText userNameEditText = (EditText) findViewById(R.id.userNameEditText);
        EditText passwordNameEditText = (EditText) findViewById(R.id.passwordEditText);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginButton.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
            }
        });





    }
}
