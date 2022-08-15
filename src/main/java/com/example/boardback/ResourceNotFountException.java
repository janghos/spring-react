package com.example.boardback;

public class ResourceNotFountException extends RuntimeException {
//예외 처리가 발생할 경우 메세지를 리턴하기 위한 예외처리 클래스
    private static final long serialVersionUID = 1L;

    public ResourceNotFountException(String message) {
    super(message);
}

}
