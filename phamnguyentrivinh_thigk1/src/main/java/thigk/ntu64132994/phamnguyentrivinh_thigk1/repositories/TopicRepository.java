package thigk.ntu64132994.phamnguyentrivinh_thigk1.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import thigk.ntu64132994.phamnguyentrivinh_thigk1.models.Topic;

@Repository
public class TopicRepository {
    private final List<Topic> topics = new ArrayList<>();

    public TopicRepository() {
        // Thêm dữ liệu mẫu
        topics.add(new Topic(1, "Topic 1", "Description 1", 101, "Type A"));
        topics.add(new Topic(2, "Topic 2", "Description 2", 102, "Type B"));
    }

    public List<Topic> findAll() {
        return topics;
    }

    public Optional<Topic> findById(int id) {
        return topics.stream().filter(topic -> topic.getId() == id).findFirst();
    }

    public void save(Topic topic) {
        topics.add(topic);
    }

    public void deleteById(int id) {
        topics.removeIf(topic -> topic.getId() == id);
    }

    public void update(Topic updatedTopic) {
        findById(updatedTopic.getId()).ifPresent(topic -> {
            topic.setTopicName(updatedTopic.getTopicName());
            topic.setTopicDescription(updatedTopic.getTopicDescription());
            topic.setSupervisorId(updatedTopic.getSupervisorId());
            topic.setTopicType(updatedTopic.getTopicType());
        });
    }
}