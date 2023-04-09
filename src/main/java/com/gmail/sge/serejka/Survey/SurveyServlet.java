package com.gmail.sge.serejka.Survey;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SurveyServlet extends HttpServlet {
    static int number = 0;
    static int male = 0;
    static int female = 0;
    static int married = 0;
    static int single = 0;
    static int works = 0;
    static int studies = 0;
    static final String TEMPLATE = "<html>" +
            "<head><title>Title</title></head>" +
            "<body><h3>%s</h3></body></html>";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        number++;
        String name = request.getParameter("name");
        String lastName = request.getParameter("lastName");
        int age = 0;
        try {
            age = Integer.parseInt(request.getParameter("age"));
        } catch (NumberFormatException e){
            e.printStackTrace();
        }
        String sex = request.getParameter("sex");
        if (sex.equals("male")){
            male++;
        } else {
            female++;
        }
        String status = request.getParameter("status");
        if (status.equals("single")){
            single++;
        } else {
            married++;
        }
        String work = request.getParameter("work");
        if (work.equals("work")){
            works++;
        } else {
            studies++;
        }
        String result = "<p>Number of request " + number + "</p>" +
                "<p>Number of male " + male + "</p>" +
                "<p>Number of female " + female + "</p>" +
                "<p>Number of married " + married + "</p>" +
                "<p>Number of single " + single + "</p>" +
                "<p>Number of work people " + works + "</p>" +
                "<p>Number of studying people " + studies + "</p>";

                response.getWriter().println(String.format(TEMPLATE,result));

    }
}
