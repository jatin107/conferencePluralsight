import com.pluralsight.model.Speaker;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;

public class Application {

    public static void main(String str[])
    {
        SpeakerService service= new SpeakerServiceImpl();
        System.out.println(service.findAll().get(0).getFirstName());
    }
}