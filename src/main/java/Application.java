import com.pluralsight.model.Speaker;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {


    public static void main(String str[]) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
        //SpeakerService service = new SpeakerServiceImpl();
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
