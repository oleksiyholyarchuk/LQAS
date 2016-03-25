package ua.com.intend.java.HTTPhandler;

import org.apache.http.client.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.*;

/**
 * This example demonstrates the use of the {@link ResponseHandler} to simplify 
 * the process of processing the HTTP response and releasing associated resources.
 */
public class ClientWithResponseHandler {

    public final static void main(String[] args) throws Exception {
        
        HttpClient httpclient = new DefaultHttpClient();

        HttpGet httpget = new HttpGet("http://www.google.com/"); 

        System.out.println("executing request " + httpget.getURI());

        // Create a response handler
        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        String responseBody = httpclient.execute(httpget, responseHandler);
        System.out.println(responseBody);
        
        System.out.println("----------------------------------------");

        // When HttpClient instance is no longer needed, 
        // shut down the connection manager to ensure
        // immediate deallocation of all system resources
        httpclient.getConnectionManager().shutdown();        
    }
    
}
