package mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;

import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SpyTest {

	@Test
	public void creatingASpyOnArrayList() {
		List<String> listSpy = spy(ArrayList.class);
		listSpy.add("Mohamed");
		listSpy.add("Tamer");

		verify(listSpy).add("Mohamed");
		verify(listSpy).add("Tamer");

		assertEquals(2, listSpy.size());
		assertEquals("Mohamed", listSpy.get(0));
	}


}