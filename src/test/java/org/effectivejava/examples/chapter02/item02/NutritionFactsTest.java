package org.effectivejava.examples.chapter02.item02;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NutritionFactsTest {

    @Before
    public void before() {
        System.out.println("start testing...");
    }

    @Test
    public void test() {
        NutritionFacts.Builder builder = new NutritionFacts.Builder(100, 10);
        NutritionFacts nutritionFacts = builder.calories(10).carbohydrate(12).fat(0).sodium(0).build();

        assertEquals(100, nutritionFacts.getServingSize());
        assertEquals(10, nutritionFacts.getServings());
        assertEquals(10, nutritionFacts.getCalories());
        assertEquals(12, nutritionFacts.getCarbohydrate());
        assertEquals(0, nutritionFacts.getFat());
        assertEquals(0, nutritionFacts.getSodium());


    }

    @After
    public void after() {
        System.out.println("end testing...");
    }
}
