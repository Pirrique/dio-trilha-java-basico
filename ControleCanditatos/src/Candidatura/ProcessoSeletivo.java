package Candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Analisando Candidatos...");
		System.out.println("------------------------");
		analisarCandidato(3000);
		analisarCandidato(2000);
		analisarCandidato(2100);
		System.out.println("__________________________");
		
		selecionarCandidatos();
		
		imprimirCandidatosConcorrentes();
		
		imprimirTodosCandidatos();
		
		String candidatosParaLigar[] = {"PAULO" , "JOSE" , "MARIA"};
		for (String candidato: candidatosParaLigar) {
			ligar(candidato);
		}
		
	}
	
	//case1 selecionar candidatos pelo salarioPretendido
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("Convocar candidato.");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("Fazer contraproposta ao candidato.");
		} else {
			System.out.println("Aguardar resultado de todos candidatos.");
		}
	}
	
	//case2 selecionando candidatos de formas diferentes
	
	static double valorEstipulado() {
		return ThreadLocalRandom.current().nextDouble(1800 , 2200);
		//gerando aleatoriamente o salario - entre 1800 e 2000 - pretendido pelo candidato.
	}
	
	static void selecionarCandidatos() {
		String candidatos[] = {"JESSICA" , "HENRIQUE" , "HELOISA" , "ROMILDA" , "ANTONIO" , "MARCIA" , "BRUNA"};
		int candidatosSelecionados = 0;
		int candidatoPosicaoAtual = 0;
		double salarioIdealBase = 2000;
		//enquanto menor que 5, porem, ter percorrido o array em seu tamanho total (lenght)
		while (candidatosSelecionados < 5 && candidatoPosicaoAtual < candidatos.length) {
			String candidato = candidatos[candidatoPosicaoAtual];
			double salarioPretendido = valorEstipulado(); //gerado aleatoriamente
			
			System.out.println("O candidato " + candidato + " deseja receber " + salarioPretendido );
			if (salarioPretendido < salarioIdealBase) {
				candidatosSelecionados++;
				System.out.println("Candidato Selecionado.");
			} else {
				System.out.println("Candidato não selecionado.");
			}
			candidatoPosicaoAtual++; //para garantir que o array vai percorrer novamente.
		}
		System.out.println("-----------------------------------------");
	}
	
	//case3 imprimindo de formas diferentes
	
	//imprimindo candidatos pelo for de iteraçao
	static void imprimirCandidatosConcorrentes() {
		String candidatosConcorrentes[] = {"MARIA" , "JOANA" , "CELMA" , "TANIA"};
		System.out.println("Os candidatos concorrentes são:");
		for (int indice = 0; indice < candidatosConcorrentes.length; indice++) {
			System.out.println("Indice " + (indice + 1) + " " + candidatosConcorrentes[indice]);
		}
		System.out.println("--------------------------------------");
	}			
			
	//imprimindo o mesmo de forma abreviada con foreach
	static void imprimirTodosCandidatos() {
		String todosCandidatos[] = {"ANA" , "CARLA" , "JULIANA" , "SANDRA"};
		System.out.println("A lista de todos os candidatos é:");
		for (String	candidatoPosicao: todosCandidatos) {
			System.out.println(candidatoPosicao);
		}
		System.out.println("________________________________________");
	}				

	//case4 ligando para cada candidato, com 3 tentativas. Retornar de foi realizado o contato ou nao.
	
	//metodo para ligar ao candidato seleciondado
	static void ligar(String candidato) {
		int tentativas = 1;
		boolean continuar = true;
		boolean atendido = false;
		do {
			atendido = atender();
			continuar = !atendido; //continuar recebe o valor contrario da variavel atendido
			if (continuar) {
				System.out.println("TENTATIVA " + tentativas + " NÃO ATENDIDA.");				
				tentativas++;
			} else {
				System.out.println("TENTATIVA " + tentativas + " CONTATO COM "+ candidato + " " + "REALIZADO.");
			}
		} while (continuar && tentativas <= 3);
		System.out.println("-----------------------------------");
		if (atendido) {
			System.out.println("Conseguimos contato com " + candidato + " na tentativa " + tentativas);
		} else {
			System.out.println("Não conseguimos contato com " + candidato + " em " + (tentativas - 1) + " tentativas.");
		}
		System.out.println("_______________________________________");
	}
	
	//se tentativa entre 1 e 3 for igual a 1 significa que o candidato antendeu. O Contrario ele tenta outra vez
	static boolean atender() {
		return new Random().nextInt(3) == 1;
	}	
	
}
