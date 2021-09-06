package compFuture_solution;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Evegeny on 08/02/2017.
 */
public class SerialService {
    private Map<String, Serial> cache = new ConcurrentHashMap<>();

    public CompletableFuture<Serial> getSerial(String name) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return cache.getOrDefault(name, new Serial(name));
        });

    }

    public void updateSerial(CompletableFuture<Serial> serialCompletableFuture) {
        serialCompletableFuture.thenAccept(serial -> {
            cache.put(serial.getName(), serial);
            System.out.println(serial + " was updated");
        });

    }
}
