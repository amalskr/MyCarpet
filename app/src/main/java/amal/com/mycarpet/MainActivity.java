package amal.com.mycarpet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText wdth_et, lnth_et, cost_et;
    private TextView total_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wdth_et = (EditText) findViewById(R.id.cptWidthEt);
        lnth_et = (EditText) findViewById(R.id.cptLenthEt);
        cost_et = (EditText) findViewById(R.id.cptCostEt);
        total_tv = (TextView) findViewById(R.id.totalCostTv);
    }

    public void calculateNow(View view) {

        if (wdth_et.length() != 0 && lnth_et.length() != 0 && cost_et.length() != 0) {
            double wdth = Double.valueOf(wdth_et.getText().toString());
            double lnth = Double.valueOf(lnth_et.getText().toString());
            double cost = Double.valueOf(cost_et.getText().toString());

            double totalCost = (wdth * lnth) * cost;
            total_tv.setText("GBP " + String.valueOf(totalCost));
        } else {
            Toast.makeText(getApplicationContext(), "All fields are required", Toast.LENGTH_LONG);
        }

    }

    public void resetNow(View view) {
        wdth_et.setText("");
        lnth_et.setText("");
        cost_et.setText("");
        total_tv.setText("GBP 0.00");
    }

}
