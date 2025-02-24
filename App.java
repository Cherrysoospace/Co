package poo;

import poo.model.ComposicionCorporal;
import poo.model.Persona;

public class App {
    public static void main(String[] args) {
        Persona e11  = new Persona("1111145789", "Juan Pérez", 1990, 5, 15, 'M', "juanperez@gmail.com");
        ComposicionCorporal e1 = new ComposicionCorporal(e11);
        e1.setFechaRegistro (2022, 02, 03);
        e1.setPeso(75.5);
        e1.setEstatura(175);
        double estaturaMetros = e1.conversionEstatura(e1.getEstatura());
        e1.setImc(e1.getPeso(), estaturaMetros);
        e1.setMasaMuscular(50.0);
        e1.setGrasaVisceral(6);
        e1.setGrasaCorporal(18.5);
        e1.setAguaCorporal(55.0);
        e1.setProteinas(18.0);
        e1.setMasaOsea(3.5);

        Persona e22 = new Persona("67890", "María López", 1995, 8, 25, 'F', "marialopez@gmail.com");
        ComposicionCorporal e2 = new ComposicionCorporal(e22);
        e2.setFechaRegistro(2022, 04, 11);
        e2.setPeso(60.0);
        e2.setEstatura(165);
        double estaturaMetros2 = e2.conversionEstatura(e2.getEstatura());
        e2.setImc(e2.getPeso(), estaturaMetros2);
        e2.setMasaMuscular(40.0);
        e2.setGrasaVisceral(5);
        e2.setGrasaCorporal(22.0);
        e2.setAguaCorporal(50.0);
        e2.setProteinas(17.0);
        e2.setMasaOsea(2.5);

        Persona e33 = new Persona("98765", "Carlos Ramírez", 1985, 3, 10, 'M', "ggt@gmail.com");
        ComposicionCorporal e3 = new ComposicionCorporal(e33);
        e3.setFechaRegistro(2022, 05, 21);
        e3.setPeso(95.0);
        e3.setEstatura(175);
        double estaturaMetros3 = e3.conversionEstatura(e3.getEstatura());
        e3.setImc(e3.getPeso(), estaturaMetros3);
        e3.setMasaMuscular(55.0);
        e3.setGrasaVisceral(12);
        e3.setGrasaCorporal(27.0);
        e3.setAguaCorporal(52.0);
        e3.setProteinas(16.5);
        e3.setMasaOsea(3.8);

        Persona e44 = new Persona("54321", "Laura Gómez", 2000, 6, 20, 'F', "homeworktt@ttp.co");
        ComposicionCorporal e4 = new ComposicionCorporal(e44);
        e4.setFechaRegistro(2022, 2, 3);
        e4.setPeso(55.0);
        e4.setEstatura(160);
        double estaturaMetros4 = e4.conversionEstatura(e4.getEstatura());
        e4.setImc(e4.getPeso(), estaturaMetros4);
        e4.setMasaMuscular(35.0);
        e4.setGrasaVisceral(4);
        e4.setGrasaCorporal(20.0);
        e4.setAguaCorporal(48.0);
        e4.setProteinas(14.5);
        e4.setMasaOsea(2.2);

        Persona e55 = new Persona("11223", "Fernando Díaz", 1992, 11, 5, 'M', "fernandodiaz@gmail.com");
        ComposicionCorporal e5 = new ComposicionCorporal(e55);
        e5.setFechaRegistro(2023, 3, 10);
        e5.setPeso(82.0);
        e5.setEstatura(178);
        double estaturaMetros5 = e5.conversionEstatura(e5.getEstatura());
        e5.setImc(e5.getPeso(), estaturaMetros5);
        e5.setMasaMuscular(52.0);
        e5.setGrasaVisceral(11);
        e5.setGrasaCorporal(20.5);
        e5.setAguaCorporal(54.0);
        e5.setProteinas(17.5);
        e5.setMasaOsea(3.6);

      
        System.out.println(e11);
        System.out.println(e1);
        System.out.println(e22);
        System.out.println(e2);
        System.out.println(e33);
        System.out.println(e3);
        System.out.println(e44);
        System.out.println(e4);
        System.out.println(e55);
        System.out.println(e5);
    }
}
