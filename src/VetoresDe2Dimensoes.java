public class VetoresDe2Dimensoes {
    public static void main(String[] args) {
        Double faturamentoDia = 1000.0;

        Double[] faturamentoJaneiro = new Double[]{1500.0, 2000.0, 1700.0};
        Double[] faturamentoFevereiro = new Double[]{1200.0, 3000.0, 1800.0};



        Double[][] faturamentoAnual = new Double[][]{faturamentoJaneiro, faturamentoFevereiro};

        System.out.println("Faturamento do dia 1º de J  aneiro: " + faturamentoAnual[1][2]);


        for(int i = 0; i < faturamentoAnual.length; i++){
            System.out.println("Mês: " + (i + 1));

            Double[] mes = faturamentoAnual[i];

            for(int y = 0; y < mes.length; i++) {
                Double dia = mes[y];
                System.out.println("Dia " + y + ": " + faturamentoDia);
            }


        }

    }
}
