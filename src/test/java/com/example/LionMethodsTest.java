package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;

import static org.mockito.Mockito.when;

public class LionMethodsTest {
    public static final String SEX = "Самец";
    public static final String PREDATOR = "Хищник";
    public static final List<String> PREDATOR_FOOD = List.of("Животные", "Птицы", "Рыба");
    private Feline mockFeline;
    private Lion lion;

    @Before
    public void prepareLionObject() throws Exception {
        mockFeline = Mockito.mock(Feline.class);
        lion = new Lion(mockFeline,SEX);
    }

    @Test
    public void shouldReturnKittensForLion() throws Exception {
        when(mockFeline.getKittens()).thenReturn(5);
        Assert.assertEquals(5,lion.getKittens());
    }

    @Test
    public void shouldReturnListOfFoodForLion() throws Exception {
        when(mockFeline.getFood(PREDATOR)).thenReturn(PREDATOR_FOOD);
        Assert.assertEquals(PREDATOR_FOOD,lion.getFood());
    }
}
