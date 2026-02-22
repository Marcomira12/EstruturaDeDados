package questao_9;

public class Restaurante implements ICozinha{
	private String nome_cliente;
	private int codigo_pedido;
	private int quantidade;
	private double valor;
	
	
	
	public Restaurante(String nome_cliente, int codigo_pedido, int quantidade, double valor) {
		this.nome_cliente = nome_cliente;
		this.codigo_pedido = codigo_pedido;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	public String getNome_cliente() {
		return nome_cliente;
	}
	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	public int getCodigo_pedido() {
		return codigo_pedido;
	}
	public void setCodigo_pedido(int codigo_pedido) {
		this.codigo_pedido = codigo_pedido;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
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
