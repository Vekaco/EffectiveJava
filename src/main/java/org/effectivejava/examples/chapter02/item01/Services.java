package org.effectivejava.examples.chapter02.item01;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {
    /**
     * private constructor, non-instantiable class for services registration and access
     */
    private Services(){ }

    //Map service names to services
    private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();

    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    //provider registration API
    //1.default provider registration
    public static final void registerDefaultProvider(Provider p) {
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }
    //2.specific provider registration
    public static final void registerProvider(String name, Provider p) {
        providers.put(name, p);
    }
    //service access API
    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null) {
            throw new IllegalArgumentException("No provider registered with name:" + name);
        }
        return p.newService();
     }
}

