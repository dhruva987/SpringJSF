package in.inspirise.test;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Service
public class TestService implements TestServiceIntf {

	/* (non-Javadoc)
	 * @see in.inspirise.test.TestServiceIntf#dummyTest()
	 */
	@Override
	@ExceptionHandler(Exception.class)
	public void dummyTest(String test) throws Exception{
		System.out.println("Dummy Test Executed " +test);
		throw new Exception();
	}
}
