package ee.spring.materials.Controllers;


import ee.spring.materials.models.NordPoolPriceResponse;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin("http://localhost:3000")
@RestController
public class NordPoolPriceController {




    @GetMapping("nord-pool-price")
    public NordPoolPriceResponse getNordPoolPrice() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://dashboard.elering.ee/api/nps/price";
        ResponseEntity<NordPoolPriceResponse> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                NordPoolPriceResponse.class
        );
        return response.getBody();
    }

}

