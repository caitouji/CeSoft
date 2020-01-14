package info.caitou.general.aop;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import info.caitou.domain.bean.LayuiMessage;

public class ServiceAspect {
	public Object logs(ProceedingJoinPoint pjp) {
		Logger logger = Logger.getLogger(pjp.getSignature().getDeclaringType());
		String methodName = pjp.getSignature().getName();
		Object[] args = pjp.getArgs();
		try {
			Object proceed = pjp.proceed(args);
			logger.info(methodName + ": [args:" + Arrays.toString(args) + ", result:]");
			return proceed;
		} catch (Throwable e) {
			logger.error(methodName + ": [" + e.getMessage() + "]");
			throw new RuntimeException(e);
		}
	}
}
