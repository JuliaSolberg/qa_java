package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class AlexClassTests {
    private static final List<String> LIST_OF_FRIENDS = List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
    private static final String PLACE_OF_LIVING = "Нью-Йоркский зоопарк";
    Feline mockFeline = Mockito.mock(Feline.class);

    @Test
    public void shouldCreateAlexWithMaleSex() throws Exception {
        Alex alex = new Alex(mockFeline);
        Assert.assertTrue(alex.doesHaveMane());
    }

    @Test
    public void shouldReturnZeroKittens() throws Exception {
        Alex alex = new Alex(mockFeline);
        Assert.assertEquals(0,alex.getKittens());
    }

    @Test
    public void shouldReturnListOfFriends() throws Exception {
        Alex alex = new Alex(mockFeline);
        Assert.assertEquals(LIST_OF_FRIENDS,alex.getFriends());
    }

    @Test
    public void shouldReturnPlaceOfLiving() throws Exception {
        Alex alex = new Alex(mockFeline);
        Assert.assertEquals(PLACE_OF_LIVING,alex.getPlaceOfLiving());
    }
}
