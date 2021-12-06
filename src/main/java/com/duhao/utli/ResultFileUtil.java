package com.duhao.utli;

/**
 * @author Hao Du
 * @version 1.0
 * @since 2021/12/6
 */
public final class ResultFileUtil {
    private ResultFileUtil() {}

    private static final String FILE_PATTERN = "result/%s.json";

    public static String format(String filename) {
        if (filename == null || "".equals(filename)) {
            throw new IllegalArgumentException("文件名不能为空");
        }
        return String.format(FILE_PATTERN, filename);
    }
}
