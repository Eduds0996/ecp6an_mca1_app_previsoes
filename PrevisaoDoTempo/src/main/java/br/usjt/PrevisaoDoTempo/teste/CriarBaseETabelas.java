package br.usjt.PrevisaoDoTempo.teste;

import javax.persistence.Persistence;

public class CriarBaseETabelas {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("usjtPU");
	}
}
