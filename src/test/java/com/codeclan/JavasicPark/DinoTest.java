import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.codeclan.JavasicPark.repositories.Dinosaurs.DinosaurRepository;
import com.codeclan.JavasicPark.repositories.Paddocks.PaddockRepository;
import com.codeclan.JavasicPark.repositories.Visitors.VisitorRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DinoTest {

    @Autowired
    PaddockRepository paddockRepository;

    @Autowired
    DinosaurRepository dinosaurRepository;

    @Autowired
    VisitorRepository visitorRepository;


    @Test
    public void contextLoads() {
    }

    @Test
    public void name() {
    }
}
