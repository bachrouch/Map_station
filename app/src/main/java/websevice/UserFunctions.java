package websevice;

import android.util.Log;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class UserFunctions {

    private JSONParser jsonParser;
    private websevice.JSONARRAYParser jsonArrayParser;
    private static String busUrl = "http://codeit.tn/buslist/buslist.json";

    public UserFunctions() {
        jsonArrayParser = new JSONARRAYParser();
        jsonParser = new JSONParser();
    }

    public JSONObject getAllStations() {
        Log.d("getAllStations","start get all stations");
        // Building Parameters
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("tag", "null"));
        JSONObject json = jsonParser.getJSONFromUrl(busUrl, params);
        //Log.e("JSON", json.toString());
        return json;
    }

}
