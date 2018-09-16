package in.edu.rvce.seedanalyst;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class RCRorRSP extends AppCompatActivity {

   public void clickRCR(View v)
    {
        Intent intent = new Intent(this,RCRDetails.class);
        startActivity(intent);
    }


    public void clickRSP(View v)
    {
        Intent intent = new Intent(this,RSPDetails.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rcr_or_rsp);
    }
}
