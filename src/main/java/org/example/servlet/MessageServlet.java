package org.example.servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.app.Application;
import org.example.services.MessageService;

@WebServlet("/messageServlet")
public class MessageServlet extends HttpServlet {

    private MessageService messageService;

    @Override
    public void init() {
        messageService = (MessageService) Application.getContext().getBean("messageService");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String newMessage = req.getParameter("message");
        if (newMessage != null && !newMessage.trim().isEmpty()) {
            messageService.addMessage(newMessage);
        }
        resp.sendRedirect("./");
    }
}