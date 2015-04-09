/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module.Consecionarios;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *Clase encargada deconectarse con la tabla consesionarios de la base de datos
 * @author Administrador
 */
@Entity
@Table(name = "consecionarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Consecionarios.findAll", query = "SELECT c FROM Consecionarios c"),
    @NamedQuery(name = "Consecionarios.findById", query = "SELECT c FROM Consecionarios c WHERE c.id = :id"),
    @NamedQuery(name = "Consecionarios.findByDirrecion", query = "SELECT c FROM Consecionarios c WHERE c.dirrecion = :dirrecion"),
    @NamedQuery(name = "Consecionarios.findByNombre", query = "SELECT c FROM Consecionarios c WHERE c.nombre = :nombre")})
public class Consecionarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "dirrecion")
    private Character dirrecion;
    @Column(name = "nombre")
    private String nombre;

    public Consecionarios() {
    }

    public Consecionarios(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Character getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(Character dirrecion) {
        this.dirrecion = dirrecion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        if (!(object instanceof Consecionarios)) {
            return false;
        }
        Consecionarios other = (Consecionarios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "module.autopartes.Consecionarios[ id=" + id + " ]";
    }
    
}
