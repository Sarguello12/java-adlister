import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "PizzaServlet", urlPatterns = "/pizza")
public class PizzaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String size = req.getParameter("pizza-size");
        String crust = req.getParameter("crust-type");
        String sauce = req.getParameter("sauce-type");
        String[] topping = req.getParameterValues("topping");


        req.setAttribute("size", size);
        req.setAttribute("crust-type", crust);
        req.setAttribute("sauce-type", sauce);
        req.setAttribute("topping", topping);

        RequestDispatcher view = req.getRequestDispatcher("/pizza-order.jsp");
        view.forward(req, resp);

        System.out.println(size + ", " + crust + ", " + sauce + ", " + Arrays.toString(topping));
    }
}
