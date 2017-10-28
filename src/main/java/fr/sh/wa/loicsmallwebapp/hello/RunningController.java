package fr.sh.wa.loicsmallwebapp.hello;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class RunningController {


    @RequestMapping("/running")
	public String runningpage(Map<String, Object> model) {
		model.put("message", "Cest moi qui run");
		return "simplerunning";
	}
    
    /*@RequestMapping("/list")
    public String getList() {
        return "the empty list for new";
    }*/

}