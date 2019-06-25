package org.effectivejava.examples.chapter06.item33;

import java.util.EnumMap;
import java.util.Map;

public enum EnumMapPhase {

    SOLID, LIQUID, GAS;

    public enum Transition {
        MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID),
        BOIL(LIQUID, GAS), CONDENSE(GAS, LIQUID),
        SUBLIME(SOLID, GAS), DEPOSIT(GAS, SOLID);

        //initialize the phase transition map
        private static final Map<EnumMapPhase, Map<EnumMapPhase, Transition>> m =
                new EnumMap<EnumMapPhase, Map<EnumMapPhase, Transition>>(EnumMapPhase.class);
        static {
            for (EnumMapPhase p: EnumMapPhase.values()){
                m.put(p, new EnumMap<EnumMapPhase, Transition>(EnumMapPhase.class));
            }

            for (Transition t : Transition.values()) {
                m.get(t.src).put(t.dst, t);
            }

        }
        private final EnumMapPhase src;
        private final EnumMapPhase dst;

        Transition(EnumMapPhase src, EnumMapPhase dst) {
            this.src = src;
            this.dst = dst;
        }

        public static Transition from(EnumMapPhase src, EnumMapPhase dst) {
            return m.get(src).get(dst);
        }
    }

}
