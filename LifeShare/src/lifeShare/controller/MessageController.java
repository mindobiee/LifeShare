package lifeShare.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lifeShare.dto.Message;
import lifeShare.service.MessageService;

@Controller 
@RequestMapping(path = "/message" )
public class MessageController {
	@Autowired
	private MessageService messageService;
	
	@GetMapping("/newMessageForm")
	public String newMessageForm() {
		return "message/newMessageForm";
	}
	
	@PostMapping("/sendMessage")
	public String sendMessage(@ModelAttribute Message message, HttpServletRequest request) {
		System.out.println(message);
		messageService.addMessage(message);
		return "redirect:/message";
	}
	
	@GetMapping("/{receiver}")
	public String getMyMessage(@PathVariable(name="receiver") String receiver, ModelMap model) {
		List<Message> myMessage = messageService.getMyMessage(receiver);
		model.addAttribute("myMessage", myMessage);
		return "message/myMessage";
	}
	
	@GetMapping("/{receiver}/{sender}")
	public String getMyMessageList(@PathVariable(name="receiver") String receiver, @PathVariable(name="sender") String sender, ModelMap model) {
		List<Message> myMessageList = messageService.getMyMessageList(receiver, sender);
		model.addAttribute("myMessageList", myMessageList);
		model.addAttribute("yourid", sender);
		return "message/myMessageList";
	}
	
	@GetMapping("/delete")
	public String deleteMessage(String id, String sender) {
		messageService.deleteMessage(id, sender);
		return "redirect:/message";
	}
	
	@GetMapping("/open")
	public String updateTodo(int mid) {
		messageService.openMessage(mid);
		return "redirect:/message";
	}
	
}
