import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {

    private static int counter = 0; // static variable initialized to 0

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html"); // converts written text to html as output
        PrintWriter out = response.getWriter(); // out is the variable of type PrintWriter

        counter++; // increase by 1 for every page view
        System.out.println(counter); // test

        out.println("<h1>" + counter + "</h1>");
    }
}
