public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = false;
        double notaDofilme = 8.1;
        String tipoDoPlano= "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("lancamento que os clientes estao curtino");
        }else{
            System.out.println("filme retro que vale a pena assitir");
        }

        if (incluidoNoPlano == true || tipoDoPlano.equals("plus")) {
            System.out.println("filme liberado");
        }else {
            System.out.println("dever pagar a locacao");
        }


    }
}
