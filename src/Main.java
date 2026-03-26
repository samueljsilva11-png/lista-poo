public class Main {
    public static void main(String[] args) {

        carro carro1 = new carro();
        carro carro2 = new carro();

        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2020;

        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2018;


        System.out.println("Carro 1:");
        carro1.exibir();

        System.out.println("\nCarro 2:");
        carro2.exibir();

        System.out.println("\nIdade do carro 1: " + carro1.idadeDoCarro());
        System.out.println("Idade do carro 2: " + carro2.idadeDoCarro());

    }
}