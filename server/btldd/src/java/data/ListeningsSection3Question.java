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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dangn
 */
@Entity
@Table(name = "listenings_section3_question")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ListeningsSection3Question.findAll", query = "SELECT l FROM ListeningsSection3Question l")
    , @NamedQuery(name = "ListeningsSection3Question.findById", query = "SELECT l FROM ListeningsSection3Question l WHERE l.id = :id")
    , @NamedQuery(name = "ListeningsSection3Question.findByListeningSection3Id", query = "SELECT l FROM ListeningsSection3Question l WHERE l.listeningSection3Id = :listeningSection3Id")
    , @NamedQuery(name = "ListeningsSection3Question.findByQuestion", query = "SELECT l FROM ListeningsSection3Question l WHERE l.question = :question")
    , @NamedQuery(name = "ListeningsSection3Question.findByAnswer", query = "SELECT l FROM ListeningsSection3Question l WHERE l.answer = :answer")})
public class ListeningsSection3Question implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "listening_section3_id")
    private int listeningSection3Id;
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

    public ListeningsSection3Question() {
    }

    public ListeningsSection3Question(Integer id) {
        this.id = id;
    }

    public ListeningsSection3Question(Integer id, int listeningSection3Id, String question, String answer) {
        this.id = id;
        this.listeningSection3Id = listeningSection3Id;
        this.question = question;
        this.answer = answer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getListeningSection3Id() {
        return listeningSection3Id;
    }

    public void setListeningSection3Id(int listeningSection3Id) {
        this.listeningSection3Id = listeningSection3Id;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListeningsSection3Question)) {
            return false;
        }
        ListeningsSection3Question other = (ListeningsSection3Question) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.ListeningsSection3Question[ id=" + id + " ]";
    }
    
}
