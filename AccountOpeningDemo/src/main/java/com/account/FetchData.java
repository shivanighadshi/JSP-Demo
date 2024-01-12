package com.account;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FetchData
 */
@WebServlet("/FetchData")
public class FetchData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
        String fullname = request.getParameter("fullname");
        String address = request.getParameter("address");
        String dateOfBirth = request.getParameter("date");
        String salary = request.getParameter("salary");
        String[] accountTypes = request.getParameterValues("account");
        String gender = request.getParameter("gender");

        // You can now process or display the retrieved data as needed
        // For demonstration purposes, we'll just print the data to the console
        System.out.println("ID: " + id);
        System.out.println("Fullname: " + fullname);
        System.out.println("Address: " + address);
        System.out.println("Date Of Birth: " + dateOfBirth);
        System.out.println("Salary: " + salary);
        
        if (accountTypes != null) {
            System.out.println("Account Type(s): ");
            for (String accountType : accountTypes) {
                System.out.println(accountType);
            }
        }

        RequestDispatcher req = request.getRequestDispatcher("AccountDetails.jsp");
        request.setAttribute("Fullname", fullname);
//        System.out.println("Gender: " + gender);

        req.forward(request, response);
//		doGet(request, response);
	}

}
