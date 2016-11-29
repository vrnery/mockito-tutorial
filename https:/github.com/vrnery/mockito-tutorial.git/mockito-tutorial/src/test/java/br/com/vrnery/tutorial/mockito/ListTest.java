package br.com.vrnery.tutorial.mockito;

import static org.junit.Assert.*;

import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;

public class ListTest {

	@Test
    public void letsMockListSize() {
        List list = Mockito.mock(List.class);
        Mockito.when(list.size()).thenReturn(10);
        assertEquals(10, list.size());
    }

    @Test
    public void letsMockListSizeWithMultipleReturnValues() {
        List list = Mockito.mock(List.class);
        Mockito.when(list.size()).thenReturn(10).thenReturn(20);
        assertEquals(10, list.size()); // First Call
        assertEquals(20, list.size()); // Second Call
    }

    @Test
    public void letsMockListGet() {
        List<String> list = Mockito.mock(List.class);
        Mockito.when(list.get(0)).thenReturn("in28Minutes");
        assertEquals("in28Minutes", list.get(0));
        assertNull(list.get(1));
    }

    @Test(expected = RuntimeException.class)
    public void letsMockListGetToThrowException() {
        List<String> list = Mockito.mock(List.class);
        Mockito.when(list.get(Mockito.anyInt())).thenThrow(new RuntimeException("Something went wrong"));
        list.get(0);
    }

    @Test
    public void letsMockListGetWithAny() {
        List<String> list = Mockito.mock(List.class);
        Mockito.when(list.get(Mockito.anyInt())).thenReturn("in28Minutes");
        // If you are using argument matchers, all arguments
        // have to be provided by matchers.
        assertEquals("in28Minutes", list.get(0));
        assertEquals("in28Minutes", list.get(1));
    }

    @Test
    public void bddAliases_UsingGivenWillReturn() {
        List<String> list = Mockito.mock(List.class);

        //given
        BDDMockito.given(list.get(Mockito.anyInt())).willReturn("in28Minutes");

        //then
        assertThat("in28Minutes", CoreMatchers.is(list.get(0)));
        assertThat("in28Minutes", CoreMatchers.is(list.get(0)));
    }

}
