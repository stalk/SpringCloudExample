package org.rinmakh.secondservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="simple-service")
public interface FeinCLientExample {
    @GetMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    String getHello();
}

