package br.usjt.PrevisaoDoTempo.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.PrevisaoDoTempo.model.DiaDaSemana;
import br.usjt.PrevisaoDoTempo.model.Previsao;
import br.usjt.PrevisaoDoTempo.repository.JPAUtil;

public class CriandoPrevisao {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		DiaDaSemana d = new DiaDaSemana();
		d.setDiadasemana("Segunda-feira");
		manager.persist(d);
		Previsao u = new Previsao();
		u.setTemperaturamax(17.4);
		u.setTemperaturamin(17.6);
		u.setHumidaderelativa(1022);
		u.setDescricao("Sky is clear");
		u.setDatahora("11/05/2020 18:21");
		u.setLatitude(-23.5489);
		u.setLongitude(-46.638823);
		u.setDiadasemana(d);
		manager.persist(u);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}
