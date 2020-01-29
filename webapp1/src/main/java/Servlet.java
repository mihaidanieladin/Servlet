import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        // Read paramenters from form1
        String usuario = req.getParameter("usuario");
        String password = req.getParameter("password");
        String tecnologias[] = req.getParameterValues("tecnologia");
        String genero = req.getParameter("genero");
        String ocupacion = req.getParameter("ocupacion");
        String musica[] = req.getParameterValues("musica");
        String comentarios = req.getParameter("comentarios");
        
        try {
            PrintWriter out = res.getWriter();
            out.print("<html>");
            out.print("<body>");
            out.print("usuario: " + usuario);
            out.print("\npassword: " + password);
            out.print("\ntecnologias: ");
            for(String tecnologia: tecnologias){
                out.print(tecnologia);
                out.print("\n /  ");
            }
            out.print("\ngenero: " + genero);
            out.print("\nocupacion: " + ocupacion);
            out.print("\nmusica: ");
            for(String music: musica){
                out.print(music);
                out.print("\n /  ");
            }
            out.print("\ncomentarios: " + comentarios);
            out.print("\n</body>");
            out.print("</html>");
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace(System.out);        
        }
        
    }
}
