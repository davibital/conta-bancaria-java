class ContaCorrente extends ContaBancaria {
  @Override
  public void consultarSaldo () {
    System.out.println("Seu saldo atual na conta corrente eh de R$" + this.saldo);
  }

  public void depositar(double valor) {
    this.saldo += valor;
    System.out.println("Deposito de R$" + valor + " feito na conta corrente.");
  }

  public void sacar (double valor) {
    if (valor <= this.saldo) {
      this.saldo -= valor;
      System.out.println("Saque de R$" + valor + " feito na conta corrente.");
    }
    else 
      System.out.println("Nao foi possível fazer o saque, valor indisponivel na conta.");
  }
}

class ContaPoupanca extends ContaBancaria { 
  @Override
  public void consultarSaldo () {
    System.out.println("Seu saldo atual na conta poupanca eh de R$" + this.saldo);
  }

  public void depositar(double valor) {
    this.saldo += valor;
    System.out.println("Deposito de R$" + valor + " feito na conta poupanca.");
  }

  public void sacar (double valor) {
    if (valor <= this.saldo) {
      this.saldo -= valor;
      System.out.println("Saque de R$" + valor + " feito na conta poupanca.");
    }
    else 
      System.out.println("Nao foi possível fazer o saque, valor indisponivel na conta.");
  }
}

class ContaInvestimento extends ContaBancaria {
  @Override
  public void consultarSaldo () {
    System.out.println("Seu saldo atual na conta investimento eh de R$" + this.saldo);
  }

  public void depositar(double valor) {
    this.saldo += valor;
    System.out.println("Deposito de R$" + valor + " feito na conta investimento.");
  }

  public void sacar (double valor) {
    if (valor <= this.saldo) {
      this.saldo -= valor;
      System.out.println("Saque de R$" + valor + " feito na conta investimento.");
    }
    else 
      System.out.println("Nao foi possível fazer o saque, valor indisponivel na conta.");
  }

  public void fazerInvestimento (double valor, int meses) {
    double rendimento;
    this.saldo -= valor;
    if (meses > 12) {
      System.out.println("[ERRO] O limite maximo de meses para o investimento eh de 12 meses.");
      return;
    } 
    else if (meses <= 3) {
      rendimento = 0.025 * meses;
    }
    else if (meses <= 6) {
      rendimento = 0.0275 * meses;
    }
    else {
      rendimento = 0.03 * meses;
    }
    String rendimentoFormatado = String.format("%.2f", (rendimento * 100));
    System.out.println("O rendimento da conta em " + meses + " meses eh de " + rendimentoFormatado + "%.");
    System.out.println("Seu saldo após " + meses + " meses sera de R$" + (this.saldo + valor * (1 + rendimento)));
  }
}

class ContaSalario extends ContaBancaria {
  @Override
  public void consultarSaldo () {
    System.out.println("Seu saldo atual na conta salario eh de R$" + this.saldo);
  }

  public void depositar(double valor) {
    this.saldo += valor;
    System.out.println("Deposito de R$" + valor + " feito na conta salario.");
  }

  public void sacar (double valor) {
    if (valor <= this.saldo) {
      this.saldo -= valor;
      System.out.println("Saque de R$" + valor + " feito na conta salario.");
    }
    else 
      System.out.println("Nao foi possível fazer o saque, valor indisponivel na conta.");
  }
}
