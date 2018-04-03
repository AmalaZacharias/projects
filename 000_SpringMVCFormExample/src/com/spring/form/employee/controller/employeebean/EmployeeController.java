package com.spring.form.employee.controller.employeebean;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller("/employee")
public class EmployeeController {
	
	@RequestMapping("/employeeForm")  
    public ModelAndView showform(){  
         
        return new ModelAndView("employeeForm","command",new EmployeeBean());  
    }  
    @RequestMapping(value="/saveEmployee",method = RequestMethod.POST)  
    public ModelAndView save(@ModelAttribute("employeeBean") EmployeeBean employeeBean){  
      
        System.out.println(employeeBean.getName()+" "+employeeBean.getSalary()+" "+employeeBean.getDesignation());   
        return new ModelAndView("redirect:/viewEmployee");
    }  
      
    
    }  
