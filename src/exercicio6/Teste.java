package exercicio6;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Teste {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Professor professor = new Professor();
		
		professor.setNome("Gilmar");
		professor.setDataNascimento(sdf.parse("25/05/1985"));
		professor.setMateria("Matemática");
		professor.setPeriodo('m');
		
		professor.mostraDados();
		
		Aluno aluno = new Aluno();
		
		aluno.setDataNascimento(sdf.parse("10/12/2001"));
		aluno.setNome("José");
		aluno.setPeriodo('m');
		aluno.setSerie("8");
		aluno.setTurma("AB");
		
		aluno.mostraDados();
		
	}
}
