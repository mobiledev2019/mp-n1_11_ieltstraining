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
@Table(name = "readings_part3")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReadingsPart3.findAll", query = "SELECT r FROM ReadingsPart3 r")
    , @NamedQuery(name = "ReadingsPart3.findById", query = "SELECT r FROM ReadingsPart3 r WHERE r.id = :id")
    , @NamedQuery(name = "ReadingsPart3.findByTitle", query = "SELECT r FROM ReadingsPart3 r WHERE r.title = :title")
    , @NamedQuery(name = "ReadingsPart3.findBySuggestion", query = "SELECT r FROM ReadingsPart3 r WHERE r.suggestion = :suggestion")
    , @NamedQuery(name = "ReadingsPart3.findByParagraph", query = "SELECT r FROM ReadingsPart3 r WHERE r.paragraph = :paragraph")
    , @NamedQuery(name = "ReadingsPart3.findByBox", query = "SELECT r FROM ReadingsPart3 r WHERE r.box = :box")
    , @NamedQuery(name = "ReadingsPart3.findByQ1", query = "SELECT r FROM ReadingsPart3 r WHERE r.q1 = :q1")
    , @NamedQuery(name = "ReadingsPart3.findByQ2", query = "SELECT r FROM ReadingsPart3 r WHERE r.q2 = :q2")
    , @NamedQuery(name = "ReadingsPart3.findByQ3", query = "SELECT r FROM ReadingsPart3 r WHERE r.q3 = :q3")
    , @NamedQuery(name = "ReadingsPart3.findByQ4", query = "SELECT r FROM ReadingsPart3 r WHERE r.q4 = :q4")
    , @NamedQuery(name = "ReadingsPart3.findByQ5", query = "SELECT r FROM ReadingsPart3 r WHERE r.q5 = :q5")})
public class ReadingsPart3 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "title")
    private int title;
    @Basic(optional = false)
    @NotNull
    @Column(name = "suggestion")
    private int suggestion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "paragraph")
    private int paragraph;
    @Basic(optional = false)
    @NotNull
    @Column(name = "box")
    private int box;
    @Basic(optional = false)
    @NotNull
    @Column(name = "q1")
    private int q1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "q2")
    private int q2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "q3")
    private int q3;
    @Basic(optional = false)
    @NotNull
    @Column(name = "q4")
    private int q4;
    @Basic(optional = false)
    @NotNull
    @Column(name = "q5")
    private int q5;

    public ReadingsPart3() {
    }

    public ReadingsPart3(Integer id) {
        this.id = id;
    }

    public ReadingsPart3(Integer id, int title, int suggestion, int paragraph, int box, int q1, int q2, int q3, int q4, int q5) {
        this.id = id;
        this.title = title;
        this.suggestion = suggestion;
        this.paragraph = paragraph;
        this.box = box;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.q5 = q5;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(int suggestion) {
        this.suggestion = suggestion;
    }

    public int getParagraph() {
        return paragraph;
    }

    public void setParagraph(int paragraph) {
        this.paragraph = paragraph;
    }

    public int getBox() {
        return box;
    }

    public void setBox(int box) {
        this.box = box;
    }

    public int getQ1() {
        return q1;
    }

    public void setQ1(int q1) {
        this.q1 = q1;
    }

    public int getQ2() {
        return q2;
    }

    public void setQ2(int q2) {
        this.q2 = q2;
    }

    public int getQ3() {
        return q3;
    }

    public void setQ3(int q3) {
        this.q3 = q3;
    }

    public int getQ4() {
        return q4;
    }

    public void setQ4(int q4) {
        this.q4 = q4;
    }

    public int getQ5() {
        return q5;
    }

    public void setQ5(int q5) {
        this.q5 = q5;
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
        if (!(object instanceof ReadingsPart3)) {
            return false;
        }
        ReadingsPart3 other = (ReadingsPart3) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.ReadingsPart3[ id=" + id + " ]";
    }
    
}
