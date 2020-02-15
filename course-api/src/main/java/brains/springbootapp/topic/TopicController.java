package brains.springbootapp.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	/**
	 * We are below private member variable to instruct Spring to use the service instance 
	 * created  at start-up.
	 * @Autowired marks that below variable needs dependency (@Service) injection
	 */
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}

}
