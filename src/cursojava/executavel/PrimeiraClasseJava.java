package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Agora temos o objeto real na memória */


		Aluno aluno2 = new Aluno();
		
		aluno2.setNome("Wyltamar");
		aluno2.setIdade(37);
		aluno2.setNomeMae("Maria do Socorro");
		aluno2.setNota1(80.0);
		aluno2.setNota2(90.0);
		aluno2.setNota3(100.0);
		aluno2.setNota4(80.0);
		
		System.out.println("O nome do aluno é:  " + aluno2.getNome());
		System.out.println("A idade do auno é: " + aluno2.getIdade());
		System.out.println("O nome da mãe é: "+aluno2.getNomeMae());
		System.out.println("Nota 1 = "+aluno2.getNota1());
		System.out.println("Nota 2 = "+aluno2.getNota2());
		System.out.println("Nota 3 = "+aluno2.getNota3());
		System.out.println("Nota 4 = "+aluno2.getNota4());
		System.out.println("================================================");
		System.out.println("Média final do aluno = "+aluno2.getMediaNota());
		System.out.println("Resultado = "+(aluno2.getAprovado()? "Aprovado" : "Reprovado"));
		

	}

}
