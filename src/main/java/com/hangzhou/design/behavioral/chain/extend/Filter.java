package com.hangzhou.design.behavioral.chain.extend;

/**
 * @Author Faye
 * @Date 2022/11/25 09:52
 */
public interface Filter {
    void doFilter(Request request, Response response, FilterChain filterChain);
}
