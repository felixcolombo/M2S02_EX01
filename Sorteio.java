package M2S02_EX01;

import java.util.Random;

public class Sorteio {

    void sortearNumero() {

        Random gerador = new Random();

        for (int i = 0; i < 1; i++) {
            int numSorteado = gerador.nextInt(2);
            System.out.println("Número sorteado foi: " + numSorteado);
        }
    }

}
