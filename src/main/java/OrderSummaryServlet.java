import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "OrderSummaryServlet", urlPatterns = "/order-summary")
public class OrderSummaryServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String productName = request.getParameter("product");
        String quantity = request.getParameter("quantity");

        out.println(
                "<h1>Order Summary</h1>" +
                "<p>Order consists of<br>" + productName + " " + quantity + "</p>"
        );

    }
}
