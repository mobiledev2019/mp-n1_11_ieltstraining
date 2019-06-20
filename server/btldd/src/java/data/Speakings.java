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
@Table(name = "speakings")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Speakings.findAll", query = "SELECT s FROM Speakings s")
    , @NamedQuery(name = "Speakings.findById", query = "SELECT s FROM Speakings s WHERE s.id = :id")
    , @NamedQuery(name = "Speakings.findByTitle", query = "SELECT s FROM Speakings s WHERE s.title = :title")
    , @NamedQuery(name = "Speakings.findByImage", query = "SELECT s FROM Speakings s WHERE s.image = :image")})
public class Speakings implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "question")
    private String question;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "sample")
    private String sample;
    @Column(name = "image")
    private Integer image;

    public Speakings() {
    }

    public Speakings(Integer id) {
        this.id = id;
    }

    public Speakings(Integer id, String title, String question, String sample) {
        this.id = id;
        this.title = title;
        this.question = question;
        this.sample = sample;
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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
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
        if (!(object instanceof Speakings)) {
            return false;
        }
        Speakings other = (Speakings) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.Speakings[ id=" + id + " ]";
    }
    
}
