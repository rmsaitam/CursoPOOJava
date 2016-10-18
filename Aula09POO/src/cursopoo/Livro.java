package cursopoo;

public class Livro implements IPublicacao {
	
	private String titulo;
	private String autor;
	private int totalPag;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	
	
	public Livro(String titulo, String autor, int totalPag, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalPag = totalPag;
		this.leitor = leitor;
		this.pagAtual = 0;
		this.aberto = false;
	}

	public String detalhes() {
		return leitor.getNome() + " de " +leitor.getIdade()  +" anos, sexo=" +leitor.getSexo() +", esta lendo o Livro [titulo=" + this.titulo + ", autor=" + this.autor + ", totalPag=" + this.totalPag + ", pagAtual=" + this.pagAtual
				+ ", aberto=" + this.aberto + "]";
	}

	@Override
	public void abrir() {
		this.aberto = true;
		
	}

	@Override
	public void fechar() {
		this.aberto = false;
	}

	@Override
	public void folhear(int pag) {
		if(pag > this.totalPag)
			this.pagAtual = 0;
		else
			this.pagAtual = pag;
	}

	@Override
	public void avancarPag() {
		this.pagAtual++;
	}

	@Override
	public void voltarPag() {
		this.pagAtual--;
	}
	
}
