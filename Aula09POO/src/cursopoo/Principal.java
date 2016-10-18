package cursopoo;

public class Principal {

	static Livro l1,l2,l3,l4;
	static Pessoa p1,p2,p3,p4;
	
	public static void main(String[] args) {
		
         p1 = new Pessoa("Camila", 22, 'F');
         p2 = new Pessoa("Mayara", 26, 'F');
         p3 = new Pessoa("Bjorn", 29, 'M');
         p4 = new Pessoa("Pedro", 29, 'M');
         
		 l1 = new Livro("Java Como Programar", "Paul Deitel", 1176, p1);
         l2 = new Livro("Use a Cabeça Java", "Kathy Sierra", 470, p2);
         l3 = new Livro("Java Como Programar", "Paul Deitel", 1176, p3);
         l4 = new Livro("Guia do Administrador do Sistema Linux", "Rubem Ferreira", 720, p4);
         
         l1.abrir();
         l2.abrir();
         l3.abrir();
         l4.abrir();
         l1.folhear(130);
         l2.folhear(100);
         l3.folhear(370);
         l4.folhear(180);
         
         System.out.println(l1.detalhes());
         System.out.println(l2.detalhes());
         System.out.println(l3.detalhes());
         System.out.println(l4.detalhes());
	}

}
