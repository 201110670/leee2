package com.lee.agecalulator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MyActivity extends Activity {
    EditText amount1;
    EditText amount2;
    TextView tt;
    Button calculate;
    double x=0;
    double y=0;
    double z=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        initControls();
    }
    private void initControls()
    {
        amount1=(EditText)findViewById(R.id.editText);
        amount2=(EditText)findViewById(R.id.editText2);
        tt=(TextView)findViewById(R.id.textView4);
        calculate=(Button)findViewById(R.id.button);
        calculate.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v) {
                calculate();}
        });
    }
    private void calculate()
    {
        x=Double.parseDouble(amount1.getText().toString());
        y=Double.parseDouble(amount2.getText().toString());
        z=y-x;
        tt.setText(Double.toString(z));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
