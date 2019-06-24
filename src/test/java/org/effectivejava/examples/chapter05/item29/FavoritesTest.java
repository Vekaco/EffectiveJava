package org.effectivejava.examples.chapter05.item29;

import org.junit.Test;

import java.util.List;

public class FavoritesTest {

    @Test
    public void test() {
        Favorites f = new Favorites();
        f.putFavorite(String.class, "Java");
        f.putFavorite(Integer.class, 0xcafebabe);
        f.putFavorite(Class.class, Favorites.class);

        String favoriteString = f.getFavorite(String.class);
        int favoriteInteger = f.getFavorite(Integer.class);
        Class<?> favoriteClass = f.getFavorite(Class.class);

        System.out.printf("%s %x %s%n",favoriteString, favoriteInteger, favoriteClass.getName());
    }
}
