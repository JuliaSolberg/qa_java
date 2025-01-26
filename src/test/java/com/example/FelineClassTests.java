package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;


public class FelineClassTests {

    public static final List<String> ANIMAL_FOOD = List.of("Животные", "Птицы", "Рыба");
    public static final String FAMILY_NAME = "Кошачьи";
    private Feline feline;

    @Before
    public void prepareFelineObject() {
        feline = new Feline();
    }

    @Test
    public void shouldReturnListOfFood() throws Exception {
        Assert.assertEquals(ANIMAL_FOOD,feline.eatMeat());
    }

    @Test
    public void shouldReturnFamilyName() {
        Assert.assertEquals(FAMILY_NAME,feline.getFamily());
    }

    @Test
    public void shouldReturnDefaultNumberOfKittens() {
        Assert.assertEquals(1,feline.getKittens());
    }

    @Test
    public void shouldReturnSpecifiedNumberOfKittens() {
        Assert.assertEquals(5,feline.getKittens(5));
    }
}
