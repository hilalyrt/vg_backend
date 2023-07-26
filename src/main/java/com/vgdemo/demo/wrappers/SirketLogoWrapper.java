package com.vgdemo.demo.wrappers;

public class SirketLogoWrapper {

    private int sirketId;

    private String contentType;

    private String base64;

    public int getSirketId() {
        return sirketId;
    }

    public void setSirketId(int sirketId) {
        this.sirketId = sirketId;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    @Override
    public String toString() {
        return "SirketLogoWrapper{" +
                "sirketId=" + sirketId +
                ", contentType='" + contentType + '\'' +
                ", base64='" + base64 + '\'' +
                '}';
    }
}
