import entity.ContaCorrente;
import entity.ContaPoupanca;

public class App {

    public static void main(String... args){
        ContaCorrente cc = new ContaCorrente(111,111);
        cc.deposita(1000);

        ContaPoupanca cp = new ContaPoupanca(222,222);
        cp.deposita(2000);
        cp.transfere(50,cc);
        cc. transfere(10.0, cp);

        System.out.println("saldo Corrente: " + cc.getSaldo());

    }
}
