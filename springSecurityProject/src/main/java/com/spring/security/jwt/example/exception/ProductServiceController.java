package com.spring.security.jwt.example.exception;

import java.util.HashMap;
import java.util.Map;

import com.spring.security.jwt.example.entity.User;
import com.spring.security.jwt.example.mapper.UserMapper;
import com.spring.security.jwt.example.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceController {

   @Autowired
   private UserMapper userMapper;

   private static Map<String, Product> productRepo = new HashMap<>();
   static {
      Product honey = new Product();
      honey.setId("1");
      honey.setName("Honey");
      productRepo.put(honey.getId(), honey);
      
      Product almond = new Product();
      almond.setId("2");
      almond.setName("Almond");
      productRepo.put(almond.getId(), almond);
   }
   
   @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
   public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, 
		                                       @RequestBody Product product) throws ProductNotfoundException { 
      if(!productRepo.containsKey(id)) {
    	  throw new ProductNotfoundException();
      }
      productRepo.remove(id);
      product.setId(id);
      productRepo.put(id, product);

      //START UserMapper Example
      User user = new User();
      user.setId(1);
      UserDTO userDTO = userMapper.map(user);
      System.out.println(userDTO.getId());
      //END
      return new ResponseEntity<>("Product is updated successfully", HttpStatus.OK);
   }
}
