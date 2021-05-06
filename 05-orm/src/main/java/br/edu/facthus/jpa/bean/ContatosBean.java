package br.edu.facthus.jpa.bean;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.facthus.jpa.entity.Contato;

@Stateless
public class ContatosBean {
	
	@SuppressWarnings("unused")
	private static final Logger logger = 
			Logger.getLogger(ContatosBean.class.getName());
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void cadastra(Contato contato) {
		entityManager.persist(contato);
	}
	
	public void atualiza(Contato contato) {
		entityManager.merge(contato);
	}
	
	public List<Contato> lista() {
		return entityManager
				.createQuery("SELECT c FROM Contato c", Contato.class)
				.getResultList();
	}

}
