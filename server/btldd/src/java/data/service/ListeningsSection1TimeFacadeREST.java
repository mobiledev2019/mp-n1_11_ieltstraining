/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.service;

import com.google.gson.Gson;
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
@Path("data.listeningssection1time")
public class ListeningsSection1TimeFacadeREST extends AbstractFacade<ListeningsSection1Time> {

    @PersistenceContext(unitName = "btlddPU")
    private EntityManager em;

    public ListeningsSection1TimeFacadeREST() {
        super(ListeningsSection1Time.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(ListeningsSection1Time entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, ListeningsSection1Time entity) {
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
        return new Gson().toJson(getEntityManager().createNamedQuery("ListeningsSection1Time.findByListeningssection1Id",ListeningsSection1Time.class).setParameter("listeningssection1Id", id).getResultList());
    }
    @GET
    @Path("qid={id}")
    @Produces( MediaType.APPLICATION_JSON)
    public String findQId(@PathParam("id") Integer id) {
        return new Gson().toJson(getEntityManager().createNamedQuery("ListeningsSection1Time.findByListeningssection1questionId",ListeningsSection1Time.class).setParameter("listeningssection1questionId", id).getResultList());
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
    public List<ListeningsSection1Time> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
