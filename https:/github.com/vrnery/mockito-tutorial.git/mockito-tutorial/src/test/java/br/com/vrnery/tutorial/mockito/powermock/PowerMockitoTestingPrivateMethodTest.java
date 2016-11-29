package br.com.vrnery.tutorial.mockito.powermock;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

@RunWith(PowerMockRunner.class)
public class PowerMockitoTestingPrivateMethodTest {

	@Mock
    Dependency dependencyMock;

    @InjectMocks
    SystemUnderTest systemUnderTest;

    @Test
    public void powerMockito_CallingAPrivateMethod() throws Exception {
        Mockito.when(dependencyMock.retrieveAllStats()).thenReturn(Arrays.asList(1, 2, 3));
        long value = (Long) Whitebox.invokeMethod(systemUnderTest, "privateMethodUnderTest");
        assertEquals(6, value);
    }

}
