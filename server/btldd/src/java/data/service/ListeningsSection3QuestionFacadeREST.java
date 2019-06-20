/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.service;

import com.google.gson.Gson;
import data.ListeningsSection3Question;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author dangn
 */
@Stateless
@Path("data.listeningssection3question")
public class ListeningsSection3QuestionFacadeREST extends AbstractFacade<ListeningsSection3Question> {

    @PersistenceContext(unitName = "btlddPU")
    private EntityManager em;

    public ListeningsSection3QuestionFacadeREST() {
        super(ListeningsSection3Question.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(ListeningsSection3Question entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, ListeningsSection3Question entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String find(@PathParam("id") Integer id) {
        return super.findId(id);
    }
    @GET
    @Path("sid={id}")
    @Produces( MediaType.APPLICATION_JSON)
    public String findbySId(@PathParam("id") Integer id) {
        return new Gson().toJson(getEntityManager().createNamedQuery("ListeningsSection3Question.findByListeningSection3Id", ListeningsSection3Question.class).setParameter("listeningSection3Id", id).getResultList());
    }
    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<ListeningsSection3Question> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
