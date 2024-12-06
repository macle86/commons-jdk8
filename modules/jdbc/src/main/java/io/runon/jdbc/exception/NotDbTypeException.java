/*
 * Copyright (C) 2020 Seomse Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.runon.jdbc.exception;
/**
 * NotDbTypeException
 * database type 이 인식할 수 없는 타입일 때
 * @author macle
 */
public class NotDbTypeException extends RuntimeException{
	
	

	private static final long serialVersionUID = -4829387423444122854L;
	
	private final String message;

	/**
	 * 생성자
	 * @param message String exception message
	 */
	public NotDbTypeException(String message){
		super(message + " (db type is not defined)");
		this.message = message + " (db type is not defined)";
	}
	@Override
	public String getMessage(){
		return message;
	}
}