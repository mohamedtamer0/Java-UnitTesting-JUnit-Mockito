package business;

import static org.junit.Assert.assertEquals;

import java.util.List;

import data.TodoServiceStub;
import org.example.business.TodoBusinessImpl;
import org.example.data.TodoService;
import org.junit.Test;


public class TodoBusinessImplStubTest {

	@Test
	public void usingAStub() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Tamer");
		assertEquals(2, todos.size());
	}
}