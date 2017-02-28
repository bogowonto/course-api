package nl.bogowonto.springbootquickstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(
			Arrays.asList(new Topic(1L, "Spring Framework", "Spring Framework Description"),
					new Topic(2L, "Core Java", "Core Java Description"),
					new Topic(3L, "Java Script", "Java Script Description")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(Long id) {
		return topics.stream().filter(t -> t.getId() == id).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, Long id) {
		topics.forEach(t -> {
			if (t.getId() == id) {
			}
		});
	}

	public void removeTopic(Long id) {
		topics.removeIf(t -> t.getId() == id);
	}
}
