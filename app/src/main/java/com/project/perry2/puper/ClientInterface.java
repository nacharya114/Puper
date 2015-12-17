package com.project.perry2.puper;

import android.util.Log;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

/**
 * Created by Neil on 12/17/2015.
 * API Used: http://loopj.com/android-async-http/
 * Will eventually need to use com.loopj.http.JSONHttpResponseHandler so look at it later
 * Also will need org.json.JSONArray, JSONObject, etc. in the client files
 */
public class ClientInterface {
    private static final String baseURL = "http://52.90.67.0:3000/";

    private static AsyncHttpClient client = new AsyncHttpClient();

    public static void get(String URL, RequestParams requestParams, AsyncHttpResponseHandler responseHandler){
        client.get(getAbsoluteURL(URL), requestParams, responseHandler);
    }

    public static void post(String URL, RequestParams requestParams, AsyncHttpResponseHandler responseHandler){
        client.post(getAbsoluteURL(URL), requestParams, responseHandler);
    }

    private static String getAbsoluteURL(String relativeURL){
        Log.e("url", baseURL + relativeURL);
        return baseURL + relativeURL;

    }
}
