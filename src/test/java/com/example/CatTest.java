package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import junit.framework.TestCase;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest extends TestCase {
@Mock Feline feline;

    @Test
    public void testGetSound() {
        var cat = new Cat(new Feline());
        assertEquals("Мяу", cat.getSound());
    }
    @Test
    public void testGetFood() throws Exception {
        when(feline.eatMeat()).thenReturn(List.of("Хищник"));
        var cat = new Cat(feline);
        assertEquals("Хищник", cat.getFood());
    }
}