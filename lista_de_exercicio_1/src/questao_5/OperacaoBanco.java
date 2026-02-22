package questao_5;

public class OperacaoBanco implements IBanco {
	private double saldo;

	public OperacaoBanco(double saldoInicial) {
		if (saldoInicial < 0) {
			System.out.println("Saldo negativo");

			this.saldo = 0;
		} else {
			this.saldo = saldoInicial;
		}
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	@Override
	public boolean depositar(double dinheiro) {
		if (dinheiro <= 0) {
			System.out.println("Não é possivel depositar");
			return false;
		} else {
			saldo += dinheiro;
			System.out.println("dinheiro depositado");
			return true;
		}
	}

	@Override
	public boolean sacar(double dinheiro) {
		if (dinheiro <= 0 || dinheiro > saldo) {
			System.out.println("não é possivel realizar esta operacao");
			return false;
		} else {
			saldo -= dinheiro;
			return true;
		}

	}

	@Override
	public void atualizar(double taxaPercentual) {
		saldo += saldo * (taxaPercentual / 100.0);

	}

	
	
	

	

	

}
