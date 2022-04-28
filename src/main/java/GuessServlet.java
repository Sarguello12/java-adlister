import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name="GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/guess.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int min = 1;
        int max = 3;
        Random random = new Random();
        int randomNum = random.nextInt(max + min) + min;

        int userGuess = Integer.parseInt(req.getParameter("guess"));

//        if(userGuess <= 3 && userGuess >= 1){
            if(userGuess == randomNum) {
                resp.sendRedirect("/ConfirmationServlet");
            } else {
                resp.sendRedirect("/RejectionServlet");
            }
//        } else {
//            resp.sendRedirect("/GuessServlet");
//        }

    }
}
