package in.edu.rvce.seedanalyst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SALogin extends AppCompatActivity {

    public void buttonClickFunction(View v) {
        EditText username = (EditText) findViewById(R.id.username_edit_text);
        EditText password = (EditText) findViewById(R.id.password_edit_text);

        if (username.getText().toString().equals("seedanalyst") && password.getText().toString().equals("admin123"))
        {
            Intent intent = new Intent(this, RCRorRSP.class);
            startActivity(intent);
        }
        else if ((!(username.getText().toString().equals("seedanalyst"))) || (!(password.getText().toString().equals("admin123"))))
        {
            Toast.makeText(this, "Invalid credentials.", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sa_login);
    }
}
