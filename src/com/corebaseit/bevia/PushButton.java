package com.corebaseit.bevia;

/**
 * Created by vbevia on 29/05/16.
 */
public class PushButton {

    private String pushButtonColor;
    private String pushButtonType;

    /**
     * SPST stands for “single pole single throw”
     * SPDT stands for “single pole double throw”
     * DPST The double pole single throw switch usually has 4 terminals
     */

    public PushButton(String pushButtonColor, String pushButtonType) {
        this.pushButtonColor = pushButtonColor;
        this.pushButtonType = pushButtonType;
    }

    public String getPushButtonColor() {
        return pushButtonColor;
    }

    public void setPushButtonColor(String pushButtonColor) {
        this.pushButtonColor = pushButtonColor;
    }

    public String getPushButtonType() {
        return pushButtonType;
    }

    public void setPushButtonType(String pushButtonType) {
        this.pushButtonType = pushButtonType;
    }
}
