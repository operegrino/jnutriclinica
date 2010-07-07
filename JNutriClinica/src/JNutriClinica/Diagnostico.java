package JNutriClinica;

import java.util.Calendar;

import JNutriClinica.Anamnese.atividadeFisica;
import JNutriClinica.Anamnese.patologiaChave;
import JNutriClinica.Pessoa.classificacaoIMC;

/**
 *Classe que   
 *
 * @author Antonio Ricardo
 *
 */


public class Diagnostico {
	
	private String nome;
	private int idade;
	private double imc;
	private double pesoIdeal;
	
	private double relacaoCQ;
	private double tmb;
	private double vet;
	private classificacaoIMC classificacaoIMC;

	private double pesoUsual;
	private double altura;
	private double cintura;
	private double quadril;
	private String sintomasGI;
	private patologiaChave patologiaChave;
	private boolean tomaMedicamentos;
	private int medicacoesPorDia;
	private atividadeFisica atividadeFisica;
	
	

	
	private Calendar diaDaConsulta;
	private Calendar diaDeRetorno;
	private Pessoa pessoa;
	
	public Diagnostico(Pessoa pessoa) throws Exception{
		
		setPessoa(pessoa);
		setDiaDaConsulta(diaDaConsulta);
		setDiaDeRetorno(diaDeRetorno);
		
		
		nome = pessoa.getNome();
		idade = pessoa.getIdade();
		imc = pessoa.getIMC();
		pesoIdeal = pessoa.getAnamnese().getPesoUsual();
		relacaoCQ = pessoa.getRelacaoCinturaQuadril();
		tmb = pessoa.getTMB();
		vet = pessoa.getVET();
		classificacaoIMC = pessoa.getClassificacaoIMC();
		pesoUsual = pessoa.getAnamnese().getPesoUsual();
		altura = pessoa.getAnamnese().getAltura();
		cintura = pessoa.getAnamnese().getCintura();
		quadril = pessoa.getAnamnese().getQuadril();
		sintomasGI = pessoa.getAnamnese().getSintomasGI();
		patologiaChave = pessoa.getAnamnese().getPatologiaChave();
		tomaMedicamentos = pessoa.getAnamnese().isTomaMedicamentos();
		medicacoesPorDia = pessoa.getAnamnese().getMedicacoesPorDia();
		atividadeFisica = pessoa.getAnamnese().getAtividadeFisica();

	}

	public void setPessoa(Pessoa pessoa)throws Exception {
		if(pessoa == null){
			throw new Exception("Pessoa Invalida.");
		}
		this.pessoa = pessoa;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setDiaDaConsulta(Calendar diaDaConsulta)throws Exception {
		if(diaDaConsulta == null){
			throw new Exception("Dia da consulta invalido.");
		}
		this.diaDaConsulta = diaDaConsulta;
	}

	public Calendar getDiaDaConsulta() {
		return diaDaConsulta;
	}

	public void setDiaDeRetorno(Calendar diaDeRetorno)throws Exception {
		if(diaDeRetorno.before(diaDaConsulta)){
			throw new Exception("data de retorno invalida.");
		}
		this.diaDeRetorno = diaDeRetorno;
	}

	public Calendar getDiaDeRetorno() {
		return diaDeRetorno;
	}
	

}
