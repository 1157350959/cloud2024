package com.atguigu.cloud.mygateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 * ClassName: MyGlobalFilter
 * Package: com.atguigu.cloud.mygateway
 * Description:
 *
 * @Author HL
 * @Create 10/9/2024 7:43 PM
 * @Version:
 */
@Component
@Slf4j
public class MyGlobalFilter implements GlobalFilter, Ordered {
    public static final String BEGIN_VISIT_TIME = "begin_visit_time";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        exchange.getAttributes().put(BEGIN_VISIT_TIME, System.currentTimeMillis());

        return chain.filter(exchange).then(Mono.fromRunnable(()->{
            Long beginVisitTime = exchange.getAttribute(BEGIN_VISIT_TIME);
            if(beginVisitTime != null){
                log.info("request host: "+exchange.getRequest().getURI().getHost());
                log.info("request port: "+exchange.getRequest().getURI().getPort());
                log.info("request URL: "+exchange.getRequest().getURI().getPath());
                log.info("request params: "+exchange.getRequest().getURI().getRawQuery());
                log.info("request duration: "+(System.currentTimeMillis() - beginVisitTime) +"ms");
                log.info("==========================================================");
                System.out.println();
            }
        }));
    }

    @Override
    public int getOrder() {
        return 0; //smaller value more important
    }
}
