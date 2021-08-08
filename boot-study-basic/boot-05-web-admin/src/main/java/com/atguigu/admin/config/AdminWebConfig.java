package com.atguigu.admin.config;

import com.atguigu.admin.interceptor.LoginInterceptor;
import com.atguigu.admin.interceptor.RedisUrlCountInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AdminWebConfig implements WebMvcConfigurer {
    /**
     * Filter Interceptor几乎拥有相同的功能
     * 1.Filter是Servlet定义的原生组件，脱离Spring也能用
     * 2.Interceptor是Spring定义的接口，可以用Spring的自动装配等功能
     */
    @Autowired
    RedisUrlCountInterceptor redisUrlCountInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/", "/login","/css/**","/fonts/**","/images/**","/js/**","/aa/**");

        registry.addInterceptor(redisUrlCountInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/", "/login","/css/**","/fonts/**","/images/**","/js/**","/aa/**");
    }
}
