package com.atguigu.sad;

/**
 * @createTime : 2022/8/1 19:59
 */
    public class PropValue {

        private String commonValue;
        private String expression;

        public String getCommonValue() {
            return commonValue;
        }

        public void setCommonValue(String commonValue) {
            this.commonValue = commonValue;
        }

        public String getExpression() {
            return expression;
        }

        public void setExpression(String expression) {
            this.expression = expression;
        }

    @Override
    public String toString() {
        return "PropValue{" +
                "commonValue='" + commonValue + '\'' +
                ", expression='" + expression + '\'' +
                '}';
    }

    public PropValue(String commonValue, String expression) {
            this.commonValue = commonValue;
            this.expression = expression;
        }

        public PropValue() {
        }
    }



