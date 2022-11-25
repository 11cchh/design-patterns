package com.hangzhou.design.behavioral.chain.extend;

/**
 * 升级版责任链模式
 * filter1 —> filter2 —> filter3 —> target —> filter3 —> filter2 —> filter 1
 *
 * @Author Faye
 * @Date 2022/11/25 10:01
 */
public class MainTest {
    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HttpFilter());
        filterChain.addFilter(new CharacterFilter());
        filterChain.addFilter(new EncodingFilter());

        filterChain.setTarget(new Target());

        filterChain.doFilter(new Request("request"), new Response("response"), filterChain);
    }
}
