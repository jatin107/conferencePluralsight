import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import util.CalendarFactory;

import java.util.Calendar;
import java.util.concurrent.ExecutionException;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calFactory() {
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;

    }

    @Bean
    public Calendar cal() throws Exception {
        return calFactory().getObject();

    }
    /*@Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)//singleton
   // @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)//prototype
    //@Scope(value="singleton")//
    public SpeakerService getSpeakerService() {
        //SpeakerServiceImpl service=new SpeakerServiceImpl(getSpeakerRepository());//Constructor Injection
        SpeakerServiceImpl service=new SpeakerServiceImpl();//AutoWired the dependency
        //service.setRepository(getSpeakerRepository());//Setter Injection
        return service;

    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }*/
}
