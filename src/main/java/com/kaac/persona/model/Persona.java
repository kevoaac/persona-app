package com.kaac.persona.model;

import jakarta.persistence.*;

@Entity //Persistencia
@Table(name = "persona") //Persistencia
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // opcional para generar id's automaticamnete 1,2,3...
    private Long id;
    private String nombre;
    private String apellido;
    private Integer edad;
    @ManyToOne // Una persona tiene asociado un solo pais, pero Pais tiene varias personas
    @JoinColumn(name = "pais_id") // Atributo que usamos para identificar a este Pais cuando se asocie a esta persona.
    private Pais pais;
    @ManyToOne
    @JoinColumn(name = "estado_id")
    private Estado estado;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Pais pais, Estado estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pais = pais;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", pais=").append(pais);
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }
}
