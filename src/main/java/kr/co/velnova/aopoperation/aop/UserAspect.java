package kr.co.velnova.aopoperation.aop;

import kr.co.velnova.aopoperation.dto.LangDTO;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserAspect {

    // controller 패키지의 모든 메서드에 적용
    @Around("execution(* kr.co.velnova.aopoperation.controller..*(..))")
    public Object convertUser(ProceedingJoinPoint joinPoint) throws Throwable {

        // 메서드의 인자값 호출
        Object[] args = joinPoint.getArgs();

        for (Object object : args) {
            // 함수의 인자 값 중 instance가 LangDTO이면 lang 변경
            if (object instanceof LangDTO) {
                LangDTO langDTO = (LangDTO) object;
                langDTO.setLang("en");
            }
        }

        // 변경된 인자 값으로 메서드 실행
        return joinPoint.proceed(args);
    }
}
