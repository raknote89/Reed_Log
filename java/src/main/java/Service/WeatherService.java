package Service;

import com.reed_log.model.Weather;
import org.springframework.web.client.RestTemplate;

public class WeatherService {
    private RestTemplate restTemplate = new RestTemplate();

    private final String API_URL = "http://api.weatherapi.com/v1/current.json?q=";

    private final String API_KEY = "b32c5754774e4462afd201347251003";


    public Weather getWeatherByCity(String cityName) {
        String url = API_URL +
                cityName;
        Weather response = restTemplate.getForObject(url, Weather.class);
        return response;
    }
}
