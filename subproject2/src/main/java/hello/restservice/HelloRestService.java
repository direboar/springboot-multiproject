package hello.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestService {

	@GetMapping("/hello2")
	public String hello() {
		return "hello1222";
	}

}
