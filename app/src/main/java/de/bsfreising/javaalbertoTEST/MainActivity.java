package de.bsfreising.javaalbertoTEST;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    TextView txvheader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        float size = new Button(this).getTextSize();
        Toast.makeText(this, "Textgröße", Toast.LENGTH_LONG).show();

        txvheader = findViewById(R.id.txvHeader);
        Button btnRed = findViewById(R.id.btnRed);
        Button btnEnde = findViewById(R.id.btnEnde);
        Button btnGelb = findViewById(R.id.btnGelb);

        btnEnde.setOnClickListener(this);
        btnGelb.setOnClickListener(this);
        btnRed.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btnRed:
                txvheader.setBackgroundColor(Color.RED);
                break;
            case  R.id.btnEnde:
                finish();
                break;
            case R.id.btnGelb:
                txvheader.setBackgroundColor(Color.YELLOW);
                //test

        }

    }
}
