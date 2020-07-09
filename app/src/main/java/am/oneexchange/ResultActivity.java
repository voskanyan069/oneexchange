package am.oneexchange;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView from;
    private TextView to;
    private TextView money;

    private ImageView btn_home_act;
    private ImageView btn_change_act;
    private ImageView btn_settings_act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        init();
    }

    @SuppressLint("SetTextI18n")
    public void init() {
//        SET TEXT FROM FILE {RESOURCES}
        from = findViewById(R.id.from_text);
        to = findViewById(R.id.to_text);
        money = findViewById(R.id.money_text);

        from.setText(Resources.from);
        to.setText(Resources.to);
        money.setText("~" + String.valueOf((int) Resources.moneyValue) + "\n" + String.valueOf(Resources.moneyValue));

//        FOOTER_BUTTONS
        btn_home_act = findViewById(R.id.act_home);
        btn_change_act = findViewById(R.id.act_change);
        btn_settings_act = findViewById(R.id.act_settings);

        act_change(btn_home_act, "am.oneexchange.RatesActivity");
        act_change(btn_change_act, "am.oneexchange.SelectActivity");
        act_change(btn_settings_act, "am.oneexchange.SettingsActivity");
    }

//    FOOTER_BUTTONS_ACTION_CHANGE
    public void act_change(ImageView footer_btn, final String activity) {
        footer_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity));
            }
        });
    }
}
