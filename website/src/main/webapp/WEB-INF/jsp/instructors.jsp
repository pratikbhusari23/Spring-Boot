<%@page import="java.util.ArrayList" %>
<%@page import="java.util.HashMap" %>

<html>
<h1>here are your instructors</h1>
<% 
    ArrayList<HashMap<String,Object>> listOfInstructors = (ArrayList<HashMap<String,Object>>)request.getAttribute("instructors");

    for(HashMap<String,Object> instructors : listOfInstructors){
%>
    name: <%=instructors.get("name") %>
    <a href="profile/<%=instructors.get("id")%>">profile</a>    
    <% 
    }
%> 
</html>
