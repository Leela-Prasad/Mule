package com.boa;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

public class EmployeeProcessor implements Callable{
	
	public EmployeeProcessor() {
		System.out.println("EmployeeProcessor.EmployeeProcessor()");
	}

	public Employee process(String data) {
		System.out.println("EmployeeProcessor.process()");
		String[] elements = data.split(";");

		Employee employee = new Employee(Integer.parseInt(elements[0]), elements[1], Integer.parseInt(elements[2]),
				Boolean.parseBoolean(elements[3]));

		return employee;
	}

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		MuleMessage message = eventContext.getMessage();
		return process(message.getPayloadAsString());
	}
}
