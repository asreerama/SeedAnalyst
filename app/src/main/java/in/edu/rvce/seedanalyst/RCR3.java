package in.edu.rvce.seedanalyst;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class RCR3 extends AppCompatActivity {

    public void finishButton(View v){
        Toast.makeText(this,"Registered RealTime", Toast.LENGTH_SHORT);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rcr3);
    }
}
