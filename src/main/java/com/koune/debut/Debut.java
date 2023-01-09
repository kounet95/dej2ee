package com.koune.debut;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Debut
 */
@WebServlet("/debut")
public class Debut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Debut() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		try ( PrintWriter out =response.getWriter()
			
		) 
		
	 {
		 out.print("<!DOCTYPE html>");
		 out.print("<html>");
		 out.print("<head>");
		 out.print("<title>le debut en j2ee</title>");
		 out.print("</head>");
		 out.print("<body>");
		 out.print("<h1>kounet technologie</h1>");
		 out.print("<h2>"+ new Date()+"</h2>");
		 out.print("</body>");
		 out.print("</html>");
	
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
