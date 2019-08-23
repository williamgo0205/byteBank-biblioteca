package br.com.alura.byteBank;

import br.com.byteBank.banco.modelo.Conta;
import br.com.byteBank.banco.modelo.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(123,321);
		
		c.deposita(100.00);
		
		System.out.println(c.getSaldo());

	}
}
