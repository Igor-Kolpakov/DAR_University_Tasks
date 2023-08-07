package kz.Dar.University.employee.core.api.Service;

import kz.Dar.University.employee.core.api.Model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private static final HashMap<String, EmployeeModel> employeeMap = new HashMap<>();

    static {
        EmployeeModel employeeModel1 = new EmployeeModel(UUID.randomUUID().toString(), "Ivan", "Petrov",
                "'Dar", "Engineer", "example1@gmail.com", 330000);
        EmployeeModel employeeModel2 = new EmployeeModel(UUID.randomUUID().toString(), "Maria", "Ivanova",
                "'Dar", "Engineer", "example2@gmail.com", 290000);
        EmployeeModel employeeModel3 = new EmployeeModel(UUID.randomUUID().toString(), "Kseniya", "Maksimova",
                "'Dar", "Engineer", "example3@gmail.com", 260000);
        employeeMap.put(employeeModel1.getEmployeeId(), employeeModel1);
        employeeMap.put(employeeModel2.getEmployeeId(), employeeModel2);
        employeeMap.put(employeeModel3.getEmployeeId(), employeeModel3);
    }
    @Override
    public void createEmployee(EmployeeModel employeeModel) {
        employeeModel.setEmployeeId(UUID.randomUUID().toString());
        employeeMap.put(employeeModel.getEmployeeId(), employeeModel);
    }

    @Override
    public List<EmployeeModel> getAllEmployees() {
        return new ArrayList<>(employeeMap.values());
    }

    @Override
    public EmployeeModel getEmployeeById(String employeeId) {
        return employeeMap.get(employeeId);
    }

    @Override
    public void updateEmployeeById(String employeeId, EmployeeModel employeeModel) {
        employeeModel.setEmployeeId(employeeId);
        employeeMap.put(employeeId, employeeModel);
    }

    @Override
    public void deleteEmployeeById(String employeeId) {
        employeeMap.remove(employeeId);
    }
}
