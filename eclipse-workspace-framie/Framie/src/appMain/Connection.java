package appMain;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Connection 
{
	HttpRequest request = HttpRequest.newBuilder()
			.uri(URI.create("https://weatherapi-com.p.rapidapi.com/" + opt + "?q=" + timezone))//using london
			.header("x-rapidapi-key", keyValue)
			.header("x-rapidapi-host", "weatherapi-com.p.rapidapi.com")
			.method("GET", HttpRequest.BodyPublishers.noBody())
			.build();
}
