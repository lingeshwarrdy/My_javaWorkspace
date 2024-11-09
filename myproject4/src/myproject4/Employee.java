package myproject4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
@ToString
*/
@Data
public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private long employeeMobile;
}