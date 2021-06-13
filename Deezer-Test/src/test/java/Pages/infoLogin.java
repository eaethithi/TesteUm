package Pages;

import Elementos.Elementos;

public class infoLogin {

	Elementos el = new Elementos();
	Metodos metodos = new Metodos();

	public void preencherCadastro(String email, String confirmEmail, String senha, String apelido) throws InterruptedException {
		metodos.escreverTempo(el.getEmail(), email);
		metodos.Escrever(confirmEmail, el.getConfEmail());
		metodos.Escrever(senha, el.getCriaSenha());
		metodos.Escrever(apelido, el.getApelido());
	}

	public void DataNasc(String dia, String mes, String ano) {
		metodos.Escrever(dia, el.getDia());
		metodos.Escrever(mes, el.getMes());
		metodos.Escrever(ano, el.getAno());

	}

}
