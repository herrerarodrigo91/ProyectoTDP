<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="EstiloPaginaTDP.css"/>
        
        <script type="text/javascript">
            function confirmarEliminar(e,f){
                var mensaje=confirm("¿está seguro que desea eliminar esta Entidad?");
                if(!mensaje){
                    e.preventDefault();
                }
            }
        </script>
    </head>
    <body>
        <h1>estas en la pagina del administrado</h1>
        
        <s:a action="logout"><button class="ver">salir</button></s:a>
        
        <s:a action="atrasModAdmin"><button class="ver">atras</button></s:a>
        <br/>
        <a href="vistaCrearEntidad">
            <button class="ver">crear Entidad</button>
        </a>
        
        <div class="container">
            <ul>
                
                    <s:iterator value="ce">
                        <li>
                     <s:form   action="io">
                         <div class="div-img">
                                
                                <s:hidden name="idBean" value="%{id}"/>
                                <img class="img" src="<s:property value="nombreImagen"/>" width="250px" height="200px"/>
                                <div class="text">
                                    <p><s:property value="nombre"/></p>
                                    <button class="ver" type="submit" value="verEntidad" name="boton"  >ver</button><br>
                                    <button class="ver" type="submit" value="eliminarEntidad" name="boton" onclick="confirmarEliminar(event, this)" on>eliminar entidad</button><br>
                                    <button class="ver" type="submit" value="editarEntidad" name="boton">editar entidad</button>
                                </div>
                                
                         </div>
                         
                     </s:form>
                     </li>
                 </s:iterator>  
                
                
            </ul>
        </div>
        
                    
        
            
        
    </body>
</html>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   