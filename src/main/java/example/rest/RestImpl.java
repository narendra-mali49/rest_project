package example.rest;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestImpl {//This calss is meant for exposing REST Endpoints
	//do-greet => Response: Welcome to REST
	@RequestMapping("/do-greet")//Marks this method as Request Handling method
	public String doGreet() {
		String html_data = "<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Welcome to REST</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "	<Marquee direction=\"left\">\r\n"
				+ "		<h1 style=\"color:red\">Welcome to my first REST demo</h1>\r\n"
				+ "	</Marquee>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		return html_data;
	}
	
	//End Point: /get-message => Response: Message Object (content, deliveredOn)
	@RequestMapping("/get-message")
	public Message getMessage() {
		return new Message();
	}
	
	//End Point: /get-all-messages => Response: Message Objects
	@RequestMapping("/get-all-messages")
	public List<Message> getAllMessages(){
		Message msg = new Message();
		Message msg2 = new Message("Bye Bye 2024", LocalDate.of(2024, 12, 31));
		Message msg3 = new Message("Happy Independence Day",LocalDate.of(2025, 8, 15));
		
		List<Message> listOfMessages = List.of(msg,msg2,msg3);
		
		return listOfMessages;
	}
	
	
}
