/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.service;

import java.io.File;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author dangn
 */
@Path("file")
public class DownloadFile {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of DownloadFile
     */
    public DownloadFile() {
    }

    /**
     * Retrieves representation of an instance of data.service.DownloadFile
     * @return an instance of java.lang.String
     */
  
    @Path("audio/{filename}")
    @GET
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public Response getAudio(@PathParam("filename") String filename) {
 
        File file = new File("c:\\btl\\audio\\"+filename);  
   
        Response.ResponseBuilder response = Response.ok((Object) file);  
        response.header("Content-Disposition","attachment; filename="+filename);  
        return response.build();
    }
    @Path("image/{filename}")
    @GET
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public Response getImage(@PathParam("filename") String filename) {
 
        File file = new File("c:\\btl\\image\\"+filename);  
   
        Response.ResponseBuilder response = Response.ok((Object) file);  
        response.header("Content-Disposition","attachment; filename="+filename);  
        return response.build();
    }
    
    @Path("audio/all")
    @GET
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public String getAllFileName() {
        String s="";
        if(s==""){
            s += "[";
            File folder = new File("C:\\btl\\audio");
            File[] listOfFiles = folder.listFiles();

            for (int i = 0; i < listOfFiles.length; i++) {
              if (listOfFiles[i].isFile()) {
                  s = s+  "{\"name\":\""+ listOfFiles[i].getName()+"\"}";
               // System.out.println("File " + listOfFiles[i].getName());
              } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
              }
              if(i<listOfFiles.length-1){
                  s+=",";
              }
            }
           s = s+"]";
        }
       return s;
    }
}
