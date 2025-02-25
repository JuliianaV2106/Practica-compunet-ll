<%@ page import="org.example.app.Application" %>
<%@ page import="org.example.services.HelloService" %>
<%@ page import="org.example.services.MessageService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página de Inicio</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #ecf0f1;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            text-align: center;
            padding: 20px;
            background-color: #ffffff;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
        }
        h1 {
            color: #2c3e50;
        }
        p {
            color: #7f8c8d;
            font-size: 18px;
        }
        a {
            color: #3498db;
            text-decoration: none;
            font-size: 18px;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<%

    MessageService messageService = (MessageService) Application.getContext().getBean("messageService");
    out.println("<ul>");
    for (String message: messageService.getMessages()){
        out.println("<li>");
        out.println(message);
        out.println("</li>") ;
    }
    out.println("</ul>");

%>

<form action="messageServlet" method="post">
    <input type="text" name="message">
    <input type="submit">
</form>

</body>
</html>