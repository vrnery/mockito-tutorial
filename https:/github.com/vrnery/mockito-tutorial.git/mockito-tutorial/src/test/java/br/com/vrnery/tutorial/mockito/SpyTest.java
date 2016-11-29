package br.com.vrnery.tutorial.mockito;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class SpyTest {

	@Test
    public void creatingASpyOnArrayList() {
        List<String> listSpy = Mockito.spy(ArrayList.class);
        listSpy.add("Ranga");
        listSpy.add("in28Minutes");

        Mockito.verify(listSpy).add("Ranga");
        Mockito.verify(listSpy).add("in28Minutes");

        assertEquals(2, listSpy.size());
        assertEquals("Ranga", listSpy.get(0));
    }

    @Test
    public void creatingASpyOnArrayList_overridingSpecificMethods() {
        List<String> listSpy = Mockito.spy(ArrayList.class);
        listSpy.add("Ranga");
        listSpy.add("in28Minutes");

        Mockito.stub(listSpy.size()).toReturn(-1);

        assertEquals(-1, listSpy.size());
        assertEquals("Ranga", listSpy.get(0));

        // @Spy Annotation
    }

}
