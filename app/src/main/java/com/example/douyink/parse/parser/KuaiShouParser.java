package com.example.douyink.parse.parser;

import com.example.douyink.parse.Parser;
import com.example.douyink.parse.callback.ParseCallback;

/**
 * ================================================
 * 作    者：Herve、Li
 * 创建日期：2021/3/15
 * 描    述：快手解析器
 * 修订历史：
 * ================================================
 */
public class KuaiShouParser implements Parser {

    @Override
    public boolean parseHtml(String html, ParseCallback callback) {
        return videoBaseParse(html, callback, null);
    }
}
