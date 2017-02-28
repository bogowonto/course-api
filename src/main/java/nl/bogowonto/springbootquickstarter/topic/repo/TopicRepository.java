package nl.bogowonto.springbootquickstarter.topic.repo;

import org.springframework.data.repository.CrudRepository;

import nl.bogowonto.springbootquickstarter.topic.Topic;

public interface TopicRepository extends CrudRepository<Topic, Long> {

}
