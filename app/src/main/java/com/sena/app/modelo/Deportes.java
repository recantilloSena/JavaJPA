/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sena.app.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author RICARDO
 */
@Entity
@Table(name = "deportes")
@NamedQueries({
    @NamedQuery(name = "Deportes.findAll", query = "SELECT d FROM Deportes d"),
    @NamedQuery(name = "Deportes.findById", query = "SELECT d FROM Deportes d WHERE d.id = :id"),
    @NamedQuery(name = "Deportes.findByNombreDeporte", query = "SELECT d FROM Deportes d WHERE d.nombreDeporte = :nombreDeporte")})
public class Deportes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nombre_deporte")
    private String nombreDeporte;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDeporte")
    private List<Personas> personasList;

    public Deportes() {
    }

    public Deportes(Integer id) {
        this.id = id;
    }

    public Deportes(Integer id, String nombreDeporte) {
        this.id = id;
        this.nombreDeporte = nombreDeporte;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    public List<Personas> getPersonasList() {
        return personasList;
    }

    public void setPersonasList(List<Personas> personasList) {
        this.personasList = personasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Deportes)) {
            return false;
        }
        Deportes other = (Deportes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sena.app.modelo.Deportes[ id=" + id + " ]";
    }
    
}
