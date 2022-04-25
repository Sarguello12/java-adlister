import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import static java.util.Objects.isNull;

@WebServlet("/counter")
public class PageCounter extends HttpServlet {
    public int counter = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if(isNull(req.getQueryString())){
            counter++;
        } else {
            counter = 0;
            resp.sendRedirect("/counter");
        }

        resp.getWriter().println("Page viewed " + counter + " times.");
    }
}
