package am.oneexchange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;


public class SelectActivity extends AppCompatActivity {

    private EditText money;
    private Button change;

    private Spinner from_spinner;
    private Spinner to_spinner;

    private ImageView btn_home_act;
    private ImageView btn_result_act;
    private ImageView btn_settings_act;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        init();
        change();
    }

    public void init() {
        from_spinner = findViewById(R.id.spinner_from);
        to_spinner = findViewById(R.id.spinner_to);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.rates_array, R.layout.spinner_item);

        adapter.setDropDownViewResource(R.layout.spinner_item);
        from_spinner.setAdapter(adapter);
        to_spinner.setAdapter(adapter);

//        CHANGE
        money = findViewById(R.id.inputMoney);
        change = findViewById(R.id.change_btn);

//        FOOTER_BUTTONS
        btn_home_act = findViewById(R.id.act_home);
        btn_result_act = findViewById(R.id.act_result);
        btn_settings_act = findViewById(R.id.act_settings);

        act_change(btn_home_act, "am.oneexchange.RatesActivity");
        act_change(btn_result_act, "am.oneexchange.ResultActivity");
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

    public void change() {
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources.from = String.valueOf(from_spinner.getSelectedItem());
                Resources.to = String.valueOf(to_spinner.getSelectedItem());
                double rate_f = 0;
                double rate_t = 0;

                switch (Resources.from) {
                    case "AED":
                        rate_f = Resources.AED;
                        break;
                    case "AFN":
                        rate_f = Resources.AFN;
                        break;
                    case "ALL":
                        rate_f = Resources.ALL;
                        break;
                    case "AMD":
                        rate_f = Resources.AMD;
                        break;
                    case "ANG":
                        rate_f = Resources.ANG;
                        break;
                    case "AOA":
                        rate_f = Resources.AOA;
                        break;
                    case "ARS":
                        rate_f = Resources.ARS;
                        break;
                    case "AUD":
                        rate_f = Resources.AUD;
                        break;
                    case "AWG":
                        rate_f = Resources.AWG;
                        break;
                    case "AZN":
                        rate_f = Resources.AZN;
                        break;
                    case "BAM":
                        rate_f = Resources.BAM;
                        break;
                    case "BBD":
                        rate_f = Resources.BBD;
                        break;
                    case "BDT":
                        rate_f = Resources.BDT;
                        break;
                    case "BGN":
                        rate_f = Resources.BGN;
                        break;
                    case "BHD":
                        rate_f = Resources.BHD;
                        break;
                    case "BIF":
                        rate_f = Resources.BIF;
                        break;
                    case "BMD":
                        rate_f = Resources.BMD;
                        break;
                    case "BND":
                        rate_f = Resources.BND;
                        break;
                    case "BOB":
                        rate_f = Resources.BOB;
                        break;
                    case "BRL":
                        rate_f = Resources.BRL;
                        break;
                    case "BSD":
                        rate_f = Resources.BSD;
                        break;
                    case "BTC":
                        rate_f = Resources.BTC;
                        break;
                    case "BTN":
                        rate_f = Resources.BTN;
                        break;
                    case "BWP":
                        rate_f = Resources.BWP;
                        break;
                    case "BYN":
                        rate_f = Resources.BYN;
                        break;
                    case "BZD":
                        rate_f = Resources.BZD;
                        break;
                    case "CAD":
                        rate_f = Resources.CAD;
                        break;
                    case "CDF":
                        rate_f = Resources.CDF;
                        break;
                    case "CHF":
                        rate_f = Resources.CHF;
                        break;
                    case "CLF":
                        rate_f = Resources.CLF;
                        break;
                    case "CLP":
                        rate_f = Resources.CLP;
                        break;
                    case "CNH":
                        rate_f = Resources.CNH;
                        break;
                    case "CNY":
                        rate_f = Resources.CNY;
                        break;
                    case "COP":
                        rate_f = Resources.COP;
                        break;
                    case "CRC":
                        rate_f = Resources.CRC;
                        break;
                    case "CUC":
                        rate_f = Resources.CUC;
                        break;
                    case "CUP":
                        rate_f = Resources.CUP;
                        break;
                    case "CVE":
                        rate_f = Resources.CVE;
                        break;
                    case "CZK":
                        rate_f = Resources.CZK;
                        break;
                    case "DJF":
                        rate_f = Resources.DJF;
                        break;
                    case "DKK":
                        rate_f = Resources.DKK;
                        break;
                    case "DOP":
                        rate_f = Resources.DOP;
                        break;
                    case "DZD":
                        rate_f = Resources.DZD;
                        break;
                    case "EGP":
                        rate_f = Resources.EGP;
                        break;
                    case "ERN":
                        rate_f = Resources.ERN;
                        break;
                    case "ETB":
                        rate_f = Resources.ETB;
                        break;
                    case "EUR":
                        rate_f = Resources.EUR;
                        break;
                    case "FJD":
                        rate_f = Resources.FJD;
                        break;
                    case "FKP":
                        rate_f = Resources.FKP;
                        break;
                    case "GBP":
                        rate_f = Resources.GBP;
                        break;
                    case "GEL":
                        rate_f = Resources.GEL;
                        break;
                    case "GGP":
                        rate_f = Resources.GGP;
                        break;
                    case "GHS":
                        rate_f = Resources.GHS;
                        break;
                    case "GIP":
                        rate_f = Resources.GIP;
                        break;
                    case "GMD":
                        rate_f = Resources.GMD;
                        break;
                    case "GNF":
                        rate_f = Resources.GNF;
                        break;
                    case "GTQ":
                        rate_f = Resources.GTQ;
                        break;
                    case "GYD":
                        rate_f = Resources.GYD;
                        break;
                    case "HKD":
                        rate_f = Resources.HKD;
                        break;
                    case "HNL":
                        rate_f = Resources.HNL;
                        break;
                    case "HRK":
                        rate_f = Resources.HRK;
                        break;
                    case "HTG":
                        rate_f = Resources.HTG;
                        break;
                    case "HUF":
                        rate_f = Resources.HUF;
                        break;
                    case "IDR":
                        rate_f = Resources.IDR;
                        break;
                    case "ILS":
                        rate_f = Resources.ILS;
                        break;
                    case "IMP":
                        rate_f = Resources.IMP;
                        break;
                    case "INR":
                        rate_f = Resources.INR;
                        break;
                    case "IQD":
                        rate_f = Resources.IQD;
                        break;
                    case "IRR":
                        rate_f = Resources.IRR;
                        break;
                    case "ISK":
                        rate_f = Resources.ISK;
                        break;
                    case "JEP":
                        rate_f = Resources.JEP;
                        break;
                    case "JMD":
                        rate_f = Resources.JMD;
                        break;
                    case "JOD":
                        rate_f = Resources.JOD;
                        break;
                    case "JPY":
                        rate_f = Resources.JPY;
                        break;
                    case "KES":
                        rate_f = Resources.KES;
                        break;
                    case "KGS":
                        rate_f = Resources.KGS;
                        break;
                    case "KHR":
                        rate_f = Resources.KHR;
                        break;
                    case "KMF":
                        rate_f = Resources.KMF;
                        break;
                    case "KPW":
                        rate_f = Resources.KPW;
                        break;
                    case "KRW":
                        rate_f = Resources.KRW;
                        break;
                    case "KWD":
                        rate_f = Resources.KWD;
                        break;
                    case "KYD":
                        rate_f = Resources.KYD;
                        break;
                    case "KZT":
                        rate_f = Resources.KZT;
                        break;
                    case "LAK":
                        rate_f = Resources.LAK;
                        break;
                    case "LBP":
                        rate_f = Resources.LBP;
                        break;
                    case "LKR":
                        rate_f = Resources.LKR;
                        break;
                    case "LRD":
                        rate_f = Resources.LRD;
                        break;
                    case "LSL":
                        rate_f = Resources.LSL;
                        break;
                    case "LYD":
                        rate_f = Resources.LYD;
                        break;
                    case "MAD":
                        rate_f = Resources.MAD;
                        break;
                    case "MDL":
                        rate_f = Resources.MDL;
                        break;
                    case "MGA":
                        rate_f = Resources.MGA;
                        break;
                    case "MKD":
                        rate_f = Resources.MKD;
                        break;
                    case "MMK":
                        rate_f = Resources.MMK;
                        break;
                    case "MNT":
                        rate_f = Resources.MNT;
                        break;
                    case "MOP":
                        rate_f = Resources.MOP;
                        break;
                    case "MRO":
                        rate_f = Resources.MRO;
                        break;
                    case "MRU":
                        rate_f = Resources.MRU;
                        break;
                    case "MUR":
                        rate_f = Resources.MUR;
                        break;
                    case "MVR":
                        rate_f = Resources.MVR;
                        break;
                    case "MWK":
                        rate_f = Resources.MWK;
                        break;
                    case "MXN":
                        rate_f = Resources.MXN;
                        break;
                    case "MYR":
                        rate_f = Resources.MYR;
                        break;
                    case "MZN":
                        rate_f = Resources.MZN;
                        break;
                    case "NAD":
                        rate_f = Resources.NAD;
                        break;
                    case "NGN":
                        rate_f = Resources.NGN;
                        break;
                    case "NIO":
                        rate_f = Resources.NIO;
                        break;
                    case "NOK":
                        rate_f = Resources.NOK;
                        break;
                    case "NPR":
                        rate_f = Resources.NPR;
                        break;
                    case "NZD":
                        rate_f = Resources.NZD;
                        break;
                    case "OMR":
                        rate_f = Resources.OMR;
                        break;
                    case "PAB":
                        rate_f = Resources.PAB;
                        break;
                    case "PEN":
                        rate_f = Resources.PEN;
                        break;
                    case "PGK":
                        rate_f = Resources.PGK;
                        break;
                    case "PHP":
                        rate_f = Resources.PHP;
                        break;
                    case "PKR":
                        rate_f = Resources.PKR;
                        break;
                    case "PLN":
                        rate_f = Resources.PLN;
                        break;
                    case "PYG":
                        rate_f = Resources.PYG;
                        break;
                    case "QAR":
                        rate_f = Resources.QAR;
                        break;
                    case "RON":
                        rate_f = Resources.RON;
                        break;
                    case "RSD":
                        rate_f = Resources.RSD;
                        break;
                    case "RUB":
                        rate_f = Resources.RUB;
                        break;
                    case "RWF":
                        rate_f = Resources.RWF;
                        break;
                    case "SAR":
                        rate_f = Resources.SAR;
                        break;
                    case "SBD":
                        rate_f = Resources.SBD;
                        break;
                    case "SCR":
                        rate_f = Resources.SCR;
                        break;
                    case "SDG":
                        rate_f = Resources.SDG;
                        break;
                    case "SEK":
                        rate_f = Resources.SEK;
                        break;
                    case "SGD":
                        rate_f = Resources.SGD;
                        break;
                    case "SHP":
                        rate_f = Resources.SHP;
                        break;
                    case "SLL":
                        rate_f = Resources.SLL;
                        break;
                    case "SOS":
                        rate_f = Resources.SOS;
                        break;
                    case "SRD":
                        rate_f = Resources.SRD;
                        break;
                    case "SSP":
                        rate_f = Resources.SSP;
                        break;
                    case "STD":
                        rate_f = Resources.STD;
                        break;
                    case "STN":
                        rate_f = Resources.STN;
                        break;
                    case "SVC":
                        rate_f = Resources.SVC;
                        break;
                    case "SYP":
                        rate_f = Resources.SYP;
                        break;
                    case "SZL":
                        rate_f = Resources.SZL;
                        break;
                    case "THB":
                        rate_f = Resources.THB;
                        break;
                    case "TJS":
                        rate_f = Resources.TJS;
                        break;
                    case "TMT":
                        rate_f = Resources.TMT;
                        break;
                    case "TND":
                        rate_f = Resources.TND;
                        break;
                    case "TOP":
                        rate_f = Resources.TOP;
                        break;
                    case "TRY":
                        rate_f = Resources.TRY;
                        break;
                    case "TTD":
                        rate_f = Resources.TTD;
                        break;
                    case "TWD":
                        rate_f = Resources.TWD;
                        break;
                    case "TZS":
                        rate_f = Resources.TZS;
                        break;
                    case "UAH":
                        rate_f = Resources.UAH;
                        break;
                    case "UGX":
                        rate_f = Resources.UGX;
                        break;
                    case "USD":
                        rate_f = Resources.USD;
                        break;
                    case "UYU":
                        rate_f = Resources.UYU;
                        break;
                    case "UZS":
                        rate_f = Resources.UZS;
                        break;
                    case "VEF":
                        rate_f = Resources.VEF;
                        break;
                    case "VES":
                        rate_f = Resources.VES;
                        break;
                    case "VND":
                        rate_f = Resources.VND;
                        break;
                    case "VUV":
                        rate_f = Resources.VUV;
                        break;
                    case "WST":
                        rate_f = Resources.WST;
                        break;
                    case "XAF":
                        rate_f = Resources.XAF;
                        break;
                    case "XAG":
                        rate_f = Resources.XAG;
                        break;
                    case "XAU":
                        rate_f = Resources.XAU;
                        break;
                    case "XCD":
                        rate_f = Resources.XCD;
                        break;
                    case "XDR":
                        rate_f = Resources.XDR;
                        break;
                    case "XOF":
                        rate_f = Resources.XOF;
                        break;
                    case "XPD":
                        rate_f = Resources.XPD;
                        break;
                    case "XPF":
                        rate_f = Resources.XPF;
                        break;
                    case "XPT":
                        rate_f = Resources.XPT;
                        break;
                    case "YER":
                        rate_f = Resources.YER;
                        break;
                    case "ZAR":
                        rate_f = Resources.ZAR;
                        break;
                    case "ZMW":
                        rate_f = Resources.ZMW;
                        break;
                    case "ZWL":
                        rate_f = Resources.ZWL;
                        break;
                }

                switch (Resources.to) {
                    case "AED":
                        rate_t = Resources.AED;
                        break;
                    case "AFN":
                        rate_t = Resources.AFN;
                        break;
                    case "ALL":
                        rate_t = Resources.ALL;
                        break;
                    case "AMD":
                        rate_t = Resources.AMD;
                        break;
                    case "ANG":
                        rate_t = Resources.ANG;
                        break;
                    case "AOA":
                        rate_t = Resources.AOA;
                        break;
                    case "ARS":
                        rate_t = Resources.ARS;
                        break;
                    case "AUD":
                        rate_t = Resources.AUD;
                        break;
                    case "AWG":
                        rate_t = Resources.AWG;
                        break;
                    case "AZN":
                        rate_t = Resources.AZN;
                        break;
                    case "BAM":
                        rate_t = Resources.BAM;
                        break;
                    case "BBD":
                        rate_t = Resources.BBD;
                        break;
                    case "BDT":
                        rate_t = Resources.BDT;
                        break;
                    case "BGN":
                        rate_t = Resources.BGN;
                        break;
                    case "BHD":
                        rate_t = Resources.BHD;
                        break;
                    case "BIF":
                        rate_t = Resources.BIF;
                        break;
                    case "BMD":
                        rate_t = Resources.BMD;
                        break;
                    case "BND":
                        rate_t = Resources.BND;
                        break;
                    case "BOB":
                        rate_t = Resources.BOB;
                        break;
                    case "BRL":
                        rate_t = Resources.BRL;
                        break;
                    case "BSD":
                        rate_t = Resources.BSD;
                        break;
                    case "BTC":
                        rate_t = Resources.BTC;
                        break;
                    case "BTN":
                        rate_t = Resources.BTN;
                        break;
                    case "BWP":
                        rate_t = Resources.BWP;
                        break;
                    case "BYN":
                        rate_t = Resources.BYN;
                        break;
                    case "BZD":
                        rate_t = Resources.BZD;
                        break;
                    case "CAD":
                        rate_t = Resources.CAD;
                        break;
                    case "CDF":
                        rate_t = Resources.CDF;
                        break;
                    case "CHF":
                        rate_t = Resources.CHF;
                        break;
                    case "CLF":
                        rate_t = Resources.CLF;
                        break;
                    case "CLP":
                        rate_t = Resources.CLP;
                        break;
                    case "CNH":
                        rate_t = Resources.CNH;
                        break;
                    case "CNY":
                        rate_t = Resources.CNY;
                        break;
                    case "COP":
                        rate_t = Resources.COP;
                        break;
                    case "CRC":
                        rate_t = Resources.CRC;
                        break;
                    case "CUC":
                        rate_t = Resources.CUC;
                        break;
                    case "CUP":
                        rate_t = Resources.CUP;
                        break;
                    case "CVE":
                        rate_t = Resources.CVE;
                        break;
                    case "CZK":
                        rate_t = Resources.CZK;
                        break;
                    case "DJF":
                        rate_t = Resources.DJF;
                        break;
                    case "DKK":
                        rate_t = Resources.DKK;
                        break;
                    case "DOP":
                        rate_t = Resources.DOP;
                        break;
                    case "DZD":
                        rate_t = Resources.DZD;
                        break;
                    case "EGP":
                        rate_t = Resources.EGP;
                        break;
                    case "ERN":
                        rate_t = Resources.ERN;
                        break;
                    case "ETB":
                        rate_t = Resources.ETB;
                        break;
                    case "EUR":
                        rate_t = Resources.EUR;
                        break;
                    case "FJD":
                        rate_t = Resources.FJD;
                        break;
                    case "FKP":
                        rate_t = Resources.FKP;
                        break;
                    case "GBP":
                        rate_t = Resources.GBP;
                        break;
                    case "GEL":
                        rate_t = Resources.GEL;
                        break;
                    case "GGP":
                        rate_t = Resources.GGP;
                        break;
                    case "GHS":
                        rate_t = Resources.GHS;
                        break;
                    case "GIP":
                        rate_t = Resources.GIP;
                        break;
                    case "GMD":
                        rate_t = Resources.GMD;
                        break;
                    case "GNF":
                        rate_t = Resources.GNF;
                        break;
                    case "GTQ":
                        rate_t = Resources.GTQ;
                        break;
                    case "GYD":
                        rate_t = Resources.GYD;
                        break;
                    case "HKD":
                        rate_t = Resources.HKD;
                        break;
                    case "HNL":
                        rate_t = Resources.HNL;
                        break;
                    case "HRK":
                        rate_t = Resources.HRK;
                        break;
                    case "HTG":
                        rate_t = Resources.HTG;
                        break;
                    case "HUF":
                        rate_t = Resources.HUF;
                        break;
                    case "IDR":
                        rate_t = Resources.IDR;
                        break;
                    case "ILS":
                        rate_t = Resources.ILS;
                        break;
                    case "IMP":
                        rate_t = Resources.IMP;
                        break;
                    case "INR":
                        rate_t = Resources.INR;
                        break;
                    case "IQD":
                        rate_t = Resources.IQD;
                        break;
                    case "IRR":
                        rate_t = Resources.IRR;
                        break;
                    case "ISK":
                        rate_t = Resources.ISK;
                        break;
                    case "JEP":
                        rate_t = Resources.JEP;
                        break;
                    case "JMD":
                        rate_t = Resources.JMD;
                        break;
                    case "JOD":
                        rate_t = Resources.JOD;
                        break;
                    case "JPY":
                        rate_t = Resources.JPY;
                        break;
                    case "KES":
                        rate_t = Resources.KES;
                        break;
                    case "KGS":
                        rate_t = Resources.KGS;
                        break;
                    case "KHR":
                        rate_t = Resources.KHR;
                        break;
                    case "KMF":
                        rate_t = Resources.KMF;
                        break;
                    case "KPW":
                        rate_t = Resources.KPW;
                        break;
                    case "KRW":
                        rate_t = Resources.KRW;
                        break;
                    case "KWD":
                        rate_t = Resources.KWD;
                        break;
                    case "KYD":
                        rate_t = Resources.KYD;
                        break;
                    case "KZT":
                        rate_t = Resources.KZT;
                        break;
                    case "LAK":
                        rate_t = Resources.LAK;
                        break;
                    case "LBP":
                        rate_t = Resources.LBP;
                        break;
                    case "LKR":
                        rate_t = Resources.LKR;
                        break;
                    case "LRD":
                        rate_t = Resources.LRD;
                        break;
                    case "LSL":
                        rate_t = Resources.LSL;
                        break;
                    case "LYD":
                        rate_t = Resources.LYD;
                        break;
                    case "MAD":
                        rate_t = Resources.MAD;
                        break;
                    case "MDL":
                        rate_t = Resources.MDL;
                        break;
                    case "MGA":
                        rate_t = Resources.MGA;
                        break;
                    case "MKD":
                        rate_t = Resources.MKD;
                        break;
                    case "MMK":
                        rate_t = Resources.MMK;
                        break;
                    case "MNT":
                        rate_t = Resources.MNT;
                        break;
                    case "MOP":
                        rate_t = Resources.MOP;
                        break;
                    case "MRO":
                        rate_t = Resources.MRO;
                        break;
                    case "MRU":
                        rate_t = Resources.MRU;
                        break;
                    case "MUR":
                        rate_t = Resources.MUR;
                        break;
                    case "MVR":
                        rate_t = Resources.MVR;
                        break;
                    case "MWK":
                        rate_t = Resources.MWK;
                        break;
                    case "MXN":
                        rate_t = Resources.MXN;
                        break;
                    case "MYR":
                        rate_t = Resources.MYR;
                        break;
                    case "MZN":
                        rate_t = Resources.MZN;
                        break;
                    case "NAD":
                        rate_t = Resources.NAD;
                        break;
                    case "NGN":
                        rate_t = Resources.NGN;
                        break;
                    case "NIO":
                        rate_t = Resources.NIO;
                        break;
                    case "NOK":
                        rate_t = Resources.NOK;
                        break;
                    case "NPR":
                        rate_t = Resources.NPR;
                        break;
                    case "NZD":
                        rate_t = Resources.NZD;
                        break;
                    case "OMR":
                        rate_t = Resources.OMR;
                        break;
                    case "PAB":
                        rate_t = Resources.PAB;
                        break;
                    case "PEN":
                        rate_t = Resources.PEN;
                        break;
                    case "PGK":
                        rate_t = Resources.PGK;
                        break;
                    case "PHP":
                        rate_t = Resources.PHP;
                        break;
                    case "PKR":
                        rate_t = Resources.PKR;
                        break;
                    case "PLN":
                        rate_t = Resources.PLN;
                        break;
                    case "PYG":
                        rate_t = Resources.PYG;
                        break;
                    case "QAR":
                        rate_t = Resources.QAR;
                        break;
                    case "RON":
                        rate_t = Resources.RON;
                        break;
                    case "RSD":
                        rate_t = Resources.RSD;
                        break;
                    case "RUB":
                        rate_t = Resources.RUB;
                        break;
                    case "RWF":
                        rate_t = Resources.RWF;
                        break;
                    case "SAR":
                        rate_t = Resources.SAR;
                        break;
                    case "SBD":
                        rate_t = Resources.SBD;
                        break;
                    case "SCR":
                        rate_t = Resources.SCR;
                        break;
                    case "SDG":
                        rate_t = Resources.SDG;
                        break;
                    case "SEK":
                        rate_t = Resources.SEK;
                        break;
                    case "SGD":
                        rate_t = Resources.SGD;
                        break;
                    case "SHP":
                        rate_t = Resources.SHP;
                        break;
                    case "SLL":
                        rate_t = Resources.SLL;
                        break;
                    case "SOS":
                        rate_t = Resources.SOS;
                        break;
                    case "SRD":
                        rate_t = Resources.SRD;
                        break;
                    case "SSP":
                        rate_t = Resources.SSP;
                        break;
                    case "STD":
                        rate_t = Resources.STD;
                        break;
                    case "STN":
                        rate_t = Resources.STN;
                        break;
                    case "SVC":
                        rate_t = Resources.SVC;
                        break;
                    case "SYP":
                        rate_t = Resources.SYP;
                        break;
                    case "SZL":
                        rate_t = Resources.SZL;
                        break;
                    case "THB":
                        rate_t = Resources.THB;
                        break;
                    case "TJS":
                        rate_t = Resources.TJS;
                        break;
                    case "TMT":
                        rate_t = Resources.TMT;
                        break;
                    case "TND":
                        rate_t = Resources.TND;
                        break;
                    case "TOP":
                        rate_t = Resources.TOP;
                        break;
                    case "TRY":
                        rate_t = Resources.TRY;
                        break;
                    case "TTD":
                        rate_t = Resources.TTD;
                        break;
                    case "TWD":
                        rate_t = Resources.TWD;
                        break;
                    case "TZS":
                        rate_t = Resources.TZS;
                        break;
                    case "UAH":
                        rate_t = Resources.UAH;
                        break;
                    case "UGX":
                        rate_t = Resources.UGX;
                        break;
                    case "USD":
                        rate_t = Resources.USD;
                        break;
                    case "UYU":
                        rate_t = Resources.UYU;
                        break;
                    case "UZS":
                        rate_t = Resources.UZS;
                        break;
                    case "VEF":
                        rate_t = Resources.VEF;
                        break;
                    case "VES":
                        rate_t = Resources.VES;
                        break;
                    case "VND":
                        rate_t = Resources.VND;
                        break;
                    case "VUV":
                        rate_t = Resources.VUV;
                        break;
                    case "WST":
                        rate_t = Resources.WST;
                        break;
                    case "XAF":
                        rate_t = Resources.XAF;
                        break;
                    case "XAG":
                        rate_t = Resources.XAG;
                        break;
                    case "XAU":
                        rate_t = Resources.XAU;
                        break;
                    case "XCD":
                        rate_t = Resources.XCD;
                        break;
                    case "XDR":
                        rate_t = Resources.XDR;
                        break;
                    case "XOF":
                        rate_t = Resources.XOF;
                        break;
                    case "XPD":
                        rate_t = Resources.XPD;
                        break;
                    case "XPF":
                        rate_t = Resources.XPF;
                        break;
                    case "XPT":
                        rate_t = Resources.XPT;
                        break;
                    case "YER":
                        rate_t = Resources.YER;
                        break;
                    case "ZAR":
                        rate_t = Resources.ZAR;
                        break;
                    case "ZMW":
                        rate_t = Resources.ZMW;
                        break;
                    case "ZWL":
                        rate_t = Resources.ZWL;
                        break;
                }

                final double moneyValue = Double.parseDouble(money.getText().toString());
                final double rate = (rate_t / rate_f);
                Resources.moneyValue = rate * moneyValue;

                startActivity(new Intent("am.oneexchange.ResultActivity"));
            }
        });
    }

    public void findAndReplace(String rate_ft, String country, double rate, double rate_res) {
        if (rate_ft.equals(country)) {
            rate = rate_res;
        }
    }
}
