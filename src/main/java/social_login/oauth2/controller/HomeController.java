package social_login.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

		@GetMapping("/")
		public String sayHello() {
			return "Hello World";
		}

		@GetMapping("/secured")
		public String secured() {
			return "Hello from Secured";
		}


}
