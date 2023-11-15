package com.wishcart.seller.servicesImpl;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import com.wishcart.seller.models.Seller;


public interface SellerServiceImpl {

	ResponseEntity<HashMap<String, Object>> registerSeller(Seller seller);

}
