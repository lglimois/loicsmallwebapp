package fr.sh.wa.loicsmallwebapp.hello;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    /*@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", "message en dur");
		return "welcome";
	}*/
    
    /*@RequestMapping("/list")
    public String getList() {
        return "the empty list for new";
    }*/

}