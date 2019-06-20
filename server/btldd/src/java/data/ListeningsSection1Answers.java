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
@Table(name = "listenings_section1_answers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ListeningsSection1Answers.findAll", query = "SELECT l FROM ListeningsSection1Answers l")
    , @NamedQuery(name = "ListeningsSection1Answers.findById", query = "SELECT l FROM ListeningsSection1Answers l WHERE l.id = :id")
    , @NamedQuery(name = "ListeningsSection1Answers.findByAnswer", query = "SELECT l FROM ListeningsSection1Answers l WHERE l.answer = :answer")
    , @NamedQuery(name = "ListeningsSection1Answers.findByValue", query = "SELECT l FROM ListeningsSection1Answers l WHERE l.value = :value")
    , @NamedQuery(name = "ListeningsSection1Answers.findByListeningsSection1QuestionId", query = "SELECT l FROM ListeningsSection1Answers l WHERE l.listeningsSection1QuestionId = :listeningsSection1QuestionId")})
public class ListeningsSection1Answers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "answer")
    private String answer;
    @Basic(optional = false)
    @NotNull
    @Column(name = "value")
    private short value;
    @Basic(optional = false)
    @NotNull
    @Column(name = "listenings_section1_question_id")
    private int listeningsSection1QuestionId;

    public ListeningsSection1Answers() {
    }

    public ListeningsSection1Answers(Integer id) {
        this.id = id;
    }

    public ListeningsSection1Answers(Integer id, String answer, short value, int listeningsSection1QuestionId) {
        this.id = id;
        this.answer = answer;
        this.value = value;
        this.listeningsSection1QuestionId = listeningsSection1QuestionId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public short getValue() {
        return value;
    }

    public void setValue(short value) {
        this.value = value;
    }

    public int getListeningsSection1QuestionId() {
        return listeningsSection1QuestionId;
    }

    public void setListeningsSection1QuestionId(int listeningsSection1QuestionId) {
        this.listeningsSection1QuestionId = listeningsSection1QuestionId;
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
        if (!(object instanceof ListeningsSection1Answers)) {
            return false;
        }
        ListeningsSection1Answers other = (ListeningsSection1Answers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.ListeningsSection1Answers[ id=" + id + " ]";
    }
    
}
