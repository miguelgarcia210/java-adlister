import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html"); // converts written text to html as output
        PrintWriter out = response.getWriter(); // out is the variable of type PrintWriter
//        out.println("<h1>Hello, World!</h1>"); // outputs the html text

        String name = request.getParameter("name"); // sets variable 'name' to the parameter 'name'
        if (name != null && !name.equals("")) { // checks if name is NOT non-existent or empty
            out.println("<h1>Hello, " + name + "!<h1>"); // print out Hello with the name value
        } else {
            out.println("<h1>Hello, World!</h1>"); // print out original message
        }
    }
}
