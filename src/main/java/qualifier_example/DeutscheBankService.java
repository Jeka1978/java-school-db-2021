package qualifier_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class DeutscheBankService {

    @DBRepo(DBType.MONGO)
    private DeutscheBankRepo prodRepo;

    @DBRepo(DBType.ORACLE)
    private DeutscheBankRepo backupRepo;


    @Scheduled(fixedDelay = 1000)
    public void save() {
        prodRepo.saveAll();
    }


    @Scheduled(fixedDelay = 3000)
    public void backup() {
        backupRepo.saveAll();
    }


}
