package am.oneexchange;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

// JSON FROM URL
public class ParseTask extends AsyncTask<Void, Void, String> {
    HttpURLConnection urlConnection = null;
    BufferedReader reader = null;
    String resultJSON = "";

    @Override
    protected String doInBackground(Void ... params) {
        try {
            String url_json = Resources.urlApi;
            URL url = new URL(url_json);

            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            InputStream inputStream = urlConnection.getInputStream();
            StringBuffer buffer = new StringBuffer();

            reader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }

            resultJSON = buffer.toString();
            Log.d("FOR_LOG", resultJSON);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultJSON;
    }

//        FIND RATE FOR THIS VALUTE AND ADD TO LIST
    protected void onPostExecute(String strJSON) {
        super.onPostExecute(strJSON);

        try {
            JSONObject json = new JSONObject(strJSON);
            JSONObject jArray = json.getJSONObject("rates");

//            INIT RATES
//            0-10
            Resources.AED = jArray.getDouble("AED");
            Resources.AFN = jArray.getDouble("AFN");
            Resources.ALL = jArray.getDouble("ALL");
            Resources.AMD = jArray.getDouble("AMD");
            Resources.ANG = jArray.getDouble("ANG");
            Resources.AOA = jArray.getDouble("AOA");
            Resources.ARS = jArray.getDouble("ARS");
            Resources.AUD = jArray.getDouble("AUD");
            Resources.AWG = jArray.getDouble("AWG");
            Resources.AZN = jArray.getDouble("AZN");
//                10-20
            Resources.BAM = jArray.getDouble("BAM");
            Resources.BBD = jArray.getDouble("BBD");
            Resources.BDT = jArray.getDouble("BDT");
            Resources.BGN = jArray.getDouble("BGN");
            Resources.BHD = jArray.getDouble("BHD");
            Resources.BIF = jArray.getDouble("BIF");
            Resources.BMD = jArray.getDouble("BMD");
            Resources.BND = jArray.getDouble("BND");
            Resources.BOB = jArray.getDouble("BOB");
            Resources.BRL = jArray.getDouble("BRL");
//                20-30
            Resources.BSD = jArray.getDouble("BSD");
            Resources.BTC = jArray.getDouble("BTC");
            Resources.BTN = jArray.getDouble("BTN");
            Resources.BWP = jArray.getDouble("BWP");
            Resources.BYN = jArray.getDouble("BYN");
            Resources.BZD = jArray.getDouble("BZD");
            Resources.CAD = jArray.getDouble("CAD");
            Resources.CDF = jArray.getDouble("CDF");
            Resources.CHF = jArray.getDouble("CHF");
            Resources.CLF = jArray.getDouble("CLF");
//                30-40
            Resources.CLP = jArray.getDouble("CLP");
            Resources.CNH = jArray.getDouble("CNH");
            Resources.CNY = jArray.getDouble("CNY");
            Resources.COP = jArray.getDouble("COP");
            Resources.CRC = jArray.getDouble("CRC");
            Resources.CUC = jArray.getDouble("CUC");
            Resources.CUP = jArray.getDouble("CUP");
            Resources.CVE = jArray.getDouble("CVE");
            Resources.CZK = jArray.getDouble("CZK");
            Resources.DJF = jArray.getDouble("DJF");
//                40-50
            Resources.DKK = jArray.getDouble("DKK");
            Resources.DOP = jArray.getDouble("DOP");
            Resources.DZD = jArray.getDouble("DZD");
            Resources.EGP = jArray.getDouble("EGP");
            Resources.ERN = jArray.getDouble("ERN");
            Resources.ETB = jArray.getDouble("ETB");
            Resources.EUR = jArray.getDouble("EUR");
            Resources.FJD = jArray.getDouble("FJD");
            Resources.FKP = jArray.getDouble("FKP");
            Resources.GBP = jArray.getDouble("GBP");
//                50-60
            Resources.GEL = jArray.getDouble("GEL");
            Resources.GGP = jArray.getDouble("GGP");
            Resources.GHS = jArray.getDouble("GHS");
            Resources.GIP = jArray.getDouble("GIP");
            Resources.GMD = jArray.getDouble("GMD");
            Resources.GNF = jArray.getDouble("GNF");
            Resources.GTQ = jArray.getDouble("GTQ");
            Resources.GYD = jArray.getDouble("GYD");
            Resources.HKD = jArray.getDouble("HKD");
            Resources.HNL = jArray.getDouble("HNL");
//                60-70
            Resources.HRK = jArray.getDouble("HRK");
            Resources.HTG = jArray.getDouble("HTG");
            Resources.HUF = jArray.getDouble("HUF");
            Resources.IDR = jArray.getDouble("IDR");
            Resources.ILS = jArray.getDouble("ILS");
            Resources.IMP = jArray.getDouble("IMP");
            Resources.INR = jArray.getDouble("INR");
            Resources.IQD = jArray.getDouble("IQD");
            Resources.IRR = jArray.getDouble("IRR");
            Resources.ISK = jArray.getDouble("ISK");
//                70-80
            Resources.JEP = jArray.getDouble("JEP");
            Resources.JMD = jArray.getDouble("JMD");
            Resources.JOD = jArray.getDouble("JOD");
            Resources.JPY = jArray.getDouble("JPY");
            Resources.KES = jArray.getDouble("KES");
            Resources.KGS = jArray.getDouble("KGS");
            Resources.KHR = jArray.getDouble("KHR");
            Resources.KMF = jArray.getDouble("KMF");
            Resources.KPW = jArray.getDouble("KPW");
            Resources.KRW = jArray.getDouble("KRW");
//                80-90
            Resources.KWD = jArray.getDouble("KWD");
            Resources.KYD = jArray.getDouble("KYD");
            Resources.KZT = jArray.getDouble("KZT");
            Resources.LAK = jArray.getDouble("LAK");
            Resources.LBP = jArray.getDouble("LBP");
            Resources.LKR = jArray.getDouble("LKR");
            Resources.LRD = jArray.getDouble("LRD");
            Resources.LSL = jArray.getDouble("LSL");
            Resources.LYD = jArray.getDouble("LYD");
            Resources.MAD = jArray.getDouble("MAD");
//                90-100
            Resources.MDL = jArray.getDouble("MDL");
            Resources.MGA = jArray.getDouble("MGA");
            Resources.MKD = jArray.getDouble("MKD");
            Resources.MMK = jArray.getDouble("MMK");
            Resources.MNT = jArray.getDouble("MNT");
            Resources.MOP = jArray.getDouble("MOP");
            Resources.MRO = jArray.getDouble("MRO");
            Resources.MRU = jArray.getDouble("MRU");
            Resources.MUR = jArray.getDouble("MUR");
            Resources.MVR = jArray.getDouble("MVR");
//                100-110
            Resources.MWK = jArray.getDouble("MWK");
            Resources.MXN = jArray.getDouble("MXN");
            Resources.MYR = jArray.getDouble("MYR");
            Resources.MZN = jArray.getDouble("MZN");
            Resources.NAD = jArray.getDouble("NAD");
            Resources.NGN = jArray.getDouble("NGN");
            Resources.NIO = jArray.getDouble("NIO");
            Resources.NOK = jArray.getDouble("NOK");
            Resources.NPR = jArray.getDouble("NPR");
            Resources.NZD = jArray.getDouble("NZD");
//                110-120
            Resources.OMR = jArray.getDouble("OMR");
            Resources.PAB = jArray.getDouble("PAB");
            Resources.PEN = jArray.getDouble("PEN");
            Resources.PGK = jArray.getDouble("PGK");
            Resources.PHP = jArray.getDouble("PHP");
            Resources.PKR = jArray.getDouble("PKR");
            Resources.PLN = jArray.getDouble("PLN");
            Resources.PYG = jArray.getDouble("PYG");
            Resources.QAR = jArray.getDouble("QAR");
            Resources.RON = jArray.getDouble("RON");
//                120-130
            Resources.RSD = jArray.getDouble("RSD");
            Resources.RUB = jArray.getDouble("RUB");
            Resources.RWF = jArray.getDouble("RWF");
            Resources.SAR = jArray.getDouble("SAR");
            Resources.SBD = jArray.getDouble("SBD");
            Resources.SCR = jArray.getDouble("SCR");
            Resources.SDG = jArray.getDouble("SDG");
            Resources.SEK = jArray.getDouble("SEK");
            Resources.SGD = jArray.getDouble("SGD");
            Resources.SHP = jArray.getDouble("SHP");
//                130-140
            Resources.SLL = jArray.getDouble("SLL");
            Resources.SOS = jArray.getDouble("SOS");
            Resources.SRD = jArray.getDouble("SRD");
            Resources.SSP = jArray.getDouble("SSP");
            Resources.STD = jArray.getDouble("STD");
            Resources.STN = jArray.getDouble("STN");
            Resources.SVC = jArray.getDouble("SVC");
            Resources.SYP = jArray.getDouble("SYP");
            Resources.SZL = jArray.getDouble("SZL");
            Resources.THB = jArray.getDouble("THB");
//                140-150
            Resources.TJS = jArray.getDouble("TJS");
            Resources.TMT = jArray.getDouble("TMT");
            Resources.TND = jArray.getDouble("TND");
            Resources.TOP = jArray.getDouble("TOP");
            Resources.TRY = jArray.getDouble("TRY");
            Resources.TTD = jArray.getDouble("TTD");
            Resources.TWD = jArray.getDouble("TWD");
            Resources.TZS = jArray.getDouble("TZS");
            Resources.UAH = jArray.getDouble("UAH");
            Resources.UGX = jArray.getDouble("UGX");
//                150-160
            Resources.USD = jArray.getDouble("USD");
            Resources.UYU = jArray.getDouble("UYU");
            Resources.UZS = jArray.getDouble("UZS");
            Resources.VEF = jArray.getDouble("VEF");
            Resources.VES = jArray.getDouble("VES");
            Resources.VND = jArray.getDouble("VND");
            Resources.VUV = jArray.getDouble("VUV");
            Resources.WST = jArray.getDouble("WST");
            Resources.XAF = jArray.getDouble("XAF");
            Resources.XAG = jArray.getDouble("XAG");
//                160-171
            Resources.XAU = jArray.getDouble("XAU");
            Resources.XCD = jArray.getDouble("XCD");
            Resources.XDR = jArray.getDouble("XDR");
            Resources.XOF = jArray.getDouble("XOF");
            Resources.XPD = jArray.getDouble("XPD");
            Resources.XPF = jArray.getDouble("XPF");
            Resources.XPT = jArray.getDouble("XPT");
            Resources.YER = jArray.getDouble("YER");
            Resources.ZAR = jArray.getDouble("ZAR");
            Resources.ZMW = jArray.getDouble("ZMW");
            Resources.ZWL = jArray.getDouble("ZWL");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
