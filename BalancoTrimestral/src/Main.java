
class BalancoTrimestral {
    public static void main(String[] args) {
            int gastosJaneiro = 15000;
            int gastosFevereiro = 23000;
            int gastosMarco = 17000;
            int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

            System.out.println(gastosTrimestre);

            int mediaMensal = (gastosJaneiro + gastosFevereiro + gastosMarco)/3;

            System.out.println("O valor da média mensal é = "+mediaMensal);

        }
    }
