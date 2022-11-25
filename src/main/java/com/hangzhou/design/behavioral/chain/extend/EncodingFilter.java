package com.hangzhou.design.behavioral.chain.extend;

/**
 * @Author Faye
 * @Date 2022/11/25 10:01
 */
public class EncodingFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        System.out.println("EncodingFilter 之前...");
        filterChain.doFilter(request, response, filterChain);
        System.out.println("EncodingFilter 之后...");
    }
}
