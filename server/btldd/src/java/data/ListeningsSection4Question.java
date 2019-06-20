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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dangn
 */
@Entity
@Table(name = "listenings_section4_question")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ListeningsSection4Question.findAll", query = "SELECT l FROM ListeningsSection4Question l")
    , @NamedQuery(name = "ListeningsSection4Question.findById", query = "SELECT l FROM ListeningsSection4Question l WHERE l.id = :id")
    , @NamedQuery(name = "ListeningsSection4Question.findByQuestion", query = "SELECT l FROM ListeningsSection4Question l WHERE l.question = :question")
    , @NamedQuery(name = "ListeningsSection4Question.findByAnswer", query = "SELECT l FROM ListeningsSection4Question l WHERE l.answer = :answer")
    , @NamedQuery(name = "ListeningsSection4Question.findByListeningsSection4Id", query = "SELECT l FROM ListeningsSection4Question l WHERE l.listeningsSection4Id = :listeningsSection4Id")})
public class ListeningsSection4Question implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "question")
    private String question;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "answer")
    private String answer;
    @Basic(optional = false)
    @NotNull
    @Column(name = "listenings_section4_id")
    private int listeningsSection4Id;

    public ListeningsSection4Question() {
    }

    public ListeningsSection4Question(Integer id) {
        this.id = id;
    }

    public ListeningsSection4Question(Integer id, String question, String answer, int listeningsSection4Id) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.listeningsSection4Id = listeningsSection4Id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getListeningsSection4Id() {
        return listeningsSection4Id;
    }

    public void setListeningsSection4Id(int listeningsSection4Id) {
        this.listeningsSection4Id = listeningsSection4Id;
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
        if (!(object instanceof ListeningsSection4Question)) {
            return false;
        }
        ListeningsSection4Question other = (ListeningsSection4Question) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.ListeningsSection4Question[ id=" + id + " ]";
    }
    
}
