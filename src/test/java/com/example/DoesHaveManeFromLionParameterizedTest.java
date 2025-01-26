package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class DoesHaveManeFromLionParameterizedTest {
    private final String sex;
    private final boolean expectedHasManeValue;

    Feline mockFeline = Mockito.mock(Feline.class);

    public  DoesHaveManeFromLionParameterizedTest(String sex, boolean expectedHasManeValue) {
        this.sex = sex;
        this.expectedHasManeValue = expectedHasManeValue;
    }
    @Parameterized.Parameters
    public static Object[][] getTestParameters() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void shouldReturnCorrectValueHasMane() throws Exception {
        Lion lion = new Lion(mockFeline,sex);
        Assert.assertEquals(expectedHasManeValue,lion.doesHaveMane());
    }
}
