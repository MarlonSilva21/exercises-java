package application;

public class exercise {
    public static void main(String[] args) {

        int[] meses31 = {1, 3, 4,5 ,5 ,8 ,10, 12};
        int[] meses30 = {4, 6, 9 ,11};
        int numeroDias = 0;
        int index = 0;

        int mesInformado = 9, diaInformado = 7;

        do {
            if (mesInformado == meses31[index]) {
                numeroDias = 31 * (mesInformado - 1) + diaInformado;
            }
            index = index + 1;
        }
        while(index < 7);
        index = 0;

        do {
            if (mesInformado == meses30[index]) {
                numeroDias = 30 * (mesInformado - 1) + diaInformado;
            }
            index = index + 1;
        }
        while(index < 4);

        if(mesInformado > 2){
            numeroDias += 1;
        }
        else if(mesInformado == 2){
            numeroDias = 31 + diaInformado;

        }

        System.out.println(numeroDias);
    }
}
