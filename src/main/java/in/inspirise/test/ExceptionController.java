package in.inspirise.test;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@Component
@ControllerAdvice
public class ExceptionController {
	@ExceptionHandler(Exception.class)
	public void ExceptionHandler(Exception ex){
		System.out.println("exception handled");
	}

}
