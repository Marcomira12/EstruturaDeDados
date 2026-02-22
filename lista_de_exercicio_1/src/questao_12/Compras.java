package questao_12;

public class Compras implements IDados{
	private double data_compra;
	private int codigo_compra;
	private double valor_total;
	private String nome_cliente;
	
	
	public Compras(double data_compra, int codigo_compra, double valor_total, String nome_cliente) {
		
		this.data_compra = data_compra;
		this.codigo_compra = codigo_compra;
		this.valor_total = valor_total;
		this.nome_cliente = nome_cliente;
	}


	public double getData_compra() {
		return data_compra;
	}


	public void setData_compra(double data_compra) {
		this.data_compra = data_compra;
	}


	public int getCodigo_compra() {
		return codigo_compra;
	}


	public void setCodigo_compra(int codigo_compra) {
		this.codigo_compra = codigo_compra;
	}


	public double getValor_total() {
		return valor_total;
	}


	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}


	public String getNome_cliente() {
		return nome_cliente;
	}


	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}


	@Override
	public boolean adicionar() {
		// TODO Auto-generated method stub
		return false;
	}

}
