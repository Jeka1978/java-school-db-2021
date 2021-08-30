package qualifier_example;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@DBRepo(DBType.MONGO)
public class DeutscheBankRepoImpl implements DeutscheBankRepo {
    @Override
    public void saveAll() {
        System.out.println("Saving to MONGO");
    }
}
