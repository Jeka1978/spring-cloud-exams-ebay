package not_related_to_spring_cloud_qualifier_example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Mongo
public class DaoImpl implements Dao {
    @Override
    public void save() {
        System.out.println("saving to Mongo...");
    }
}
