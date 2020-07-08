package com.mycompany.estudainte;

/**
 *
 * @author Dimas
 */
public class DOCTOR {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Junior");
        persona.setApellido("Guzman");
        persona.setEdad(28);
        persona.setSexo("Masculino");
        persona.setRecidencia("Hospital leonardo martinez ");

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Sexo: " + persona.getSexo());
        System.out.println("Lugardetrabajo: " + persona.SetRecidencia());

    }

    public static class Persona {

        private String nombre;
        private String apellido;
        private int edad;
        private String sexo;
        private String Lugardetrabajo;

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public int getEdad() {
            return edad;
        }

        public String getSexo() {
            return sexo;
        }

        public String SetRecidencia() {
            return Lugardetrabajo;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        public void SetRecidencia(String recidencia) {
            this.Lugardetrabajo = recidencia;
        }

        private void setRecidencia(String lugardetrabajo) {
            this.Lugardetrabajo = lugardetrabajo;

        }

    }

}
