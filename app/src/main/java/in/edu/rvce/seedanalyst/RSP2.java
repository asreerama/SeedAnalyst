package in.edu.rvce.seedanalyst;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class RSP2 extends AppCompatActivity {

    public void fun(View v)
    {
        Intent intent = new Intent(getApplicationContext(),RSP3.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rsp2);
        Spinner dropdown6 = findViewById(R.id.spinner6);
        String[] items6 = new String[]{"Sufficiently Equipped", "Partially Equipped", "Serious Shortage"};
        ArrayAdapter<String> adapter6 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items6);
        dropdown6.setAdapter(adapter6);
        Spinner dropdown7 = findViewById(R.id.spinner7);
        String[] items7 = new String[]{"Sufficiently Equipped ", "Partially Equipped", "Serious Shortage"};
        ArrayAdapter<String> adapter7 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items7);
        dropdown7.setAdapter(adapter7);
    }
}
