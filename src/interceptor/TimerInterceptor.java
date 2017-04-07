package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TimerInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//ִ��Action֮ǰ
		long start = System.currentTimeMillis();
		//ִ����һ��������������Ѿ������һ������������ִ��Ŀ��Action
		String result = invocation.invoke();
		//ִ��Action֮��
		Long end = System.currentTimeMillis();
		System.out.println("ִ��Action���ѵ�ʱ�䣺"+(end-start)+"ms");
		return result;
	}
}
