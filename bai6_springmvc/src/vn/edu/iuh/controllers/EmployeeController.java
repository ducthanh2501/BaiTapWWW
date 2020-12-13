package vn.edu.iuh.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import vn.edu.iuh.beans.Employee;
import vn.edu.iuh.dao.EmployeeDao;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDao dao;

	@RequestMapping("/empform")
	public ModelAndView showform() {
		return new ModelAndView("empform", "command", new Employee());
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") Employee emp) {
		dao.save(emp);
		return new ModelAndView("redirect:/viewemp");

	}
// chuyen qua requestmapping khac(redirect:/viewemp)
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("redirect:/viewemp");
	}

	@RequestMapping("/viewemp")
	public ModelAndView viewemp() {
		List<Employee> list = dao.getEmployee();
		return new ModelAndView("viewemp", "list", list);

	}

	@RequestMapping("/editemp/{id}")
	public ModelAndView edit(@PathVariable("id") int id) {
		Employee emp = dao.getEmpById(id);
		return new ModelAndView("empeditform", "command", emp);
	}

	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("emp") Employee emp) {
		dao.update(emp);
		return new ModelAndView("redirect:/viewemp");
	}

	@RequestMapping(value = "/deleteemp/{id}")
	public ModelAndView delete(@PathVariable("id") int id) {
		dao.delete(id);
		return new ModelAndView("redirect:/viewemp");
	}

}
