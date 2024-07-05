package powermock;

import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.example.powermock.Dependency;
import org.example.powermock.SystemUnderTest;
import org.example.powermock.UtilityClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ UtilityClass.class})
public class PowerMockitoMockingStaticMethodTest {

    @Mock
    Dependency dependencyMock;

    @InjectMocks
    SystemUnderTest systemUnderTest;

    @Test
    public void powerMockito_MockingAStaticMethodCall() {

        when(dependencyMock.retrieveAllStats()).thenReturn(
                Arrays.asList(1, 2, 3));

        PowerMockito.mockStatic(UtilityClass.class);

        when(UtilityClass.staticMethod(anyLong())).thenReturn(150);


    }
}