package br.usjt.PrevisaoDoTempo.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.PrevisaoDoTempo.model.Usuario;
import br.usjt.PrevisaoDoTempo.repository.JPAUtil;

public class CriandoUsuario {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Usuario u = new Usuario ();
		u.setLogin("admin");
		u.setSenha("admin");
		manager.persist(u);
		transaction.commit();
		manager.close();
		JPAUtil.close();
		}
}
