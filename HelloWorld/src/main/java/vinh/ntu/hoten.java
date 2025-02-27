package vinh.ntu;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/hoten")
public class hoten extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Lấy tham số 'ho' và 'ten' từ query string
        String ho = request.getParameter("ho");
        String ten = request.getParameter("ten");

        // Thiết lập kiểu nội dung trả về
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
    }

    // Xử lý yêu cầu POST
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
}