package com.atguigu.cloud.mygateway;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.server.ServerWebExchange;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * ClassName: MyRoutePredicateFactory
 * Package: com.atguigu.cloud.mygateway
 * Description:
 *
 * @Author HL
 * @Create 10/9/2024 2:54 PM
 * @Version:
 */
@Component
public class MyRoutePredicateFactory extends AbstractRoutePredicateFactory<MyRoutePredicateFactory.Config> {
    @Override
    public List<String> shortcutFieldOrder() {
        return Collections.singletonList("userType");
    }

    @Override
    public Predicate<ServerWebExchange> apply(MyRoutePredicateFactory.Config config) {
        return  new Predicate<ServerWebExchange>(){
            @Override
            public boolean test(ServerWebExchange serverWebExchange) {
                String userType = serverWebExchange.getRequest().getQueryParams().getFirst("userType");
                if(userType == null) return false;
                if(userType.equalsIgnoreCase(config.getUserType())) return true;
                return false;
            }
        };
    }

    @Validated
    public static class Config{
        @Setter
        @Getter
        @NotEmpty
        private String userType; //dimond,gold,silver userLevel
    }

    public MyRoutePredicateFactory(){
        super(MyRoutePredicateFactory.Config.class);
    }
}
