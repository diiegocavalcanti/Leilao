package com.github.diiegocavalcanti.agenda;
import com.github.diiegocavalcanti.agenda.Usuario;
import com.github.diiegocavalcanti.agenda.Leilao;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteItem {
	@Test
	public void deveTerUmDono(){
		Leilao l = new Leilao(new Usuario("Diego Cavalcanti", "diego@email.com"),"Notebook HP", "Hotebook HP Com 8Gb de Memória, 500gb de HD");
		assertEquals("Diego Cavalcanti", l.dono().nome());
	}
	@Test
	public void deveTerUmEmail(){
		Leilao l = new Leilao(new Usuario("Diego Cavalcanti", "diego@email.com"),"Notebook HP", "Hotebook HP Com 8Gb de Memória, 500gb de HD");
		assertEquals("diego@email.com", l.dono().email());
	}
}
