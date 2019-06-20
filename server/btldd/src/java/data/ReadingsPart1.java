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
@Table(name = "readings_part1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReadingsPart1.findAll", query = "SELECT r FROM ReadingsPart1 r")
    , @NamedQuery(name = "ReadingsPart1.findById", query = "SELECT r FROM ReadingsPart1 r WHERE r.id = :id")
    , @NamedQuery(name = "ReadingsPart1.findByTitle", query = "SELECT r FROM ReadingsPart1 r WHERE r.title = :title")})
public class ReadingsPart1 implements Serializable {

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
    @Column(name = "suggestion")
    private String suggestion;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "paragraph")
    private String paragraph;

    public ReadingsPart1() {
    }

    public ReadingsPart1(Integer id) {
        this.id = id;
    }

    public ReadingsPart1(Integer id, String title, String suggestion, String paragraph) {
        this.id = id;
        this.title = title;
        this.suggestion = suggestion;
        this.paragraph = paragraph;
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

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
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
        if (!(object instanceof ReadingsPart1)) {
            return false;
        }
        ReadingsPart1 other = (ReadingsPart1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.ReadingsPart1[ id=" + id + " ]";
    }
    
}
