package org.effectivejava.examples.chapter02.item01;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ServicesTest {
    //default provider
    private static Provider DEFAULT_PROVIDER = new Provider() {
        public Service newService() {
            return new Service() {
                @Override
                public String toString() {
                    return "Default service";
                }
            };
        }
    };
    private static Provider COMP_PROVIDER = new Provider() {
        public Service newService() {
            return new Service() {
                @Override
                public String toString() {
                    return "Complementary service";
                }
            };
        }
    };
    private static Provider ARMED_PROVIDER = new Provider() {
        public Service newService() {
            return new Service() {
                @Override
                public String toString() {
                    return "Armed service";
                }
            };
        }
    };

    @Before
    public void before() {
        System.out.println("------Started-------");
        Services.registerDefaultProvider(DEFAULT_PROVIDER);
        Services.registerProvider("comp", COMP_PROVIDER);
        Services.registerProvider("armed", ARMED_PROVIDER);
        System.out.println("-Services Registered-");
    }

    @Test
    public void accessServices() {
        Service def = Services.newInstance();
        Service comp = Services.newInstance("comp");
        Service armed = Services.newInstance("armed");

        assertEquals("Default service", def.toString());
        assertEquals("Complementary service", comp.toString());
        assertEquals("Armed service", armed.toString());
        System.out.println("----Test Completed----");

    }
    @After
    public void after(){
        System.out.println("-------Ended--------");
    }

}
