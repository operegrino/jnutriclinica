package JNutriClinica;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

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
	
	public void criaPessoa(String nome, int idade, String cpf, String endereco,
			Calendar dataDeNascimento, String telefone, Anamnese anamnese, String genero) throws Exception{
	
		if(genero == "masculino"){
			Homem pessoa = new Homem(nome,idade,cpf,endereco,dataDeNascimento,telefone);
			pessoas.add(pessoa);
			bd.atualizaBD(pessoas);
		}else if(genero == "feminino"){
			Mulher pessoa = new Mulher(nome,idade,cpf,endereco,dataDeNascimento,telefone);
			pessoas.add(pessoa);
			bd.atualizaBD(pessoas);
		}
		
	}
	
	public Pessoa buscaPessoa(String cpf) throws IOException{
		for(Pessoa pessoa : pessoas){
			if(pessoa.getCpf() == cpf){
				return pessoa;
			}
		}
		bd.atualizaBD(pessoas);
		return null;
	}
	
	public void updatePessoa(Pessoa pessoa,String nome, int idade, String cpf, String endereco,
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
	
	public void deletaPessoa(Pessoa pessoa) throws Exception{
		for(Pessoa p : pessoas){
			if(p.equals(pessoa)){
				pessoas.remove(pessoa);
			}
			throw new Exception("Pessoa nao cadastrada.");
		}
		bd.atualizaBD(pessoas);
	}
	
}
