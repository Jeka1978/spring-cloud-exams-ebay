package not_related_to_spring_cloud_qualifier_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
@EnableScheduling
public class MainService {

    private final Dao mainDao;

    private final Dao backupDao;

    @Autowired
    public MainService(@Mongo Dao mainDao, @Oracle Dao backupDao) {
        this.mainDao = mainDao;
        this.backupDao = backupDao;
    }


    @Scheduled(fixedDelay = 1000)
    public void work() throws InterruptedException {
        mainDao.save();
    }

    @Scheduled(fixedDelay = 3000)
    public void backup() throws InterruptedException {
        backupDao.save();
    }

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("not_related_to_spring_cloud_qualifier_example");
    }
}
