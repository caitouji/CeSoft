package info.caitou.general.aop;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

import info.caitou.domain.bean.LayuiMessage;

public class LayuiControllerAspect {

	public Object listAspect(ProceedingJoinPoint pjp) {
		Logger logger = Logger.getLogger(pjp.getSignature().getDeclaringType());
		String methodName = pjp.getSignature().getName();
		Object[] args = pjp.getArgs();
		LayuiMessage layuiMessage = new LayuiMessage();
		try {
			Object proceed = pjp.proceed(args);
			layuiMessage.setCode(0);
			layuiMessage.setMsg("Ok");
			layuiMessage.setCount(((Collection<?>) proceed).size());
			layuiMessage.setData(proceed);
			logger.info(methodName + ": [args:" + Arrays.toString(args) + ", result:]");
		} catch (Throwable e) {
			layuiMessage.setCode(1);
			layuiMessage.setMsg("error: " + e.getMessage());
			layuiMessage.setCount(0);
			layuiMessage.setData(null);
			logger.error(methodName + ": [" + e.getMessage() + "]");
		}
		return layuiMessage;
	}

	public Object mapAspect(ProceedingJoinPoint pjp) {
		Logger logger = Logger.getLogger(pjp.getSignature().getDeclaringType());
		String methodName = pjp.getSignature().getName();
		Object[] args = pjp.getArgs();
		LayuiMessage layuiMessage = new LayuiMessage();
		try {
			Object proceed = pjp.proceed(args);
			layuiMessage.setCode(0);
			layuiMessage.setMsg("Ok");
			layuiMessage.setCount(((Map<?, ?>) proceed).size());
			layuiMessage.setData(proceed);
			logger.info(methodName + ": [args:" + Arrays.toString(args) + ", result:]");
		} catch (Throwable e) {
			layuiMessage.setCode(1);
			layuiMessage.setMsg("error: " + e.getMessage());
			layuiMessage.setCount(0);
			layuiMessage.setData(null);
			logger.error(methodName + ": [" + e.getMessage() + "]");
		}
		return layuiMessage;
	}

}
