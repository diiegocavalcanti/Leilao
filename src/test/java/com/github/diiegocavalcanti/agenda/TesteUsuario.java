package com.github.diiegocavalcanti.agenda;
import com.github.diiegocavalcanti.agenda.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteUsuario{
	@Test
	public void deveTestarUsuario(){
		Usuario u = new Usuario("Diego", "diego@agenciamoob.com.br");
		assertEquals("Diego", u.nome());
	}
}
