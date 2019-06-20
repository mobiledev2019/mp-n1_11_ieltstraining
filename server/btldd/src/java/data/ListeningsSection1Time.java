/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dangn
 */
@Entity
@Table(name = "listenings_section1_time")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ListeningsSection1Time.findAll", query = "SELECT l FROM ListeningsSection1Time l")
    , @NamedQuery(name = "ListeningsSection1Time.findById", query = "SELECT l FROM ListeningsSection1Time l WHERE l.id = :id")
    , @NamedQuery(name = "ListeningsSection1Time.findByBegin", query = "SELECT l FROM ListeningsSection1Time l WHERE l.begin = :begin")
    , @NamedQuery(name = "ListeningsSection1Time.findByFinish", query = "SELECT l FROM ListeningsSection1Time l WHERE l.finish = :finish")
    , @NamedQuery(name = "ListeningsSection1Time.findByListeningssection1questionId", query = "SELECT l FROM ListeningsSection1Time l WHERE l.listeningssection1questionId = :listeningssection1questionId")
    , @NamedQuery(name = "ListeningsSection1Time.findByListeningssection1Id", query = "SELECT l FROM ListeningsSection1Time l WHERE l.listeningssection1Id = :listeningssection1Id")})
public class ListeningsSection1Time implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "begin")
    private int begin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "finish")
    private int finish;
    @Basic(optional = false)
    @NotNull
    @Column(name = "listenings_section1_questionId")
    private int listeningssection1questionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "listenings_section1Id")
    private int listeningssection1Id;

    public ListeningsSection1Time() {
    }

    public ListeningsSection1Time(Integer id) {
        this.id = id;
    }

    public ListeningsSection1Time(Integer id, int begin, int finish, int listeningssection1questionId, int listeningssection1Id) {
        this.id = id;
        this.begin = begin;
        this.finish = finish;
        this.listeningssection1questionId = listeningssection1questionId;
        this.listeningssection1Id = listeningssection1Id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getFinish() {
        return finish;
    }

    public void setFinish(int finish) {
        this.finish = finish;
    }

    public int getListeningssection1questionId() {
        return listeningssection1questionId;
    }

    public void setListeningssection1questionId(int listeningssection1questionId) {
        this.listeningssection1questionId = listeningssection1questionId;
    }

    public int getListeningssection1Id() {
        return listeningssection1Id;
    }

    public void setListeningssection1Id(int listeningssection1Id) {
        this.listeningssection1Id = listeningssection1Id;
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
        if (!(object instanceof ListeningsSection1Time)) {
            return false;
        }
        ListeningsSection1Time other = (ListeningsSection1Time) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.ListeningsSection1Time[ id=" + id + " ]";
    }
    
}
