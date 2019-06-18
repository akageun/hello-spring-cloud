package kr.geun.oss.config.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author akageun
 */
@Slf4j
@RestController
public class TestController {

    @GetMapping("/test")
    public String getTest() {
        return "";
    }
}
