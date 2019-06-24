package org.effectivejava.examples.chapter06.item30;

import org.junit.Test;

public class PlanetTest {

    @Test
    public void testPlanet() {
        double earthWeight = 100.00;
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for(Planet p: Planet.values())
            System.out.printf("Weight on %s is %f%n",p, p.sufaceWeight(mass));
    }
}
