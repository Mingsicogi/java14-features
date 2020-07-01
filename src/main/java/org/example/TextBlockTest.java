package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TextBlockTest {
    public static void main(String[] args) throws Exception {
        //String str = "{\"deviceType\":\"iPhone\"}";
        String deviceJsonString =
                """
                {"deviceType":"iPhone"}
                """;

        ObjectMapper objectMapper = new ObjectMapper();

        Device device = objectMapper.readValue(deviceJsonString, Device.class);
        System.out.println("device type : " + device.getDeviceType());
    }
}

class Device {
    private String deviceType;

    public Device() {
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }
}
