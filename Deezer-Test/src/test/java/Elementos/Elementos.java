package Elementos;

import org.openqa.selenium.By;

public class Elementos {
//Elementos Deezer
	private By pais = By.cssSelector("#register_form_country_input > option:nth-child(43)");

	private By celular = By.id("register_form_phone_onput");

	private By aceitar = By.xpath("//*[@id=\"react-cookie\"]/div/div/div[2]/button[1]");
	private By sexoM = By.className("#register_form_gender_input > option:nth-child(3)");

	private By idade = By.cssSelector("#register_form_age_input > option:nth-child(21)");

	// Elementos Spotify
	private By termos = By.cssSelector(
			"#__next > main > div.encore-light-theme > div > div.Group-sc-1lird8m-0.exjUsB > div > label > span.Indicator-sc-11vkltc-0.ioJObh");
	private By email = By.id("email");
	private By confEmail = By.id("confirm");
	private By criaSenha = By.id("password");
	private By apelido = By.id("displayname");
	private By dia = By.id("day");
	private By mes = By.id("month");
	private By ano = By.id("year");
	private By generoM = By.cssSelector(
			"#__next > main > div.encore-light-theme > div > form > fieldset > div > div:nth-child(1) > label > span.Indicator-sc-16vj7o8-0.iBjMfh");
	private By generoF = By.cssSelector(
			"#__next > main > div.encore-light-theme > div > form > fieldset > div > div:nth-child(2) > label > span.Indicator-sc-16vj7o8-0.iBjMfh");
	private By noRecMsg = By.cssSelector(
			"#__next > main > div.encore-light-theme > div > form > div:nth-child(7) > div > label > span.Indicator-sc-11vkltc-0.ioJObh");
	private By compart = By.cssSelector(
			"#__next > main > div.encore-light-theme > div > form > div:nth-child(8) > div > label > span.Indicator-sc-11vkltc-0.ioJObh");
	private By termos2 = By.cssSelector(
			"#__next > main > div.encore-light-theme > div > form > div:nth-child(9) > div.Checkbox-sc-1141y94-0.hGrZOT > label > span.Indicator-sc-11vkltc-0.ioJObh");
	private By abrirTermos = By.cssSelector(
			"#__next > main > div.encore-light-theme > div > form > div.EmailForm__Center-jwtojv-0.eaexVT > p.Type__TypeElement-sc-9snywk-0.bRyGwI > span > a");
	private By julho = By.cssSelector("#month > option:nth-child(7)");
	// publico Deezer

	public By getPais() {
		return pais;
	}

	public By getCelular() {
		return celular;
	}

	public By getAceitar() {
		return aceitar;
	}

	public By getSexoM() {
		return sexoM;
	}

	public By getIdade() {
		return idade;
	}
//publico Spotify

	public By getTermos() {
		return termos;
	}

	public By getEmail() {
		return email;
	}

	public By getConfEmail() {
		return confEmail;
	}

	public By getCriaSenha() {
		return criaSenha;
	}

	public By getApelido() {
		return apelido;
	}

	public By getDia() {
		return dia;
	}

	public By getMes() {
		return mes;
	}

	public By getAno() {
		return ano;
	}

	public By getGeneroM() {
		return generoM;
	}

	public By getGeneroF() {
		return generoF;
	}

	public By getNoRecMsg() {
		return noRecMsg;
	}

	public By getCompart() {
		return compart;
	}

	public By getTermos2() {
		return termos2;
	}

	public By getAbrirTermos() {
		return abrirTermos;
	}

	public By getJulho() {
		return julho;
	}

}
