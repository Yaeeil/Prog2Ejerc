package Prog2Tp23;

    public class Pais {
        String NombrePais;
        Prov[] provincias;

        public Pais(String NombrePais, int cant) {
            this.NombrePais = NombrePais;
            provincias = new Prov[cant];
        }

        public static void main(String[] args) {
            Pais miPais = new Pais("MiPais", 2);

            for (int i = 0; i < miPais.provincias.length; i++) {
                Prov provincia = new Prov(3, "Provincia " + (i + 1));
                for (int j = 0; j < provincia.getCiudades().length; j++) {
                    Ciudad ciudad = new Ciudad(150000, 20000, 25000, 30000, 15000, 10000, 11000);
                    provincia.getCiudades()[j] = ciudad;
                }
                miPais.provincias[i] = provincia;
                provincia.tenerCiudadEnCuenta();
                System.out.println("Provincia: " + provincia.getNombreProv() +
                                   ", Más de la mitad con déficit: " + provincia.masDeLaMitad());
                
                // Mostrar el déficit de cada ciudad en la provincia
                for (Ciudad ciudad : provincia.getCiudades()) {
                    System.out.println("Ciudad: Déficit = " + ciudad.deficit());
                }
            
        }

    }
    }

    

