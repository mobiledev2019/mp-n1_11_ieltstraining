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
@Table(name = "readings_part1_question")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReadingsPart1Question.findAll", query = "SELECT r FROM ReadingsPart1Question r")
    , @NamedQuery(name = "ReadingsPart1Question.findById", query = "SELECT r FROM ReadingsPart1Question r WHERE r.id = :id")
    , @NamedQuery(name = "ReadingsPart1Question.findByReadingsPart1Id", query = "SELECT r FROM ReadingsPart1Question r WHERE r.readingsPart1Id = :readingsPart1Id")
    , @NamedQuery(name = "ReadingsPart1Question.findByQuestion", query = "SELECT r FROM ReadingsPart1Question r WHERE r.question = :question")
    , @NamedQuery(name = "ReadingsPart1Question.findByAnswer", query = "SELECT r FROM ReadingsPart1Question r WHERE r.answer = :answer")})
public class ReadingsPart1Question implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "readings_part1_id")
    private int readingsPart1Id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "question")
    private String question;
    @Basic(optional = false)
    @NotNull
    @Column(name = "answer")
    private short answer;

    public ReadingsPart1Question() {
    }

    public ReadingsPart1Question(Integer id) {
        this.id = id;
    }

    public ReadingsPart1Question(Integer id, int readingsPart1Id, String question, short answer) {
        this.id = id;
        this.readingsPart1Id = readingsPart1Id;
        this.question = question;
        this.answer = answer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getReadingsPart1Id() {
        return readingsPart1Id;
    }

    public void setReadingsPart1Id(int readingsPart1Id) {
        this.readingsPart1Id = readingsPart1Id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public short getAnswer() {
        return answer;
    }

    public void setAnswer(short answer) {
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
        if (!(object instanceof ReadingsPart1Question)) {
            return false;
        }
        ReadingsPart1Question other = (ReadingsPart1Question) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.ReadingsPart1Question[ id=" + id + " ]";
    }
    
}
