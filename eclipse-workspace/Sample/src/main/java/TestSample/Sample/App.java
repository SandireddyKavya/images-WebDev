package TestSample.Sample;
import com.google.gson.Gson;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class App {
    public static void main(String[] args) {
        // Replace with your API endpoint and API key  
        String apiUrl = "https://the-one-api.dev/v2/character";
        String apiKey = "jCBaMP46DvffxhFcN1yc";     
    
     // Modify the API request to include a filter parameter
        String filterParameter = "race=Elf"; // Example filter: Get only Elf characters
       // int page = 2;        // Page number
       // int pageSize = 10;   // Number of items per page
        
     // Modify the API request URL to include pagination parameters
        //String apiRequestUrl = apiUrl + "?page=" + page + "&pageSize=" + pageSize;
        // Create an HttpClient instance
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            // Create an HttpGet request
            //HttpGet httpGet = new HttpGet(apiUrl);
            HttpGet httpGet = new HttpGet(apiUrl + "?" + filterParameter);
        	//HttpGet httpGet = new HttpGet(apiRequestUrl);
            // Add the API key to the request headers
            httpGet.addHeader(HttpHeaders.AUTHORIZATION, "Bearer " + apiKey);

            // Execute the request
            CloseableHttpResponse response = httpClient.execute(httpGet);

            // Get the response status code
            int statusCode = response.getStatusLine().getStatusCode();
            System.out.println("Response Status Code: " + statusCode);

            // Read and process the response content
            String responseBody = EntityUtils.toString(response.getEntity());
            System.out.println("Response Body: " + responseBody);

            // Use Gson to parse the JSON response into MovieData object
            Gson gson = new Gson();
            
            CharacterData characterData = gson.fromJson(responseBody, CharacterData.class);

            // Now you can work with the parsed data
            for (CharacterInfo character : characterData.getDocs()) {
                System.out.println("Character Name: " + character.getName());
                System.out.println("Character Race: " + character.getRace());
                // Add more fields as needed
            }

           /* MovieData movieData = gson.fromJson(responseBody, MovieData.class);

            // Now you can work with the parsed data
            for (Movie movie : movieData.getDocs()) {
                System.out.println("Movie Name: " + movie.getRuntimeInMinutes());
                // Add more fields as needed
            }
            /*BookData bookData = gson.fromJson(responseBody, BookData.class);

            // Now you can work with the parsed data
            for (Book book : bookData.getDocs()) {
                System.out.println("Book Name: " + book.getName());
                // Add more fields as needed
            }*/
            // Ensure the response is properly closed to release resources
            response.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    


    public class AppTest {
        private App app;

        @BeforeEach
        public void setUp() {
            app = new App();
        }

        @Test
        public void testApiCallWithValidApiKey() {
            // Replace with a valid API key and endpoint
            String apiKey = "jCBaMP46DvffxhFcN1yc";
            String apiUrl = "https://the-one-api.dev/v2/character";

            
            // Set up the app with the API key
            app.setApiKey(apiKey);
            app.setApiKey(apiUrl);

            // Call the API and check for a successful response
            boolean success = app.callApiAndPrintResponse();

            assertTrue(success, "API call should be successful");
        }

        @Test
        public void testApiCallWithInvalidApiKey() {
            // Replace with an invalid API key and endpoint
            String apiKey = "invalid_api_key";
            String apiUrl = "https://the-one-api.dev/v2/character";

            // Set up the app with the API key
            app.setApiKey(apiKey);
            app.setApiKey(apiUrl);

            // Call the API and check for a failure response
            boolean success = app.callApiAndPrintResponse();

            assertFalse(success, "API call should fail with an invalid API key");
        }
    }



	public static void setApiKey(String apiKey) {
		// TODO Auto-generated method stub
		
		
		App.setApiKey("your_api_key_here");
	}



	public boolean callApiAndPrintResponse() {
		// TODO Auto-generated method stub
		return false;
	}

}
