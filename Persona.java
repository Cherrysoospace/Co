package poo.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String identificacion;
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private char sexo;
    private String correo;

    public Persona(String identificacion, String nombreCompleto, int year, int month, int day, char sexo,
            String correo) {
        setIdentificacion(identificacion);
        setNombreCompleto(nombreCompleto);
        setFechaNacimiento(year, month, day);
        setSexo(sexo);
        setCorreo(correo);
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        if (identificacion == null || identificacion.isBlank() || identificacion.length() < 5) {
            throw new IllegalArgumentException("La identificacion debe tener al menos 5 caracteres.");
        }
        this.identificacion = identificacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        if (nombreCompleto == null || nombreCompleto.isBlank()) {
            throw new IllegalArgumentException("El nombre debe tener al menos un caracter.");
        }
        this.nombreCompleto = nombreCompleto;
    }

    public void setFechaNacimiento(int year, int month, int day) {
        if (year < 0 || month < 1 || month > 12 || day < 1 || day > 31) {
            throw new IllegalArgumentException("Fecha de nacimiento inválida. Verifica el año, mes y día.");
        }
        this.fechaNacimiento = LocalDate.of(year, month, day);
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdadEstimada() {
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNacimiento, fechaActual).getYears();
    }

    public char getSexo() {
        sexo = Character.toUpperCase(sexo);
        return sexo;
    }

    public void setSexo(char sexo) {
        if ((sexo != 'M' && sexo != 'F')) {
            throw new IllegalArgumentException("El dato solo puede ser 'M' o 'F'");
        }
        this.sexo = sexo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo == null || correo.isBlank() || !correo.contains("@")) {
            throw new IllegalArgumentException("El correo debe tener al menos un caracter, un @ y un .com.");
        }
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Identificación: " + identificacion +
                "\nNombre Completo: " + nombreCompleto +
                "\nFecha de Nacimiento: " + fechaNacimiento +
                "\nEdad Estimada: " + getEdadEstimada() +
                "\nSexo: " + sexo +
                "\nCorreo: " + correo;
    }
}
