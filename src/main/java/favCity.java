import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/favcity")
public class favCity extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("<h1>Whats your favorite city?</h1>");
        String html = "<form method='POST'>";
        html += "<label for='search'>Search</label>";
        html += "<input name='favcity' id='search' placeholder='enter search term'>";
        html += "<br>";
        html += "<button>Submit</button>";
        html += "</form>";
        resp.getWriter().println(html);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String favCity = req.getParameter("favcity");
//        System.out.println(searchTerm);
        //redirect the user to the search results servlet
        resp.sendRedirect("/search/results?favcity=" + favCity);
    }
}