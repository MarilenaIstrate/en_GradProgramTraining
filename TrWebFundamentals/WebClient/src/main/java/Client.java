import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 * Created by mistrate on 7/27/2016.
 */

public class Client implements CommentWebServiceClient{

    public Comment save(Comment comment) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            String jsonInString = mapper.writeValueAsString(comment);
            URL url = new URL("http://localhost:8081/api/comment");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json");
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(jsonInString);
            wr.flush();
            wr.close();

            int responseCode = con.getResponseCode();

            //String response = con.getResponseMessage();

            System.out.println("" + responseCode);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public Comment update(Comment comment) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            String jsonInString = mapper.writeValueAsString(comment);
            URL url = new URL("http://localhost:8081/api/comment/" + comment.getId());
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("PUT");
            con.setRequestProperty("Content-Type", "application/json");
            con.setDoInput(true);
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(jsonInString);
            wr.flush();
            wr.close();

            int responseCode = con.getResponseCode();

            System.out.println("" + responseCode);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    /*public Comment findById(Long commentId) {
        Comment comm = null;
        ObjectMapper mapper = new ObjectMapper();
        URL url = null;
        StringBuilder result = new StringBuilder();

        try {
            url = new URL("http://localhost:8081/api/comment/" + commentId);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            BufferedReader rd = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null && !line.contains("_links")) {
                result.append(line);
            }
            //Ultimul caracter e o virgula si il elimin dupa care inchid paranteza }
            result.deleteCharAt(result.length()-1);
            result.append("}");
            comm = mapper.readValue(result.toString(), Comment.class);
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return comm;
    }*/


    public Comment findById(Long commentId) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Comment comment = null;

        URL url = new URL("http://localhost:8081/api/comment/" + commentId);
        comment = mapper.readValue(url, Comment.class);
        return comment;
}

    public List<Comment> findAll() {



        // call   get catre /comment --
        // o alta clasa care e de tipul ala cu _embedded care are un obiect de timp commnet lista commnet

        return null;
    }

    public void delete(Long commentId) {
        try {
            URL url = new URL("http://localhost:8081/api/comment/" + commentId);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("DELETE");
            //con.setRequestProperty("Content-Type", "application/json");

            int responseCode = con.getResponseCode();

            System.out.println("" + responseCode);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
