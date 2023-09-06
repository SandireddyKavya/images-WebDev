package LordOfRings.model;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class LotRAPI {
    private static final String API_KEY = "jCBaMP46DvffxhFcN1yc";

    public static Book getBook(String id) throws IOException {
        // Create the HTTP request.
    	String str = "https://the-one-api.dev/v2/movie";	
        HttpGet request = new HttpGet(str);
        request.addHeader(API_KEY, "jCBaMP46DvffxhFcN1yc");

        // Execute the request.
        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(request)) {

            // Check the response status code.
            if (response.getStatusLine().getStatusCode() != 200) {
                throw new IOException("Error getting book: " + response.getStatusLine().getReasonPhrase());
            }
            
            // Get the response body.
            String responseBody = EntityUtils.toString(response.getEntity());
            System.out.println(responseBody);
            // Parse the response body into a Book object (You'll need to implement this).
            // Assuming you have a method parseBookFromJson(String json) for parsing the JSON.
            Book book = parseBookFromJson(responseBody);
            return book;
        }
    }

    public static void main(String[] args) {
        try {
            Book book = getBook(API_KEY);
            System.out.println(book.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Implement the parseBookFromJson method to parse the JSON response into a Book object.
    private static Book parseBookFromJson(String json) {
        // Implement JSON parsing logic here and return a Book object.
        // Example: You can use a JSON parsing library like Gson to do this.
        // Gson gson = new Gson();
        // return gson.fromJson(json, Book.class);
        return null; // Replace with actual parsing logic.
    }
}
