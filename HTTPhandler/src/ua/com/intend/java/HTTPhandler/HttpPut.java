import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

public class SimpleHttpPut { 
  public static void main(String[] args) {
    HttpClient client = new DefaultHttpClient();
    
    /*
     * Use Base 64 authentication
     * 
     	String encoding = Base64Encoder.encode ("test1:test1");
		HttpPost httppost = new HttpPost("http://host:post/test/login");
		httppost.setHeader("Authorization", "Basic " + encoding);
     */
    
    
    HttpPost post = new HttpPost("http://vogellac2dm.appspot.com/register");
    try {
      List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
      nameValuePairs.add(new BasicNameValuePair("registrationid",
          "123456789"));
      post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
      
      /*
       * Send file with request
       * 
      MultipartEntity entity = new MultipartEntity();
      entity.addPart("file", new FileBody(file));
      post.setEntity(entity);
 		*/
      
      //for GET STart here with HttpGet get = new HttpGet("http://vogellac2dm.appspot.com/register"); ...
      
      HttpResponse response = client.execute(post);
      BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
      String line = "";
      while ((line = rd.readLine()) != null) {
        System.out.println(line);
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
} 