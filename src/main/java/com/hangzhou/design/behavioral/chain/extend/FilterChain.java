package com.hangzhou.design.behavioral.chain.extend;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Faye
 * @Date 2022/11/25 09:55
 */
public class FilterChain implements Filter {
    /**
     * 过滤器链
     */
    private List<Filter> filterChain = new ArrayList<>();

    /**
     * 记录当前执行的步骤
     */
    Integer cursor = 0;

    private Target target;

    void addFilter(Filter filter) {
        this.filterChain.add((filter));
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        if (cursor < filterChain.size()) {
            Filter filter = filterChain.get(cursor);
            cursor++;
            filter.doFilter(request, response, chain);
        } else {
            target.hello();
        }
    }
}
