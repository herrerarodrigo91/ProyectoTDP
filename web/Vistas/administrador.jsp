<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>estas en la pagina del administrado</h1>
        <s:property value="user"/>
        <s:property value="password"/>
        <s:a action="logout">salir</s:a>
        <br/>
        <a href="vistaCrearEntidad">
            <button>crear Entidad</button>
        </a>
        <s:iterator value="ce">
            <s:form   action="io">
                    <s:property value="nombre"/>
                    <s:hidden name="idBean" value="%{id}"/>
                    <button type="submit" value="verEntidad" name="boton"  >ver</button>
                    <button type="submit" value="eliminarEntidad" name="boton">eliminar entidad</button>
                    <button type="submit" value="editarEntidad" name="boton">editar entidad</button>
                    
                    <hr>
                </s:form>
        </s:iterator>
                    
        
            
        
    </body>
</html>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   