package vinh.ntu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name =  "HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;


  public HelloServlet() {
    // khởi tạo
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // Biến request lưuu các thông tin yêu cầu
    // Biến response lưu các thông tin trả về cho người dùng

    PrintWriter out = response.getWriter();

    // Lấy dữ liệu từ tham số URL
    // giả sử có dạng /hello?name=TriVinh

    String valueNhanduoc = request.getParameter("name");
    out.println("<h1> Xin chào </h1>");
    out.println("<h2> " + valueNhanduoc + " </h2>");
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
  }

}