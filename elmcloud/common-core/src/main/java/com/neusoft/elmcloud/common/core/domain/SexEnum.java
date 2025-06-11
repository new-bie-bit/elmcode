package com.neusoft.elmcloud.common.core.domain;

public enum SexEnum implements ValueObject<SexEnum> {

    /**
     * 男
     */
    MALE(0, "男"),

    /**
     * 女
     */
    FEMALE(1, "女");


    private Integer value;

    private String label;

    SexEnum(Integer value, String label) {
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
        for (SexEnum s : SexEnum.values()) {
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
    public static SexEnum getSexEnum(Integer value) {
        if (value == null) {
            return null;
        }
        for (SexEnum s : SexEnum.values()) {
            if (value.equals(s.getValue())) {
                return s;
            }
        }
        return null;
    }

    @Override
    public boolean sameValueAs(final SexEnum other) {
        return this.equals(other);
    }
}
