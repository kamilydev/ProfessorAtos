
public class MainDisciplina {

	public static void main(String[] args) {
		Professor professor = new Professor();
		professor.nome = "Lucas Schlestein";
		
		Laboratorio laboratorio = new Laboratorio();
		laboratorio.local = "Sala 2";
		
		System.out.println("O nome do professor é: "+ professor.nome);
		System.out.println("O local da aula é: " + laboratorio.local);

	}

}
