package controller;



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Person;

/**
 *
 * @author aalmasri
 */
public class HelloWorldServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/helloWorldForm.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String fn = request.getParameter("firstName");
        String ln = request.getParameter("lastName");
        
        
        // if fn is null --> not exists
        // or fn is empty
        // or ln is null
        // or ln is empty
        if(fn == null || fn.equals("") || ln == null || ln.equals("")){
            request.setAttribute("fn", fn);
            request.setAttribute("ln", ln);
            request.setAttribute("message", true);
            getServletContext().getRequestDispatcher("/WEB-INF/helloWorldForm.jsp")
                .forward(request, response);
            return; // stop here and do not continue
        }
        // if the input is bad --> I could not create an object of type Person
        // if there is no problem then create the object 
        Person p = new Person(fn, ln);
        request.setAttribute("person", p);
        getServletContext().getRequestDispatcher("/WEB-INF/sayHello.jsp")
                .forward(request, response);
    }


}
