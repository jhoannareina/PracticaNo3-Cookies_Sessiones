import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/MensajeVisita"})
public class MensajeVisita extends HttpServlet {
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            int cont = 0 ;
        
        Cookie[] cukis =request.getCookies();
        if(cukis != null){
            for(Cookie c : cukis){
                if(c.getName().equals("visitas")){
                    cont = Integer.parseInt(c.getValue());
                }
            }
        }
        cont++;
            Cookie c=new Cookie("visitas",Integer.toString(cont));
            //establece el tiempo de la cookie en segundos
            c.setMaxAge(36);
            response.addCookie(c);
        
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
            if(cont == 1){
                out.print("<br/><br/>"+"BIENVENIDO A NUESTRO SITIO WEB "+"<br/>");
            }else{
                out.print("<br/><br/>"+"GRACIAS POR VISITARNOS NUEVAMENTE"+"<br/><br/>");
                out.print("<br/>"+"Su Numero de Visita es: "+cont);
                }        
            }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
    }
}
