/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author dangn
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(data.service.DownloadFile.class);
        resources.add(data.service.ListeningsSection1AnswersFacadeREST.class);
        resources.add(data.service.ListeningsSection1FacadeREST.class);
        resources.add(data.service.ListeningsSection1QuestionFacadeREST.class);
        resources.add(data.service.ListeningsSection1TimeFacadeREST.class);
        resources.add(data.service.ListeningsSection2FacadeREST.class);
        resources.add(data.service.ListeningsSection3FacadeREST.class);
        resources.add(data.service.ListeningsSection3QuestionFacadeREST.class);
        resources.add(data.service.ListeningsSection4FacadeREST.class);
        resources.add(data.service.ListeningsSection4QuestionFacadeREST.class);
        resources.add(data.service.ReadingsPart1FacadeREST.class);
        resources.add(data.service.ReadingsPart1QuestionFacadeREST.class);
        resources.add(data.service.ReadingsPart2FacadeREST.class);
        resources.add(data.service.ReadingsPart3FacadeREST.class);
        resources.add(data.service.SpeakingsFacadeREST.class);
        resources.add(data.service.TestFacadeREST.class);
        resources.add(data.service.WritingsFacadeREST.class);
    }
    
}
