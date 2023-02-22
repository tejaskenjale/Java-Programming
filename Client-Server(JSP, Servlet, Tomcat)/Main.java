import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main")
public class Main extends HttpServlet implements javax.servlet.Servlet {
	private static final long serialVersionUID = 1L;
       
    public Main() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname = request.getParameter("firstname"); 
		String lname = request.getParameter("lastname"); 
		String op = null;
		String head = "";
		int radio = -1;
		String g = request.getParameter("gender");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		if(fname.equals("") && lname.equals("")) {
			if(g==null) {
				op = "Error:- Please Enter Firstname, Lastname and select Gender";
			}else {
				op = "Error:- Firstname and Lastname both are missing";
			}
			
		} else if(fname.equals("")) {
			if(g==null) {
				op = "Error:- Please Enter Firstname and select Gender";
			}else {
				op = "Error:- Firstname is missing";
			}
		} else if(lname.equals("")) {
			if(g==null) {
				op = "Error:- Please Enter Lastname and select Gender";
			}else {
				op = "Error:- Lastname is missing";
			}
		} else if(!fname.matches("^[a-zA-Z]*$") || !lname.matches("^[a-zA-Z]*$")) {
			if(g==null) {
				op = "Error:- Name should not contain numbers and select Gender";
			}else {
				op = "Error:- Name should not contain numbers";
			}
			
		} else {
			try { 
				radio = Integer.parseInt(request.getParameter("gender")); 
				} 
			catch (Exception e) { 
				op = "Error:- Please Select the Gender"; 
				}

			switch(radio){
		      	case 0: 
		      		head = "Welcome To My Shop";
		      		op = "Thank You Mr. "+ fname +" "+ lname +"."+"</h2>"; break;
		      	case 1: 
		      		head = "Welcome To My Shop"; 
		      		op = "Thank You Ms. "+ fname +" "+ lname +"."+"</h2>"; break;
		      	case 2: 
		      		head = "Welcome To My Shop"; 
		      		op = "Thank You "+ fname +" "+ lname +"."+"</h2>"; break;
		      	default: 
		      		op = "Error:- Please select the Gender";
	    	}
		}
		
		
		out.println("<html lang=\"en\" dir=\"ltr\">\n" +
				"<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <link rel=\"stylesheet\" href=\"style.css\">\r\n"
				+ "     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "   	</head>\n" 
				+ "		<body>\r\n"
				+ "  \r\n"
				+ "  <div class=\"container\">\r\n"
				+ "    <div class=\"content\">\r\n"
				+ "    <h1 style=\"font-family:Monotype Corsiva;text-align:center;\">"+ head + "</h1>"	
				+ "    <h2 style=\"display:inline-block; color:#ff9900\">"+ op +"</h2>"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ "\r\n"
				+ "</body>"
				+ "</html>"
				
				);
				
					    	
		
	}

	

}
