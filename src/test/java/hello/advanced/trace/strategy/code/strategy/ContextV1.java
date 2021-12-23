package hello.advanced.trace.strategy.code.strategy;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 필드에 전략을 보관하는 방식
 */
@Slf4j
@RequiredArgsConstructor
public class ContextV1 {

    private final Strategy strategy;

    public void execute(){
        long startTime = System.currentTimeMillis();

        // business logic start
        strategy.call();
        // business logic end

        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime = {} ", resultTime);
    }
}
