package com.hangzhou.design.behavioral.chain.extend;

/**
 * @Author Faye
 * @Date 2022/11/25 10:00
 */
public class HttpFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        System.out.println("HttpFilter 之前...");
        filterChain.doFilter(request, response, filterChain);
        System.out.println("HttpFilter 之后...");
    }
}
