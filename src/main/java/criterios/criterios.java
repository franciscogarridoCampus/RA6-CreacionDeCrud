/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package criterios;

/**
 *
 * @author DAW2
 */
public class criterios {
    // atributos privados
    private int id;
    private int idResultado; // FK a resultado de aprendizaje
    private String descripcion;

    // Constructor vacío
    public criterios() {}

    // Constructor con parámetros
    public criterios(int id, int idResultado, String descripcion) {
        this.id = id;
        this.idResultado = idResultado;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(int idResultado) {
        this.idResultado = idResultado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
