package projeto_spring_data;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import projeto_spring_data_dao.InterfaceSpringDataUser;
import projeto_spring_data_model.UsuarioSpringData;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/spring-config.xml"})
public class AppSpringDataTest {

	@Autowired
	private InterfaceSpringDataUser interfaceSpringDataUser;
	
	@Test
	public void testInsert() {
		
		UsuarioSpringData usuarioSpringData = new UsuarioSpringData();
		
		usuarioSpringData.setEmail("felipe@teste.com");
		usuarioSpringData.setNome("felipe figueira");
		usuarioSpringData.setLogin("felipe.fig");
		usuarioSpringData.setIdade(23);
		usuarioSpringData.setSenha("123");
		
		interfaceSpringDataUser.save(usuarioSpringData);
		
	}
	
}
