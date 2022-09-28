public class Main {

    public static void main(String[] args) {
    int param1 = 2;
    int param2 = 4;
    int param3 = 6;
    var valor = suma(param1, param2, param3);
       System.out.println(valor);
    }

     public static int suma( int a, int b, int c) {
     return a + b + c;
     }

}


class Coche {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.SumaPuertas();
        System.out.println(miCoche.puertas);
    }

    public int puertas = 5;
    public void SumaPuertas() {
        this.puertas++;

    }

}