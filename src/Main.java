import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<carro> lista = new ArrayList<>();

        carro c1 = new carro();
        c1.marca = "Toyota";
        c1.modelo = "Corolla";
        c1.ano = 2020;

        carro c2 = new carro();
        c2.marca = "Honda";
        c2.modelo = "Civic";
        c2.ano = 2018;

        carro c3 = new carro();
        c3.marca = "Fiat";
        c3.modelo = "Uno";
        c3.ano = 2015;

        lista.add(c1);
        lista.add(c2);
        lista.add(c3);

        for (carro c : lista) {
            c.exibir();
            System.out.println();
        }
    }
}