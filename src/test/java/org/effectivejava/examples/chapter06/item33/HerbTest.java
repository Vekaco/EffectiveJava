package org.effectivejava.examples.chapter06.item33;

import org.junit.Before;
import org.junit.Test;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HerbTest {
    Herb[] garden;
    @Before
    public void init() {
         garden = new Herb[]{new Herb("Basil", Herb.Type.ANNUAL),
                new Herb("Carroway", Herb.Type.BIENNIAL),
                new Herb("Dill", Herb.Type.ANNUAL),
                new Herb("Lavendar", Herb.Type.PERENNIAL),
                new Herb("Parsley", Herb.Type.BIENNIAL),
                new Herb("Rosemary", Herb.Type.PERENNIAL)};
    }

    @Test
    public void testNotUsingEnumMap() {
        //Using ordinal() to index an array - DON'T DO THIS!!!

        //not using general type, and existing unchecked cast.
        Set<Herb>[] herbsByType = (Set<Herb>[]) new Set[Herb.Type.values().length];//Indexed by Herb.Type.ordinal()
        for (int i = 0; i < herbsByType.length; i++) {
            herbsByType[i] = new HashSet<Herb>();
        }

        for (Herb h : garden) {
            herbsByType[h.type.ordinal()].add(h);
        }

        //existing risk of ArrayIndexOutOfBoundException
        for (int i = 0; i < herbsByType.length; i++) {
            System.out.printf("%s:%s%n", Herb.Type.values()[i], herbsByType[i]);
        }
    }

    @Test
    public void testUsingEnumMap() {
        Map<Herb.Type, Set<Herb>> herbsByType = new EnumMap<Herb.Type, Set<Herb>>(Herb.Type.class);
        //initialize
        for (Herb.Type t: Herb.Type.values())
            herbsByType.put(t, new HashSet<Herb>());
        for (Herb h: garden)
            herbsByType.get(h.type).add(h);

        System.out.println(herbsByType);
    }
}
