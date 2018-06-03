package not_related_to_spring_cloud_qualifier_example;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Oracle
public class BackupDao implements Dao {
    @Override
    public void save() throws InterruptedException {
        Thread.sleep(200);
        System.out.println("saving to oracle...");
    }
}
