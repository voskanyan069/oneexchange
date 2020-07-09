package am.oneexchange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SettingsActivity extends AppCompatActivity {

    private ImageView btn_home_act;
    private ImageView btn_change_act;
    private ImageView btn_result_act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        init();
    }

    public void init() {
//        FOOTER_BUTTONS
        btn_home_act = findViewById(R.id.act_home);
        btn_change_act = findViewById(R.id.act_change);
        btn_result_act = findViewById(R.id.act_result);

        act_change(btn_home_act, "am.oneexchange.RatesActivity");
        act_change(btn_change_act, "am.oneexchange.SelectActivity");
        act_change(btn_result_act, "am.oneexchange.ResultActivity");
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
