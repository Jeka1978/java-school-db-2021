package qualifier_example;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@DBRepo(DBType.ORACLE)
public class BackupDeutscheBankRepo implements DeutscheBankRepo {
    @Override
    public void saveAll() {
        System.out.println("Saving to ORACLE");
    }
}
