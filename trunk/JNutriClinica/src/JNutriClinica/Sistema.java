package JNutriClinica;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

import JNutriClinica.Anamnese.atividadeFisica;
import JNutriClinica.Anamnese.patologiaChave;

import data.DataBase;

/**
 * Classe que gerencia as acoes do Sistema.
 * 
 * @author Antonio Ricardo
 * 
 * @version 1.0
 * 
 */

public class Sistema {
	
	public ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	DataBase bd = DataBase.getInstance();
	
	public void criaPaciente(String nome, int idade, String cpf, String endereco,
			Calendar dataDeNascimento, String telefone, Anamnese anamnese, String genero) throws Exception{
		if(genero == "masculino"){
			Homem paciente = new Homem(nome,idade,cpf,endereco,dataDeNascimento,telefone);
		}else if(genero == "feminino"){
			Mulher paciente = new Mulher(nome,idade,cpf,endereco,dataDeNascimento,telefone);
		}
	}
	
	public Pessoa buscaPaciente(String cpf) throws IOException{
		for(Pessoa pessoa : pessoas){
			if(pessoa.getCpf() == cpf){
				return pessoa;
			}
		}
		bd.atualizaBD(pessoas);
		return null;
	}
	
	public void updatePaciente(Pessoa pessoa,String nome, int idade, String cpf, String endereco,
			Calendar dataDeNascimento, String telefone, Anamnese anamnese) throws Exception{
			pessoa.setAnamnese(anamnese);
			pessoa.setCpf(cpf);
			pessoa.setDataDeNascimento(dataDeNascimento);
			pessoa.setEndereco(endereco);
			pessoa.setIdade(idade);
			pessoa.setNome(nome);
			pessoa.setTelefone(telefone);
		bd.atualizaBD(pessoas);
	}
	
	public void deletaPaciente(Pessoa pessoa) throws Exception{
		for(Pessoa p : pessoas){
			if(p.equals(pessoa)){
				pessoas.remove(pessoa);
			}
			throw new Exception("Pessoa nao cadastrada.");
		}
		bd.atualizaBD(pessoas);
	}
	
	public void consultar(Pessoa pessoa,double pesoUsual,double altura, boolean perdeuPeso,
			double cintura, double quadril, String sintomasGI,
			patologiaChave patologiaChave, boolean tomaMedicamentos,
			int medicacoesPorDia, atividadeFisica atividadeFisica) throws Exception{
		
		Anamnese anamnese = new Anamnese(pesoUsual, altura, perdeuPeso, cintura,quadril,sintomasGI,
			patologiaChave,tomaMedicamentos,
			medicacoesPorDia, atividadeFisica);
		
		pessoa.setAnamnese(anamnese);
		
	}
	
}
