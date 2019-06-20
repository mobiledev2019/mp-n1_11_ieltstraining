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
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dangn
 */
@Entity
@Table(name = "listenings_section1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ListeningsSection1.findAll", query = "SELECT l FROM ListeningsSection1 l")
    , @NamedQuery(name = "ListeningsSection1.findById", query = "SELECT l FROM ListeningsSection1 l WHERE l.id = :id")
    , @NamedQuery(name = "ListeningsSection1.findByTitle", query = "SELECT l FROM ListeningsSection1 l WHERE l.title = :title")
    , @NamedQuery(name = "ListeningsSection1.findByAudio", query = "SELECT l FROM ListeningsSection1 l WHERE l.audio = :audio")})
public class ListeningsSection1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 244)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "audio")
    private String audio;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "suggestion")
    private String suggestion;

    public ListeningsSection1() {
    }

    public ListeningsSection1(Integer id) {
        this.id = id;
    }

    public ListeningsSection1(Integer id, String title, String audio, String suggestion) {
        this.id = id;
        this.title = title;
        this.audio = audio;
        this.suggestion = suggestion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
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
        if (!(object instanceof ListeningsSection1)) {
            return false;
        }
        ListeningsSection1 other = (ListeningsSection1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.ListeningsSection1[ id=" + id + " ]";
    }
    
}
