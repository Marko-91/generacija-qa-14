package com.itbootcamp.bgqa.nedelja7;

public enum HomeWebElements {
    HOME("/html[1]/body[1]/div[4]/div[2]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[1]/pre[1]"),
    NAV_BAR,
    FOOTER;

    private String absolutePath;

    private HomeWebElements() {}

    private HomeWebElements(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    public String getAbsolutePath() {
        return this.absolutePath;
    }
}
