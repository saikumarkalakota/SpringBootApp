package brains.springbootapp.topic;

import java.util.ArrayList;
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
	/**
	 * new ArrayList ( ) creates a mutable arrayList each time this service is called.
	 * This enables ArrayList to be updated. In general Array.asList is treated as String
	 * which is immutable.
	 */
	private List<Topic> topics = new ArrayList<> (Arrays.asList(
			new Topic ("spring","Spring framework", "Spring framework Description"),
			new Topic ("java","java framework", "java framework Description"),
			new Topic ("DotNet","DotNet framework", "DotNet framework Description")
			));


	public List<Topic> getAllTopics() {
		// TODO Auto-generated method stub
		return topics;
	}


	public Topic getTopic(String id) {
		/**
		 * topics is a List which is converted to
		 * stream
		 * Then filter is applied to get the id that matches first with
		 * passed argumet 'id' & fetched via get().
		 * -> is lambda expression ( efficient way of searching).
		 */
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}


	public void putTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic) ;
	}
}
