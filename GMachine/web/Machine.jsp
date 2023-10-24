<%-- 
    Document: Machine
    Created on: 24 oct. 2023, 18:55:46
    Author: lenovo
--%>

<%@page import="entities.Machine"%>
<%@page import="service.MachineService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link href="css/csstyle.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <form action="MachineController" method="GET">
        <fieldset> 
            <legend>Informations machine</legend>
            
            <table border="0">
                <thead>
                    <tr>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Référence:</td>
                        <td><input type="text" name="ref" value="" /></td>
                    </tr>
                    <tr>
                        <td>Marque:</td>
                        <td><input type="text" name="marque" value="" /></td>
                    </tr>
                    <tr>
                        <td>Prix:</td>
                        <td><input type="text" name="prix" value="" /></td>
                    </tr>
                    <tr>
                        <td>Salle:</td>
                        <td><input type="text" name="salle" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Ajouter" /><input type="reset" value="Annuler" /></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>
        </fieldset>
        <fieldset>
            <legend>Liste des machines</legend>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Référence</th>
                        <th>Marque</th>
                        <th>Prix</th>
                        <th>Salle</th>
                         <th>Supprimer</th>
                        <th>Modifier</th>
                       
                    </tr>
                </thead>
                <tbody>
                    <% 
                        MachineService ms = new MachineService();
                        for (Machine m : ms.findAll()) {
                    %>
                    <tr>
                        <td><%= m.getId() %></td>
                        <td><%= m.getRf() %></td>
                        <td><%= m.getMarque() %></td>
                        <td><%= m.getPrix() %></td>
                        <td><%= m.getSalle().getId() %></td>
                        <td><a href="MachineController?op=delete&id=<%= m.getId() %>">Supprimer</a></td>
                        <td><a href="MachineController?edit=<%= m.getId() %>">Modifier</a></td>
                        
                    </tr>
                    <% } %>
                </tbody>
            </table>
        </fieldset>
    </form>
</body>
</html>
