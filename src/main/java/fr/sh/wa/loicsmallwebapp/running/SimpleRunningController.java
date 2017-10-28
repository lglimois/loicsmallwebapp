package fr.sh.wa.loicsmallwebapp.running;



import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility; 
//import org.codehaus.jackson.annotate.JsonMethod; 

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class SimpleRunningController {

	@RequestMapping("/listsimplerunning")
    public String list() throws JsonProcessingException {
		SimpleRunningBean bean = new SimpleRunningBean(1, 2,3);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setVisibilityChecker(mapper.getSerializationConfig().getDefaultVisibilityChecker()
                .withFieldVisibility(JsonAutoDetect.Visibility.ANY));
	
		//mapper.setVisibility(JsonMethod.FIELD, Visibility.ANY);
		//mapper.setVisibility(JsonMethod.FIELD, JsonAutoDetect.Visibility.ANY);
				
		//Object to JSON in String
		String jsonInString = mapper.writeValueAsString(bean);
		
        return jsonInString;
    }
	
}
