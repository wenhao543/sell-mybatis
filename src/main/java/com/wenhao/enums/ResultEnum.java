package com.wenhao.enums;

public enum ResultEnum {
	PRODUCT_NOT_EXIST(0,"商品不存在")
	;
	private Integer code;
	private String message;
	private ResultEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
	public Integer getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
}
