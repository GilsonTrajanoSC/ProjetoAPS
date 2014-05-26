import static org.junit.Assert.*;

import org.junit.Test;

import teste.Login;


public class test {

	@Test
	public void loginExistente() {
		Login l = new Login();
		assertFalse(l.nomeExistente("Gilson"));
		l.setUsuario("Gilson");
		assertTrue(l.nomeExistente("Gilson"));
		l.setSenha("123");
		assertEquals("123",l.getSenha());
	}
	
}
