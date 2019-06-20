/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.service;

import com.google.gson.Gson;
import data.ListeningsSection1Question;
import data.ListeningsSection1Time;
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
@Path("data.listeningssection1question")
public class ListeningsSection1QuestionFacadeREST extends AbstractFacade<ListeningsSection1Question> {

    @PersistenceContext(unitName = "btlddPU")
    private EntityManager em;

    public ListeningsSection1QuestionFacadeREST() {
        super(ListeningsSection1Question.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(ListeningsSection1Question entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, ListeningsSection1Question entity) {
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
    public String findId(@PathParam("id") Integer id) {
        return super.findId(id);
    }
    @GET
    @Path("sid={id}")
    @Produces( MediaType.APPLICATION_JSON)
    public String findSId(@PathParam("id") Integer id) {
        return new Gson().toJson(getEntityManager().createNamedQuery("ListeningsSection1Question.findByListeningSection1Id",ListeningsSection1Question.class).setParameter("listeningSection1Id", id).getResultList());
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
    public List<ListeningsSection1Question> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
