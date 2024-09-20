package com.datorium.Datorium.API.Controllers;

import com.datorium.Datorium.API.DTO.User;
import com.datorium.Datorium.API.DTOs.UserUpdateRequest;
import com.datorium.Datorium.API.Services.UserService;
import org.apache.coyote.BadRequestException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {

    private final UserService userService;

    // Constructor-based injection without @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //@GetMapping
    @PostMapping("/add") //localhost:8080/user/add
    public void add(@RequestBody User user) throws BadRequestException {
        userService.add(user);
    }

    @GetMapping("/get")
    public ArrayList<User> get(){
        return userService.get();
    }

    @PostMapping("/update")
    public User update(@RequestBody User user){
        return userService.update(user);
    }
    @DeleteMapping("/delete")
    public void delete(@RequestParam int id){//localhost:8080/user/delete?id=123
    userService.delete(id);
}
}


