package in.edu.rvce.seedanalyst;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class RCR2 extends AppCompatActivity {

    public void proceedButton(View v) {
        Intent intent = new Intent(this,RCR3.class);
        startActivity(intent); }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rcr2);
    }
}
