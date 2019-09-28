package main.java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DisplayController {

    @RequestMapping("/Ques1")
    public ModelAndView displayDetail(@RequestParam("firstname") String fname,@RequestParam("lastname") String lname){
        User user1=new User();
        user1.setFname(fname);
        user1.setLname(lname);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("display.jsp");
        modelAndView.addObject("user",user1);
        return modelAndView;
    }

}
