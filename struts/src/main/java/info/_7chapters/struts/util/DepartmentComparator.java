package info._7chapters.struts.util;

import info._7chapters.struts.dto.Employee;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Employee> {
   public int compare(Employee e1, Employee e2) {
      return e1.getDepartment().compareTo(e2.getDepartment());
   }
}