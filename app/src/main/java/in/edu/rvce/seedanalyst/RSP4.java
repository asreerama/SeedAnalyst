package in.edu.rvce.seedanalyst;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class RSP4 extends AppCompatActivity {
    public void fun(View v)
    {
        Intent intent = new Intent(getApplicationContext(),RSP5.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rsp4);
    }
}
