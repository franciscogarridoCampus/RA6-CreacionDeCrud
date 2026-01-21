/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.resultados to edit this template
 */
package resultados;

/**
 *
 * @author DAW2
 */
public class resultados {
    // atributos privados
    private int id;
    private int idAsignatura; // FK a la asignatura
    private String descripcion;

    // Constructor vacío
    public resultados() {}

    // Constructor con parámetros
    public resultados(int id, int idAsignatura, String descripcion) {
        this.id = id;
        this.idAsignatura = idAsignatura;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
