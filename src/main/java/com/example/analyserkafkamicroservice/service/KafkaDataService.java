

import com.example.analyserkafkamicroservice.model.Data;

public interface KafkaDataService {

    void handle(Data data);

}
