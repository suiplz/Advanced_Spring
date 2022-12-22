package hello.aop.internalcall;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CallServiceV1 {

    private CallServiceV1 callServiceV1;

    //@Autowired 스프링부트 버전 업데이트 따라 순환참조 막힘 application.properties 설정으로 가능
    @Autowired
    public void setCallServiceV1(CallServiceV1 callServiceV1) {
        this.callServiceV1 = callServiceV1;
    }

    public void external() {
        log.info("Call external");
        callServiceV1.internal(); // 내부 메서드 호출( this.internal() )
    }

    public void internal() {
        log.info("Call internal");
    }
}
