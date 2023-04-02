package mustache.mustache.controller;

import mustache.mustache.dao.EmployeeDAO;
import mustache.mustache.model.Employee;
import mustache.mustache.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class MainController {
    @Autowired
    private EmployeeDAO employeeDAO ;
    @GetMapping("/employee")
    public String handleRequest(Model model) {

        List<Employee> employees = employeeDAO.getEmployees();
        model.addAttribute("employees", employees);

        // Crie um  arquivo employee.mustache  localizado na  pasta resources/templates  do projeto.
        return "employee";
    }

//    @GetMapping("/User")
//    public String handleRequestUser(Model model) {

//        List<User> users = userDAO.getUser();
//        model.addAttribute("users", users);

        // Crie um  arquivo employee.mustache  localizado na  pasta resources/templates  do projeto.
//        return "users";
//    }
}
