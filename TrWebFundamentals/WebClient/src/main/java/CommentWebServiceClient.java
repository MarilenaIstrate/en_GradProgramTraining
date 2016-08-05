import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.util.List;

/**
 * Created by mistrate on 7/27/2016.
 */
public interface CommentWebServiceClient {
    Comment save(Comment comment) throws JsonProcessingException;
    Comment update(Comment comment);
    Comment findById(Long commentId) throws IOException;
    List<Comment> findAll();
    void delete(Long commentId);
}
