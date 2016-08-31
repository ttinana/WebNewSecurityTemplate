/**
 * 
 */
package rs.tijanap.filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author ttinana
 *
 */
public class MyFilter{
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain){
		System.out.println("request > " + request);
		
		try {
			filterChain.doFilter(request, response);
		} catch (IOException | ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("request <" + request);
		
	}

}
