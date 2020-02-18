package klasywewnetrzne;

public class Main {
    public static void main(String[] args) {
        KontoBankowe kontoBankowe = new KontoBankowe(1000);
        kontoBankowe.start(5);
    }
}

class KontoBankowe {
    public KontoBankowe(double stanKonta) {
        this.stanKonta = stanKonta;
    }

    private double stanKonta;

    double getStanKonta() {
        return this.stanKonta;
    }

    void start(double stopa) {
        Odsetki odsetki = new Odsetki(stopa);
        odsetki.zmienStanKonta(stopa);
    }

    class Odsetki {
        private double stopaProcentowa;

        public Odsetki(double stopaProcentowa) {
            this.stopaProcentowa = stopaProcentowa;
            this.zmienStanKonta(stopaProcentowa);
        }

        void zmienStanKonta(double stopa) {
            double odsetki = (stanKonta * stopa) / 100;
            stanKonta += odsetki;
        }
    }
}
