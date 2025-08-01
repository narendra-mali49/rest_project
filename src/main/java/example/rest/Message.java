package example.rest;

import java.time.LocalDate;

public class Message {
	private String content;
	private LocalDate deliveredOn;
	
	
	
	public Message(String content, LocalDate deliveredOn) {
		super();
		this.content = content;
		this.deliveredOn = deliveredOn;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public LocalDate getDeliveredOn() {
		return deliveredOn;
	}



	public void setDeliveredOn(LocalDate deliveredOn) {
		this.deliveredOn = deliveredOn;
	}



	public Message() {
		content="Happy New Year";
		deliveredOn=LocalDate.of(2025, 1, 1);
	}
}
