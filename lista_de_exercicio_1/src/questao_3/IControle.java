package questao_3;

public interface IControle {
	boolean adicionar(int codigo_diciplina,String nome);
	boolean remover(int codigo_diciplina,String nome);
	boolean alterar(int codigo_diciplina,String nome);
}
