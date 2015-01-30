package com.supsms;

import android.os.AsyncTask;
import android.util.Log;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

/**
 * Created by Adeline on 27/01/2015.
 */
public class PostData extends AsyncTask<List<NameValuePair>,Void,JSONObject> {

    final String url = "http://91.121.105.200/API/";

    public String sendRequest(List<NameValuePair> params) {

        HttpClient httpClient = new DefaultHttpClient(); // envoye la requête au serveur
        HttpPost httpPost = new HttpPost(url); //requête post en param "url"

        try {
            httpPost.setEntity(new UrlEncodedFormEntity(params));
            HttpResponse response = httpClient.execute(httpPost); // on envoye la réponse

            String responseText = null;

            responseText = EntityUtils.toString(response.getEntity()); // réponse du serveur en String
            return responseText;
        }
        catch (ClientProtocolException cpe) {
            cpe.printStackTrace();
        }
        catch (IOException ioe) {
            Log.d("Erreur", ioe.toString());
            ioe.printStackTrace();
        }
        return null;
    }

    public static JSONObject receiveJson(String reader) throws IOException, JSONException{
        if(reader !=null)
        {
            JSONObject json = new JSONObject(reader);
            return json;
        }
        else return null;
    }

    @Override
    protected JSONObject doInBackground(List<NameValuePair>... params) {
        List<NameValuePair> Parameters = params[0];

        try {
            return receiveJson(sendRequest(Parameters));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
