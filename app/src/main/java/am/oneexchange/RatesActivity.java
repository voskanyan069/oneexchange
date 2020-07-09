package am.oneexchange;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class RatesActivity extends AppCompatActivity {

    private ImageView btn_change_act;
    private ImageView btn_result_act;
    private ImageView btn_settings_act;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rates);
        init();
        onPostExecute();
    }

    public void init() {
//        FOOTER_BUTTONS
        btn_change_act = findViewById(R.id.act_change);
        btn_result_act = findViewById(R.id.act_result);
        btn_settings_act = findViewById(R.id.act_settings);

        act_change(btn_change_act, "am.oneexchange.SelectActivity");
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

//        FIND RATE FOR THIS VALUTE AND ADD TO LIST
    protected void onPostExecute() {

        final ListView ratesList = findViewById(R.id.ratesList);

        String[] from = {"name_item"};
        int[] to = {R.id.name_item};
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<HashMap<String, String>>();

        try {
            HashMap<String, String> hashMapRate = new HashMap<String, String>();

//            ADD TO HASHMAP LIST FROM FUNCTION ($HASHING)
            hashing(hashMapRate, Resources.AMD, "AMD", arrayList);
            hashing(hashMapRate, Resources.RUB, "RUB", arrayList);
            hashing(hashMapRate, Resources.USD, "USD", arrayList);
            hashing(hashMapRate, Resources.AED, "AED", arrayList);
            hashing(hashMapRate, Resources.AFN, "AFN", arrayList);
            hashing(hashMapRate, Resources.ALL, "ALL", arrayList);
            hashing(hashMapRate, Resources.ANG, "ANG", arrayList);
            hashing(hashMapRate, Resources.AOA, "AOA", arrayList);
            hashing(hashMapRate, Resources.ARS, "ARS", arrayList);
            hashing(hashMapRate, Resources.AUD, "AUD", arrayList);
            hashing(hashMapRate, Resources.AWG, "AWG", arrayList);
            hashing(hashMapRate, Resources.AZN, "AZN", arrayList);
            hashing(hashMapRate, Resources.BAM, "BAM", arrayList);
            hashing(hashMapRate, Resources.BBD, "BBD", arrayList);
            hashing(hashMapRate, Resources.BDT, "BDT", arrayList);
            hashing(hashMapRate, Resources.BGN, "BGN", arrayList);
            hashing(hashMapRate, Resources.BHD, "BHD", arrayList);
            hashing(hashMapRate, Resources.BIF, "BIF", arrayList);
            hashing(hashMapRate, Resources.BMD, "BMD", arrayList);
            hashing(hashMapRate, Resources.BND, "BND", arrayList);
            hashing(hashMapRate, Resources.BOB, "BOB", arrayList);
            hashing(hashMapRate, Resources.BRL, "BRL", arrayList);
            hashing(hashMapRate, Resources.BSD, "BSD", arrayList);
            hashing(hashMapRate, Resources.BTC, "BTC", arrayList);
            hashing(hashMapRate, Resources.BTN, "BTN", arrayList);
            hashing(hashMapRate, Resources.BWP, "BWP", arrayList);
            hashing(hashMapRate, Resources.BYN, "BYN", arrayList);
            hashing(hashMapRate, Resources.BZD, "BZD", arrayList);
            hashing(hashMapRate, Resources.CAD, "CAD", arrayList);
            hashing(hashMapRate, Resources.CDF, "CDF", arrayList);
            hashing(hashMapRate, Resources.CHF, "CHF", arrayList);
            hashing(hashMapRate, Resources.CLF, "CLF", arrayList);
            hashing(hashMapRate, Resources.CLP, "CLP", arrayList);
            hashing(hashMapRate, Resources.CNH, "CNH", arrayList);
            hashing(hashMapRate, Resources.CNY, "CNY", arrayList);
            hashing(hashMapRate, Resources.COP, "COP", arrayList);
            hashing(hashMapRate, Resources.CRC, "CRC", arrayList);
            hashing(hashMapRate, Resources.CUC, "CUC", arrayList);
            hashing(hashMapRate, Resources.CUP, "CUP", arrayList);
            hashing(hashMapRate, Resources.CVE, "CVE", arrayList);
            hashing(hashMapRate, Resources.CZK, "CZK", arrayList);
            hashing(hashMapRate, Resources.DJF, "DJF", arrayList);
            hashing(hashMapRate, Resources.DKK, "DKK", arrayList);
            hashing(hashMapRate, Resources.DOP, "DOP", arrayList);
            hashing(hashMapRate, Resources.DZD, "DZD", arrayList);
            hashing(hashMapRate, Resources.EGP, "EGP", arrayList);
            hashing(hashMapRate, Resources.ERN, "ERN", arrayList);
            hashing(hashMapRate, Resources.ETB, "ETB", arrayList);
            hashing(hashMapRate, Resources.EUR, "EUR", arrayList);
            hashing(hashMapRate, Resources.FJD, "FJD", arrayList);
            hashing(hashMapRate, Resources.FKP, "FKP", arrayList);
            hashing(hashMapRate, Resources.GBP, "GBP", arrayList);
            hashing(hashMapRate, Resources.GEL, "GEL", arrayList);
            hashing(hashMapRate, Resources.GGP, "GGP", arrayList);
            hashing(hashMapRate, Resources.GHS, "GHS", arrayList);
            hashing(hashMapRate, Resources.GIP, "GIP", arrayList);
            hashing(hashMapRate, Resources.GMD, "GMD", arrayList);
            hashing(hashMapRate, Resources.GNF, "GNF", arrayList);
            hashing(hashMapRate, Resources.GTQ, "GTQ", arrayList);
            hashing(hashMapRate, Resources.GYD, "GYD", arrayList);
            hashing(hashMapRate, Resources.HKD, "HKD", arrayList);
            hashing(hashMapRate, Resources.HNL, "HNL", arrayList);
            hashing(hashMapRate, Resources.HRK, "HRK", arrayList);
            hashing(hashMapRate, Resources.HTG, "HTG", arrayList);
            hashing(hashMapRate, Resources.HUF, "HUF", arrayList);
            hashing(hashMapRate, Resources.IDR, "IDR", arrayList);
            hashing(hashMapRate, Resources.ILS, "ILS", arrayList);
            hashing(hashMapRate, Resources.IMP, "IMP", arrayList);
            hashing(hashMapRate, Resources.INR, "INR", arrayList);
            hashing(hashMapRate, Resources.IQD, "IQD", arrayList);
            hashing(hashMapRate, Resources.IRR, "IRR", arrayList);
            hashing(hashMapRate, Resources.ISK, "ISK", arrayList);
            hashing(hashMapRate, Resources.JEP, "JEP", arrayList);
            hashing(hashMapRate, Resources.JMD, "JMD", arrayList);
            hashing(hashMapRate, Resources.JOD, "JOD", arrayList);
            hashing(hashMapRate, Resources.JPY, "JPY", arrayList);
            hashing(hashMapRate, Resources.KES, "KES", arrayList);
            hashing(hashMapRate, Resources.KGS, "KGS", arrayList);
            hashing(hashMapRate, Resources.KHR, "KHR", arrayList);
            hashing(hashMapRate, Resources.KMF, "KMF", arrayList);
            hashing(hashMapRate, Resources.KPW, "KPW", arrayList);
            hashing(hashMapRate, Resources.KRW, "KRW", arrayList);
            hashing(hashMapRate, Resources.KWD, "KWD", arrayList);
            hashing(hashMapRate, Resources.KYD, "KYD", arrayList);
            hashing(hashMapRate, Resources.KZT, "KZT", arrayList);
            hashing(hashMapRate, Resources.LAK, "LAK", arrayList);
            hashing(hashMapRate, Resources.LBP, "LBP", arrayList);
            hashing(hashMapRate, Resources.LKR, "LKR", arrayList);
            hashing(hashMapRate, Resources.LRD, "LRD", arrayList);
            hashing(hashMapRate, Resources.LSL, "LSL", arrayList);
            hashing(hashMapRate, Resources.LYD, "LYD", arrayList);
            hashing(hashMapRate, Resources.MAD, "MAD", arrayList);
            hashing(hashMapRate, Resources.MDL, "MDL", arrayList);
            hashing(hashMapRate, Resources.MGA, "MGA", arrayList);
            hashing(hashMapRate, Resources.MKD, "MKD", arrayList);
            hashing(hashMapRate, Resources.MMK, "MMK", arrayList);
            hashing(hashMapRate, Resources.MNT, "MNT", arrayList);
            hashing(hashMapRate, Resources.MOP, "MOP", arrayList);
            hashing(hashMapRate, Resources.MRO, "MRO", arrayList);
            hashing(hashMapRate, Resources.MRU, "MRU", arrayList);
            hashing(hashMapRate, Resources.MUR, "MUR", arrayList);
            hashing(hashMapRate, Resources.MVR, "MVR", arrayList);
            hashing(hashMapRate, Resources.MWK, "MWK", arrayList);
            hashing(hashMapRate, Resources.MXN, "MXN", arrayList);
            hashing(hashMapRate, Resources.MYR, "MYR", arrayList);
            hashing(hashMapRate, Resources.MZN, "MZN", arrayList);
            hashing(hashMapRate, Resources.NAD, "NAD", arrayList);
            hashing(hashMapRate, Resources.NGN, "NGN", arrayList);
            hashing(hashMapRate, Resources.NIO, "NIO", arrayList);
            hashing(hashMapRate, Resources.NOK, "NOK", arrayList);
            hashing(hashMapRate, Resources.NPR, "NPR", arrayList);
            hashing(hashMapRate, Resources.NZD, "NZD", arrayList);
            hashing(hashMapRate, Resources.OMR, "OMR", arrayList);
            hashing(hashMapRate, Resources.PAB, "PAB", arrayList);
            hashing(hashMapRate, Resources.PEN, "PEN", arrayList);
            hashing(hashMapRate, Resources.PGK, "PGK", arrayList);
            hashing(hashMapRate, Resources.PHP, "PHP", arrayList);
            hashing(hashMapRate, Resources.PKR, "PKR", arrayList);
            hashing(hashMapRate, Resources.PLN, "PLN", arrayList);
            hashing(hashMapRate, Resources.PYG, "PYG", arrayList);
            hashing(hashMapRate, Resources.QAR, "QAR", arrayList);
            hashing(hashMapRate, Resources.RON, "RON", arrayList);
            hashing(hashMapRate, Resources.RSD, "RSD", arrayList);
            hashing(hashMapRate, Resources.RWF, "RWF", arrayList);
            hashing(hashMapRate, Resources.SAR, "SAR", arrayList);
            hashing(hashMapRate, Resources.SBD, "SBD", arrayList);
            hashing(hashMapRate, Resources.SCR, "SCR", arrayList);
            hashing(hashMapRate, Resources.SDG, "SDG", arrayList);
            hashing(hashMapRate, Resources.SEK, "SEK", arrayList);
            hashing(hashMapRate, Resources.SGD, "SGD", arrayList);
            hashing(hashMapRate, Resources.SHP, "SHP", arrayList);
            hashing(hashMapRate, Resources.SLL, "SLL", arrayList);
            hashing(hashMapRate, Resources.SOS, "SOS", arrayList);
            hashing(hashMapRate, Resources.SRD, "SRD", arrayList);
            hashing(hashMapRate, Resources.SSP, "SSP", arrayList);
            hashing(hashMapRate, Resources.STD, "STD", arrayList);
            hashing(hashMapRate, Resources.STN, "STN", arrayList);
            hashing(hashMapRate, Resources.SVC, "SVC", arrayList);
            hashing(hashMapRate, Resources.SYP, "SYP", arrayList);
            hashing(hashMapRate, Resources.SZL, "SZL", arrayList);
            hashing(hashMapRate, Resources.THB, "THB", arrayList);
            hashing(hashMapRate, Resources.TJS, "TJS", arrayList);
            hashing(hashMapRate, Resources.TMT, "TMT", arrayList);
            hashing(hashMapRate, Resources.TND, "TND", arrayList);
            hashing(hashMapRate, Resources.TOP, "TOP", arrayList);
            hashing(hashMapRate, Resources.TRY, "TRY", arrayList);
            hashing(hashMapRate, Resources.TTD, "TTD", arrayList);
            hashing(hashMapRate, Resources.TWD, "TWD", arrayList);
            hashing(hashMapRate, Resources.TZS, "TZS", arrayList);
            hashing(hashMapRate, Resources.UAH, "UAH", arrayList);
            hashing(hashMapRate, Resources.UGX, "UGX", arrayList);
            hashing(hashMapRate, Resources.UYU, "UYU", arrayList);
            hashing(hashMapRate, Resources.UZS, "UZS", arrayList);
            hashing(hashMapRate, Resources.VEF, "VEF", arrayList);
            hashing(hashMapRate, Resources.VES, "VES", arrayList);
            hashing(hashMapRate, Resources.VND, "VND", arrayList);
            hashing(hashMapRate, Resources.VUV, "VUV", arrayList);
            hashing(hashMapRate, Resources.WST, "WST", arrayList);
            hashing(hashMapRate, Resources.XAF, "XAF", arrayList);
            hashing(hashMapRate, Resources.XAG, "XAG", arrayList);
            hashing(hashMapRate, Resources.XAU, "XAU", arrayList);
            hashing(hashMapRate, Resources.XCD, "XCD", arrayList);
            hashing(hashMapRate, Resources.XDR, "XDR", arrayList);
            hashing(hashMapRate, Resources.XOF, "XOF", arrayList);
            hashing(hashMapRate, Resources.XPD, "XPD", arrayList);
            hashing(hashMapRate, Resources.XPF, "XPF", arrayList);
            hashing(hashMapRate, Resources.XPT, "XPT", arrayList);
            hashing(hashMapRate, Resources.YER, "YER", arrayList);
            hashing(hashMapRate, Resources.ZAR, "ZAR", arrayList);
            hashing(hashMapRate, Resources.ZMW, "ZMW", arrayList);
            hashing(hashMapRate, Resources.ZWL, "ZWL", arrayList);

            final SimpleAdapter adapter = new SimpleAdapter(RatesActivity.this, arrayList, R.layout.item, from, to);
            ratesList.setAdapter(adapter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hashing(HashMap<String, String> hashMap, double rate, String country, ArrayList<HashMap<String, String>> arrayList) {
        hashMap = new HashMap<String, String>();
        hashMap.put("name_item", country + ": " + rate);
        arrayList.add(hashMap);
    }
}