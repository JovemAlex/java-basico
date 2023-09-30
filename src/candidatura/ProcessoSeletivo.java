package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    selecaoCandidatos();
  }

  static void selecaoCandidatos() {
    String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "PEDRO", "ALEX"};

    for(String candidato : candidatos) {
      double salarioPretendido = valorPretendido();
      analisarCandidato(salarioPretendido, candidato);
    }
  }

  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }

  static void analisarCandidato(double salarioPretendido, String candidato) {
    double salarioBase = 2000.0;
    if(salarioBase > salarioPretendido) {
      System.out.println("Ligar para o candidato: " + candidato);
    } else if(salarioBase < salarioPretendido) {
      System.out.println("Ligando para o candidato: " + candidato + " com contra proposta");
    } else {
      System.out.println("Aguardando Resultado dos demais candidatos");
    }
  }
}
