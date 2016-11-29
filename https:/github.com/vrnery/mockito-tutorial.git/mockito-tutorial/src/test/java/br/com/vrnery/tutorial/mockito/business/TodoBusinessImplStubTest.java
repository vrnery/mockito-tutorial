package br.com.vrnery.tutorial.mockito.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import br.com.vrnery.tutorial.mockito.data.api.TodoService;
import br.com.vrnery.tutorial.mockito.data.stub.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void usingAStub() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Ranga");
		assertEquals(2, todos.size());
	}

}
