/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author vpalacios1
 */
public class alumnoDto {
    private int idalumno;
    private String nombres;
    private String dni;
    private String edad;
    private String facultad;
    private String escuela;
    private String CodAlumno;
    private String sexo;

    public alumnoDto() {
        
    }

    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getCodAlumno() {
        return CodAlumno;
    }

    public void setCodAlumno(String CodAlumno) {
        this.CodAlumno = CodAlumno;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public alumnoDto(int idalumno, String nombres, String dni, String edad, String facultad, String escuela, String CodAlumno, String sexo) {
        this.idalumno = idalumno;
        this.nombres = nombres;
        this.dni = dni;
        this.edad = edad;
        this.facultad = facultad;
        this.escuela = escuela;
        this.CodAlumno = CodAlumno;
        this.sexo = sexo;
    }
}
