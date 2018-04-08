package com.example.mongodb.examplemongo;

import com.example.mongodb.examplemongo.model.Example;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

//import okhttp3.MediaType;
//import okhttp3.OkHttpClient;
//import okhttp3.Request;
//import okhttp3.Response;

@SpringBootApplication
public class ExamplemongoApplication implements CommandLineRunner {
//    @Autowired
//    ExampleRepository exampleRepository;
    @Value("${our.url}")
    String url;
    @Value("${api.key}")
    String apiKey;

    public static void main(String[] args) {

        SpringApplication.run(ExamplemongoApplication.class, args);

    }


    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        httpHeaders.setCacheControl(String.valueOf(CacheControl.noCache()));
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();

        map.add("api_key", apiKey);
        HttpEntity<MultiValueMap<String,String>> requestEntity =
                new HttpEntity<>(map, httpHeaders);
        Example example = restTemplate.postForObject(url, requestEntity, Example.class);
        System.out.println(example);

    }
}
