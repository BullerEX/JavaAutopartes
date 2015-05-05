/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module.Autos;

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
 * Clase encargada de la conexion con la tabla Autos de la abse de datos
 * @author Administrador
 */
@Entity
@Table(name = "Autos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Autos.findAll", query = "SELECT a FROM Autos a"),
    @NamedQuery(name = "Autos.findById", query = "SELECT a FROM Autos a WHERE a.id = :id"),
    @NamedQuery(name = "Autos.findByModelo", query = "SELECT a FROM Autos a WHERE a.modelo = :modelo"),
    @NamedQuery(name = "Autos.findByPrecio", query = "SELECT a FROM Autos a WHERE a.precio = :precio")})
public class Autos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "modelo")
    private Character modelo;
    @Column(name = "precio")
    private Integer precio;

    public Autos() {
    }

    public Autos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Character getModelo() {
        return modelo;
    }

    public void setModelo(Character modelo) {
        this.modelo = modelo;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
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
        if (!(object instanceof Autos)) {
            return false;
        }
        Autos other = (Autos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "module.autopartes.Autos[ id=" + id + " ]";
    }
    
}
