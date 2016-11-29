package br.com.vrnery.tutorial.mockito.powermock;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({UtilityClass.class})
public class PowerMockitoMockingStaticMethodTest {

	@Mock
    Dependency dependencyMock;

    @InjectMocks
    SystemUnderTest systemUnderTest;

    @Test
    public void powerMockito_MockingAStaticMethodCall() {

        Mockito.when(dependencyMock.retrieveAllStats()).thenReturn(Arrays.asList(1, 2, 3));

        PowerMockito.mockStatic(UtilityClass.class);

        Mockito.when(UtilityClass.staticMethod(Matchers.anyLong())).thenReturn(150);

        assertEquals(150, systemUnderTest.methodCallingAStaticMethod());

        //To verify a specific method call
        //First : Call PowerMockito.verifyStatic() 
        //Second : Call the method to be verified
        PowerMockito.verifyStatic();
        UtilityClass.staticMethod(1 + 2 + 3);

        // verify exact number of calls
        PowerMockito.verifyStatic(Mockito.times(1));

    }

}
