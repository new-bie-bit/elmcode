package com.neusoft.elmcloud.common.core.domain;

import org.apache.commons.lang.StringUtils;

public enum DelTagEnum implements ValueObject<DelTagEnum> {

    /**
     * 删除
     */
    TRUE(0, "删除"),

    /**
     * 正常
     */
    FALSE(1, "正常");


    private Integer value;

    private String label;

    DelTagEnum(Integer value, String label) {
        this.value = value;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public Integer getValue() {
        return value;
    }

    /**
     * 根据匹配value的值获取Label
     *
     * @param value
     * @return
     */
    public static String getLabelByValue(Integer value) {
        if (value == null) {
            return "";
        }
        for (DelTagEnum s : DelTagEnum.values()) {
            if (value.equals(s.getValue())) {
                return s.getLabel();
            }
        }
        return "";
    }

    /**
     * 获取DelTagEnum
     *
     * @param value
     * @return
     */
    public static DelTagEnum getDelTagEnum(Integer value) {
        if (value == null) {
            return null;
        }
        for (DelTagEnum s : DelTagEnum.values()) {
            if (value.equals(s.getValue())) {
                return s;
            }
        }
        return null;
    }

    @Override
    public boolean sameValueAs(final DelTagEnum other) {
        return this.equals(other);
    }
}
