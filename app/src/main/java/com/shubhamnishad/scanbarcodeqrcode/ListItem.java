package com.shubhamnishad.scanbarcodeqrcode;

/**
 * Created by Shubham on 29-06-2017.
 */

public class ListItem {
    private String code;
    private String type;

    public ListItem(String code, String type) {
        this.code = code;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }
}
