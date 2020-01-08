import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "OrderFormServlet", urlPatterns = "/order-form")
public class OrderFormServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println(
                "<h1>Place your order</h1>" +
                "<form action=\"/order-summary\" method=\"POST\">\n" +
                        "    Product Name:\n" +
                        "    <input type=\"text\" name=\"product\">\n" +
                        "    Qunatity:\n" +
                        "    <input type=\"text\" name=\"number\">\n" +
                        "    <br>\n" +
                        "    <input type=\"submit\" name=\"submit\">\n" +
                        "</form>\n"
        );
    }
}
