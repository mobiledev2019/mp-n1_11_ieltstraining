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
@Table(name = "listenings_section1_question")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ListeningsSection1Question.findAll", query = "SELECT l FROM ListeningsSection1Question l")
    , @NamedQuery(name = "ListeningsSection1Question.findById", query = "SELECT l FROM ListeningsSection1Question l WHERE l.id = :id")
    , @NamedQuery(name = "ListeningsSection1Question.findByListeningSection1Id", query = "SELECT l FROM ListeningsSection1Question l WHERE l.listeningSection1Id = :listeningSection1Id")
    , @NamedQuery(name = "ListeningsSection1Question.findByTimeFinish", query = "SELECT l FROM ListeningsSection1Question l WHERE l.timeFinish = :timeFinish")})
public class ListeningsSection1Question implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "listening_section1_id")
    private int listeningSection1Id;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "question")
    private String question;
    @Basic(optional = false)
    @NotNull
    @Column(name = "timeFinish")
    private int timeFinish;

    public ListeningsSection1Question() {
    }

    public ListeningsSection1Question(Integer id) {
        this.id = id;
    }

    public ListeningsSection1Question(Integer id, int listeningSection1Id, String question, int timeFinish) {
        this.id = id;
        this.listeningSection1Id = listeningSection1Id;
        this.question = question;
        this.timeFinish = timeFinish;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getListeningSection1Id() {
        return listeningSection1Id;
    }

    public void setListeningSection1Id(int listeningSection1Id) {
        this.listeningSection1Id = listeningSection1Id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getTimeFinish() {
        return timeFinish;
    }

    public void setTimeFinish(int timeFinish) {
        this.timeFinish = timeFinish;
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
        if (!(object instanceof ListeningsSection1Question)) {
            return false;
        }
        ListeningsSection1Question other = (ListeningsSection1Question) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.ListeningsSection1Question[ id=" + id + " ]";
    }
    
}
