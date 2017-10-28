package fr.sh.wa.loicsmallwebapp.running;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleRunningServiceImpl implements SimpleRunningService{

	@Override
	public Collection<Object> getList() {
		Collection<Object> c = new ArrayList<>();
		
		for(int i= 1;i<=3;i++)
		{
			SimpleRunningBean bean = new SimpleRunningBean(i, i+1, i+2);
			c.add(bean);
		}
		return c;
	}
	

}
