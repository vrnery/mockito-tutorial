package br.com.vrnery.tutorial.mockito.powermock;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({SystemUnderTest.class /*To be able to mock the Constructor, we need to add in the Class that creates the new object*/})
public class PowerMockitoMockingConstructorTest {

	private static final int SOME_DUMMY_SIZE = 100;

    @Mock
    Dependency dependencyMock;

    @InjectMocks
    SystemUnderTest systemUnderTest;

    @Test
    public void powerMockito_MockingAConstructor() throws Exception {

        ArrayList<String> mockList = Mockito.mock(ArrayList.class);

        Mockito.stub(mockList.size()).toReturn(SOME_DUMMY_SIZE);

        PowerMockito.whenNew(ArrayList.class).withAnyArguments().thenReturn(mockList);

        int size = systemUnderTest.methodUsingAnArrayListConstructor();

        assertEquals(SOME_DUMMY_SIZE, size);
    }

}
