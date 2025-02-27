package vinh.ntu;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class testdoPost
 */
@WebServlet("/testdoPost")
public class testdoPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public testdoPost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
        out.println("<html><head><title>Nhập thông tin</title></head><body>");
        out.println("<form method='POST' action='testdoPost'>");
        out.println("Họ và tên: <input type='text' name='fullName' required><br><br>");
        out.println("<input type='submit' value='Gửi'>");
        out.println("</></body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
        String fullName = request.getParameter("fullName");

        out.println("<html><head><title>Kết quả</title></head><body>");
        out.println("<h2>Thông tin bạn đã nhập:</h2>");
        out.println("<p>Họ và tên: " + fullName + "</p>");
        out.println("</body></html>");
	}
}
