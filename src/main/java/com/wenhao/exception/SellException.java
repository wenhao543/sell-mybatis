package com.wenhao.exception;

import com.wenhao.enums.ResultEnum;

/**
 * 自定义异常类
 * @author wenhao
 *
 */
public class SellException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private Integer code;
	
	public SellException(ResultEnum resultEnum) {
		super(resultEnum.getMessage());
		this.code = resultEnum.getCode();
	}

	public Integer getCode() {
		return code;
	}
}

/*public class SellException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private String errorCode;
	private String errorMsg;
	
	public SellException(String errorCode) {
		this.errorCode = errorCode;
	}
	
	public SellException(String errorCode, String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	
	public String getErrorMsg() {
		return errorMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}
}*/
