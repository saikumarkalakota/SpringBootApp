package brains.springbootapp.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/*
 * Business Service is a singleton. When app starts it detects all Service 
 * annotations (by looking at @Service) in class paths & creates an
 * instance of this service & registers in memory
 */


@Service
public class TopicService {
	
	private List<Topic> topics =  Arrays.asList(
			new Topic ("spring","Spring framework", "Spring framework Description"),
			new Topic ("java","java framework", "java framework Description"),
			new Topic ("DotNet","DotNet framework", "DotNet framework Description")
			);


	public List<Topic> getAllTopics() {
		// TODO Auto-generated method stub
		return topics;
	}


	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}


	public void putTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic) ;
	}
}
