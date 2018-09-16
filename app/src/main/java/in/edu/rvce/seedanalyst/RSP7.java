package in.edu.rvce.seedanalyst;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class RSP7 extends AppCompatActivity {
    public void fun(View v)
    {
        Toast.makeText((this), "That's all", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rsp7);
    }
}
