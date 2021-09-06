package compFuture_problem;

import lombok.SneakyThrows;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Evegeny on 08/02/2017.
 */
public class SerialService {
    private Map<String, Serial> cache = new ConcurrentHashMap<>();
    @SneakyThrows
    public Serial getSerial(String name) {
        Thread.sleep(3000);
        return cache.getOrDefault(name,new Serial(name));
    }

    public void updateSerial(Serial serial) {
        cache.put(serial.getName(), serial);
        System.out.println(serial+" was updated");
    }
}
