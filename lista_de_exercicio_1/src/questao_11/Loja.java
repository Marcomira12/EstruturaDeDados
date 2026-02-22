package questao_11;

public class Loja implements IEstoque{
	private String nome_produto;
	private int codigo_produto;
	private int quantidade;
	private double valor_produto;
	
	
	public Loja(String nome_produto, int codigo_produto, int quantidade, double valor_produto) {
		
		this.nome_produto = nome_produto;
		this.codigo_produto = codigo_produto;
		this.quantidade = quantidade;
		this.valor_produto = valor_produto;
	}
	public String getNome_produto() {
		return nome_produto;
	}
	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}
	public int getCodigo_produto() {
		return codigo_produto;
	}
	public void setCodigo_produto(int codigo_produto) {
		this.codigo_produto = codigo_produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor_produto() {
		return valor_produto;
	}
	public void setValor_produto(double valor_produto) {
		this.valor_produto = valor_produto;
	}
	@Override
	public boolean adicionar() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean remover() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean alterar() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
