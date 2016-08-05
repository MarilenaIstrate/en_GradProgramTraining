import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.util.Date;
import org.junit.Test;

/**
 * Created by mistrate on 7/28/2016.
 */
public class ClientTest {
    CommentWebServiceClient client = new Client();
    @Test
    public void testSave(){
        Comment comment2 = new Comment(new Date("07/06/2016"), "Roz si uiti de pete", "roz@email", "Maria");
        try {
            client.save(comment2);
        } catch (JsonProcessingException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }


    @Test
    public void testUpdate(){

        Comment comment1 = new Comment(4, new Date("07/06/2015"), "TestUpdate", "yestUpdate@email", "Test");

        client.update(comment1);
    }

    @Test
    public void testFindById() throws IOException {
        Comment comm = client.findById((long)3);
        System.out.println(comm);

    }

    @Test
    public void testDelete(){
        client.delete((long)9);
    }


}
