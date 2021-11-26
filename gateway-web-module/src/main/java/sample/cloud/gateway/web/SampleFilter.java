package sample.cloud.gateway.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author gaoy
 * @since 2021/5/21
 */
@Slf4j
public class SampleFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("sample filter...");
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
