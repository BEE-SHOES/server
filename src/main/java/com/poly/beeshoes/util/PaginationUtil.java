package com.poly.beeshoes.util;

/**
 * @author thangncph26123
 */
public class PaginationUtil {

    private PaginationUtil() {}

    public static long calculateTotalPages(Long totalRecord, Integer pageSize) {
        return (totalRecord % pageSize == 0 ? (totalRecord / pageSize) : (totalRecord / pageSize + 1));
    }
}
