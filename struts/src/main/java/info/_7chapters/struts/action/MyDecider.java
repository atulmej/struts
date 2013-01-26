package info._7chapters.struts.action;

import info._7chapters.struts.dto.Employee;

import org.apache.struts2.util.SubsetIteratorFilter.Decider;
public class MyDecider implements Decider{

	 public boolean decide(Object element) throws Exception {
           Employee employee = (Employee)element;
           return employee.getDepartment().equals("Recruitment");
        }
}
