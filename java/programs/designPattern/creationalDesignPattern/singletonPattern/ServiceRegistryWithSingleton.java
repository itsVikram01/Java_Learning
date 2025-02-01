package programs.designPattern.creationalDesignPattern.singletonPattern;


import java.util.HashMap;
import java.util.Map;

public class ServiceRegistryWithSingleton {
    private static ServiceRegistryWithSingleton instance;
    private final Map<String, String> services = new HashMap<>();

    private ServiceRegistryWithSingleton() {
    }

    public static ServiceRegistryWithSingleton getInstance() {
        if (instance == null) {
            synchronized (ServiceRegistryWithSingleton.class) {
                if (instance == null) {
                    instance = new ServiceRegistryWithSingleton();
                }
            }
        }
        return instance;
    }

    public void registerService(String name, String url) {
        services.put(name, url);
    }

    public String getServiceUrl(String name) {
        return services.get(name);
    }
}