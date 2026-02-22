package questao_5;

public interface IBanco {
	double getSaldo();                  // visualizar saldo
    boolean depositar(double valor);    // depositar
    boolean sacar(double valor);        // sacar
    void atualizar(double taxaPercentual); // atualizar (ex.: aplicar juros/ajuste)
}

