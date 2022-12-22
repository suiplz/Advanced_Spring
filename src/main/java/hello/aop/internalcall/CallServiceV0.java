package hello.aop.internalcall;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CallServiceV0 {

    public void external() {
        log.info("Call external");
        internal(); // 내부 메서드 호출( this.internal() )
    }

    public void internal() {
        log.info("Call internal");
    }
}
