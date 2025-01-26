package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.when;

public class CatClassTests {
    private static final String MEOW_SOUND = "Мяу";
    public static final List<String> CAT_FOOD = List.of("Животные", "Птицы", "Рыба");
    private Feline mockFeline;
    private Cat cat;

    @Before
    public void prepareCatObject() {
        mockFeline = Mockito.mock(Feline.class);
        cat = new Cat(mockFeline);
    }

    @Test
    public void shouldReturnMeowSound() {
        Assert.assertEquals(MEOW_SOUND,cat.getSound());
    }

    @Test
    public void shouldReturnListOfFoodForCat() throws Exception{
        when(mockFeline.eatMeat()).thenReturn(CAT_FOOD);
        Assert.assertEquals(CAT_FOOD,cat.getFood());
    }
}
