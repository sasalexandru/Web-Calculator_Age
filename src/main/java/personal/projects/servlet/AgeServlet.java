package personal.projects.servlet;


import com.google.gson.Gson;
import personal.projects.entity.AgeCalculator;
import personal.projects.model.CalculationResponse;
import personal.projects.model.ExpressionRequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/ageCalculator"})
public class AgeServlet extends HttpServlet {
    private AgeCalculator ageCalculator;

    @Override
    public void init() throws ServletException {
        this.ageCalculator = new AgeCalculator();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String birthDate = req.getParameter("birthDate");
        int result = ageCalculator.getAgeInDays(birthDate);
        CalculationResponse calculationResponse = new CalculationResponse(result);
        resp.setContentType("application/json");
        Gson gson = new Gson();
        resp.getWriter().write(gson.toJson(calculationResponse));


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("jsps/webCalculator.jsp").forward(req,resp);
    }
}
