package JNutriClinica;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

import data.DataBase;

public class Sistema {
	
	public ArrayList<Pessoa> users = new ArrayList<Pessoa>();
	DataBase bd = DataBase.getInstance();
	
	public void criaPaciente(String nome, int idade, String cpf, String endereco,
			Calendar dataDeNascimento, String telefone, Anamnese anamnese, String genero) throws IOException{
		
		if(genero == "masc"){
		}
		bd.atualizaBD(users);
	}
	
	public void buscaPaciente(Pessoa pessoa) throws IOException{
		
		bd.atualizaBD(users);
	}
	
	public void updatePaciente(Pessoa pessoa) throws IOException{
		
		bd.atualizaBD(users);
	}
	
	public void deletaPaciente(Pessoa pessoa) throws IOException{
		
		bd.atualizaBD(users);
	}
	
	public void consultar(Pessoa pessoa){
		
	}
	
}
