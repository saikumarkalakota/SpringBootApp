package brains.springbootapp.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		
		return Arrays.asList(
				new Topic ("spring","Spring framework", "Spring framework Description"),
				new Topic ("java","java framework", "java framework Description"),
				new Topic ("DotNet","DotNet framework", "DotNet framework Description")
				);
	}

}
