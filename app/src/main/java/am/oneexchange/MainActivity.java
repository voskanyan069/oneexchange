package am.oneexchange;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new ParseTask().execute();
        (new Handler()).postDelayed(this::toHome, 3333);
    }

    public void toHome() {
        startActivity(new Intent("am.oneexchange.RatesActivity"));
    }
}