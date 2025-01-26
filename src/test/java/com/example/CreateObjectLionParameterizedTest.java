
package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class CreateObjectLionParameterizedTest {
    private final String sex;
    private final String expectedValue;

    Feline mockFeline = Mockito.mock(Feline.class);

    public CreateObjectLionParameterizedTest(String sex, String expectedValue) {
        this.sex = sex;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Object[][] getObjectParameters() {
        return new Object[][] {
                {"Самец", "true"},
                {"Самка", "false"},
                {"неизвестный пол", "Используйте допустимые значения пола животного - самец или самка"},
        };
    }
    @Test
    public void shouldCreateObjectLion() throws Exception {
        if ("неизвестный пол".equals(sex)) {
            Exception exception = Assert.assertThrows(Exception.class, () -> new Lion(mockFeline,sex));
            Assert.assertEquals(expectedValue,exception.getMessage());
        } else {
            try {
                Lion lion = new Lion(mockFeline,sex);
                Assert.assertEquals(expectedValue,String.valueOf(lion.hasMane));
            } catch (Exception e) {
                Assert.fail("Исключение не должно быть выброшено для пола: " + sex);
            }
        }
    }
}

