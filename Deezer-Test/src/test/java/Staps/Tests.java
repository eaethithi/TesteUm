package Staps;

import Elementos.Elementos;
import Pages.AbrirBrowser;
import Pages.Metodos;
import Pages.infoLogin;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class Tests {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	AbrirBrowser ab = new AbrirBrowser();
	infoLogin info = new infoLogin();

	@Dado("que esteja no {string}")
	public void que_esteja_no(String Site) {
		ab.abrirFirefox(Site);
	}

	@Quando("eu preencher o cadastro")
	public void eu_preencher_o_cadastro() throws InterruptedException {
		metodo.Clicar(el.getTermos());
		metodo.Escrever("bomdiaecia@gmail.com", el.getEmail());
		metodo.Escrever("bomdiaecia@gmail.com", el.getConfEmail());
		metodo.Escrever("40028922", el.getCriaSenha());
		metodo.Escrever("japones", el.getApelido());
		metodo.Escrever("02", el.getDia());
		metodo.Escrever("06", el.getMes());
		metodo.Escrever("2002", el.getAno());
		metodo.Clicar(el.getJulho());
		metodo.Clicar(el.getGeneroM());
		metodo.Clicar(el.getNoRecMsg());
		metodo.Clicar(el.getCompart());
		metodo.Clicar(el.getAbrirTermos());
	}

	@Entao("cadastro realizado com sucesso,parabens")
	public void cadastro_realizado_com_sucesso_parabens() {
		ab.fecharNavegador(" ");
		ab.fecharNavegador("");
	}

}