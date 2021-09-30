package pro.yoric.parking;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UIServlet extends HttpServlet
{
    @Override
    public void init(ServletConfig config) throws ServletException
    {
        super.init(config);
    }

    @Override
    public void service(
            ServletRequest req,
            ServletResponse resp)
        throws
            ServletException,
            IOException
    {
        super.service(req, resp);
        resp.setContentType("text/html");
        resp.getWriter().write("Method Service\n");
    }

    @Override
    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse resp)
        throws
            ServletException,
            IOException
    {
        //super.doGet(req, resp);
        resp.getWriter().write("Method doGet\n");
    }

    @Override
    public void destroy(){}
}


//package pro.yoric.it.ui;
//
//        import pro.yoric.it.controller.Printer;
//        import pro.yoric.it.data.Ticket;
//
//public class Main
//{
//    public static void main(String[] args) {
//        Printer printer = new Printer();
//        Ticket ticket = printer.printTicket("A1020-7 AA", "2021-09-25 21:20:23");
//
//        System.out.println(ticket);
//    }
//}