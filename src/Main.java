import java.time.LocalDate;
import  br.com.dio.desafio.dominio.Curso;
import  br.com.dio.desafio.dominio.Mentoria;
import  br.com.dio.desafio.dominio.Conteudo;
import  br.com.dio.desafio.dominio.Bootcamp;
import  br.com.dio.desafio.dominio.Dev;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descricao Curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descricao Curso JS");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descricao Mentoria Java");
		mentoria.setData(LocalDate.now());
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		
		Dev devPedro = new Dev();
		devPedro.setNome("Pedro");
		devPedro.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos" + devPedro.getConteudosInscritos());
		devPedro.progredir();
		devPedro.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos" + devPedro.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + devPedro.getConteudosConcluidos());
		System.out.println("XP:" + devPedro.calcularXp());
		
		System.out.println("-----------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + devJoao.getConteudosConcluidos());
		System.out.println("XP:" + devJoao.calcularXp());
	}

}
