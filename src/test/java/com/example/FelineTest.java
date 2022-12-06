package com.example;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)

public class FelineTest extends TestCase {


    @Mock Feline feline;

    @Test
    public void testEatMeat() throws Exception {
        when(feline.eatMeat()).thenReturn(List.of("Животные, Птицы, Рыба"));
        var feline = new Feline();
        assertEquals("Животные, Птицы, Рыба", String.join(", ",feline.eatMeat()));//добавила объединение элементов

    }

@Test
    public void testGetFamily() {
        var feline = new  Feline();
        assertEquals("Кошачьи", feline.getFamily());

    }

@Test
    public void testGetKittens() {

        when(feline.getKittens()).thenReturn(1);
        var feline = new Feline();
        assertEquals(1, feline.getKittens());
    }
}