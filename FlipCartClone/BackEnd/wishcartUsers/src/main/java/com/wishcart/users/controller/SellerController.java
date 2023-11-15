package com.wishcart.users.controller;
import java.util.HashMap;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.wishcart.users.model.Seller;
import com.wishcart.users.service.SellerService;

@RestController
@RequestMapping("/seller")
public class SellerController {
	
	
	@Autowired
	SellerService sellerService;
	
	@PostMapping("/register")
	public ResponseEntity<HashMap<String,Object>> registerSeller(HttpServletRequest request,@RequestBody Seller seller){
		return sellerService.registerSeller(seller);
	}
	
	@GetMapping("/authLogin")
	public ResponseEntity<HashMap<String,Object>> sellerAuthlogin(HttpServletRequest request,@RequestParam String userName,@RequestParam String password){
		return sellerService.sellerAuthLogin(userName,password);
	}
	

    @GetMapping("/sellerData")
    public ResponseEntity<List<Seller>> getAllSellers() {
        List<Seller> sellers = sellerService.getAllSellers();
        return ResponseEntity.ok(sellers);
    }
    
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    
    @GetMapping("/send-message")
    public ResponseEntity<String> sendMessage() {
        kafkaTemplate.send("admin-topic", "Testing Message ");
        return ResponseEntity.ok("Message sent successfully");
    }

}
