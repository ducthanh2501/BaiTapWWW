package vn.edu.iuh.controller.EmployeeController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import vn.edu.iuh.beans.Employee.Employee;

@Controller
public class EmployeeController {
	List<Employee> list;
	int count = 4;
	public EmployeeController() {
		list = new ArrayList<Employee>();
		list.add(new Employee(1,"rahul",35000f,"S.Engineer"));
		list.add(new Employee(2,"aditya",25000f,"IT Manager"));
		list.add(new Employee(3,"sachin",55000f,"Care Taker"));
	}
	@RequestMapping("/empform")
	public ModelAndView showform() {
		return new ModelAndView("empform","command", new Employee());
	}
@RequestMapping(value="/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") Employee emp){
		
	list.add(new Employee(count++, emp.getName(),emp.getSalary(),emp.getDesignation()));
	return new ModelAndView("redirect:/viewemp");
		
	}

@RequestMapping("/viewemp")
public ModelAndView viewemp() {
	return new ModelAndView("viewemp", "list", list);
}
}
