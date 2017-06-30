package com.shubhamnishad.scanbarcodeqrcode;

/**
 * Created by Shubham on 29-06-2017.
 */

public class ListItem {
    private long _id;
    private String code;
    private String type;

    public ListItem(long _id,String code, String type) {
        this._id = _id;
        this.code = code;
        this.type = type;
    }
    public long get_Id() {
        return  _id;
    }

    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }
}
