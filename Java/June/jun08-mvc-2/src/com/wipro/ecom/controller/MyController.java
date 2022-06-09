package com.wipro.ecom.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("/signup")
	public String signup()
	{
		return "signup";
	}
	
	@RequestMapping("/home")
	public String home1()
	{
		return "index";
	}
	
	@RequestMapping("/login")
	public String showLoginPage()
	{
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/two")
	public String two(@RequestParam("email")String email, HttpServletResponse response, ModelMap model)
	{
		//generate opt
		int x= (int) (Math.random()*6);
		String otp=x+"";
		Cookie cookie=new Cookie("otp", otp);
		cookie.setMaxAge(1000*60*15);
		response.addCookie(cookie);
		sendEmail(email, otp);
		model.addAttribute("email", email);
		return "otp";
	}
	
	
	private void sendEmail(String to, String otp)
	{
		 Properties props = new Properties();
	        props.put("mail.smtp.host", "true");
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", "smtp.gmail.com");
	        props.put("mail.smtp.port", "587");
	        props.put("mail.smtp.auth", "true");
	        //Establishing a session with required user details
	        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication("jag.javaprogram@gmail.com", pwd);
	            }
	        });
	        try {
	            //Creating a Message object to set the email content
	            MimeMessage msg = new MimeMessage(session);
	            //Storing the comma seperated values to email addresses
//	            String to = "rjagadeeswaran@yahoo.com";
	            /*Parsing the String with defualt delimiter as a comma by marking the boolean as true and storing the email
	            addresses in an array of InternetAddress objects*/
	            InternetAddress[] address = InternetAddress.parse(to, true);
	            //Setting the recepients from the address variable
	            msg.setRecipients(Message.RecipientType.TO, address);
	            String timeStamp = new SimpleDateFormat("yyyymmdd_hh-mm-ss").format(new Date());
	            msg.setSubject("OTP: " + timeStamp);
	            msg.setSentDate(new Date());
	            msg.setText("The OTP for signing up to our ecom portal is "+otp+". Never share otp with anyone.");
	            msg.setHeader("XPriority", "1");
	           
	            Transport.send(msg);
	            System.out.println("Mail has been sent successfully");
	        } catch (MessagingException mex) {
	            System.out.println("Unable to send an email:\n" + mex);
	        }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private String pwd="xxxxxxxxxxxxxxxxxxxxx";
	
}
