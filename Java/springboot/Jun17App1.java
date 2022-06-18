import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Jun17App1{
    public static void main(String[] args) {
        try {

            URL url = new URL("http://localhost:8081/jun17-jersey-rest-1/rest");//your url i.e fetch data from .
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "text/json");
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : "
                        + conn.getResponseCode());
            }
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            String output;
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            conn.disconnect();

        } catch (Exception e) {
            System.out.println("Exception in NetClientGet:- " + e);
        }
    }
}

-------------------------------
REST principles
	Uniform Interface:
		if i give you the base URL
			GET
			GET	/{id}
			POST
			PUT
			DELETE	/{id}
	all the above should be intutive
	easy to understand


The below URL pattern is NOT based on REST principles
	http://localhost:8080/addEmployee
	http://localhost:8080/findEmployeeById
	http://localhost:8080/updateEmployee
	http://localhost:8080/deleteEmployeeById

Instead, it should be
	GET		http://localhost:8080/employee		returns all employees
	GET		http://localhost:8080/employee/{id}	returns an employee by id
	POST		http://localhost:8080/employee		adds an employee
	PUT		http://localhost:8080/employee		updates an employee
	DELETE		http://localhost:8080/employee/{id}	deletes an employee by id

this is called as uniform interface


	Statelessness:
		every request to a rest api is independent.
		It does not remember or retain information between the requests.
			Login, Logout, session management is usually not there in REST.
			thats why, for every request, JWT tokens sent (in spring boot security)


	Layered System:
		we access a rest api
			that may access db server


	Code on Demand:
		content negotiation
			different data formatters

-----------------------------------------
Project
	1) Each team to select a leader				
	2) Favorite domain
		ex:
			food deliver
			online puchase like amazon
	3) name for the project
		amazon Shopping
		Hygien Food App
		FeelHome Hotels



modules:
	merchant registration
	merchant login
	customer registration
	customer login
	merchent add products
	customer search products
	add to cart
	checkout/ buy now
	tracking
	feedback

---------------------------------------------------------










