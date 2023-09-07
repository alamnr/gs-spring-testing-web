package com.example.gsspringtest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @Value(value = "${local.server.port}")
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception  {
        assertThat(testRestTemplate.getForEntity("http://localhost:"+ port
                                                    ,String.class).getBody().contains("Hello, World")  );
        assertThat(testRestTemplate.getForObject("http://localhost:"+port
                                                    ,String.class).contains("Hello, World"));
    }
}
