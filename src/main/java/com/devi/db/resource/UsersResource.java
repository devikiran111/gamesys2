package com.devi.db.resource;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.devi.db.model.Users;
import com.devi.db.repository.UsersRepository;

@RestController
@RequestMapping(value = "/rest/users")
public class UsersResource {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping(value = "/all")
    public List<Users> getAll() {
        return usersRepository.findAll();
    }

    @GetMapping(value="{name}")
    public List<Users>  getImage(@PathVariable("name") String name)
    {
          return usersRepository.findByFirstname(name);
    }
    
    
    @PostMapping(value = "/save")
    @ResponseBody
    public Users persist(@RequestParam("file") MultipartFile file,
    		String firstname,
    		String middlename,
    		String lastname
    		
    		) throws IOException {
    
    	   Users user=new Users();
    	   user.setFirstname(firstname);
    	   user.setMiddlename(middlename);
    	   user.setLastname(lastname);
    	   user.setImage(file.getBytes());
    	   user.setFilename(file.getOriginalFilename().split("\\.")[0]);
    	   user.setFiletype(file.getOriginalFilename().split("\\.")[1]);
    	   
    	   
    	   return usersRepository.save(user);

    }
    
   
    
}