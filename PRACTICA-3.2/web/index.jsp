<%@page import="java.util.ArrayList"%>
<%@page import="com.emergentes.modelo.Tarea" %>

<%
    if(session.getAttribute("listatarea")==null){
        ArrayList<Tarea> lisaux = new ArrayList<Tarea>();
        session.setAttribute("listatarea",lisaux);
    }
    ArrayList<Tarea> lista=(ArrayList<Tarea>)session.getAttribute("listatarea");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Gestor de tareas<br></h1>
        <h2>Jhoanna Reina Mamani Espinoza<br></h2>
        <a href="MainServlet?op=nuevo"><br>Nuevo<br></a>
        <br><table border="1">
            <tr>
                <th>Id</th>
                <th>Tarea</th>
                <th>Completado</th>
                <th></th>
                <th></th>
            </tr>
            <%
                if(lista !=null){
                    for(Tarea item:lista){
            %>
            <tr>
                <td><%=item.getId()%></td>
                <td><%=item.getTarea()%></td>
                <td><%=item.getCompletado()%></td>
                <td>
                    <a href="MainServlet?op=editar&id;=<%=item.getId()%>">Editar</a>
                </td>
                <td>
                    <a href="MainServlet?op=eliminar&id=<%=item.getId()%>"
                       onclick=" return (confirm('Esta seguro de eliminar'))"
                       >Eliminar</a>
                </td>
            </tr>
            <%
                    }
                }
            %>
        </table>
        
    </body>
</html>
