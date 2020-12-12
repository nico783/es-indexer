package com.example.nico.esindexer;

import com.example.nico.esindexer.wsentity.CatResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class LostCatService {
    private final String K = "4af3dfea0de6b8f90b818ca3cbe22bfa";
    private final String secret = "f4eef3cab01a7ac14b2bedaab8d53d07";

    @Autowired
    private RestTemplate restTemplate;

    public String getCat(Long size, Long page) {
        String now = getFormattedNowDate();
        String sign = Encoder.sha1(now + " " + K + " " + secret);
        String jsonInput = getJsonInput(size, page, now, sign);
        String dataInput = Encoder.base64(jsonInput);
        String response = restTemplate.getForObject("https://www.chat-perdu.org/api?v=2&data={dataInput}", String.class, dataInput);
        return response;
    }

    public CatResponseEntity getCatEntity(Long size, Long page) {
        String now = getFormattedNowDate();
        String sign = Encoder.sha1(now + " " + K + " " + secret);
        String jsonInput = getJsonInput(size, page, now, sign);
        String dataInput = Encoder.base64(jsonInput);
        CatResponseEntity response = restTemplate.getForObject("https://www.chat-perdu.org/api?v=2&data={dataInput}", CatResponseEntity.class, dataInput);
        return response;
    }


    private String getJsonInput(Long size, Long page, String now, String sign) {
        return "{\n" +
                "\"k\": \"" + K + "\",\n" +
                "\"datetime\": \"" + now + "\",\n" +
                "\"client_v\": \"1.0\",\n" +
                "\"language\": \"fr\", \n" +
                "\"country\": \"fr\",\n" +
                "\"client_ip\": \"127.0.0.1\",\n" +
                "\"sign\": \"" + sign + "\", \n" +
                "\"method\": \"item_selects\",\n" +
                "\"args\": \n" +
                "{\n" +
                "\"limit\" :\"" + size + "\",\n" +
                "\"page\" :\"" + page + "\"\n" +
                "}\n" +
                "}";
    }

    private String getFormattedNowDate() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }

}
