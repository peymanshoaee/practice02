package org.example;

import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CallMethod {
    public void callMethodGet() throws IOException {
        String method = "http://localhost:8080/03sayhello.jsp";
        RequestConfig requestConfig= RequestConfig.custom().setSocketTimeout(30000).setConnectTimeout(30000).build();
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost post = new HttpPost(method);
        List<NameValuePair> nameValuePairList = new ArrayList<>();
        nameValuePairList.add(new BasicNameValuePair("myname", "peyman"));
        UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(nameValuePairList, "utf-8");
        post.setEntity(formEntity);


        CloseableHttpResponse closeableHttpResponse = httpClient.execute(post);

    }
}
