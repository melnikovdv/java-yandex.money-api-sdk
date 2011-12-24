package ru.yandex.money.api;

/**
 * Указан несуществующий, просроченный, или отозванный токен.
 * @author dvmelnikov
 */

public class InvalidTokenException extends Exception {

    private static final long serialVersionUID = -7313708542728841747L;

    InvalidTokenException(String message) {
        super(message);
    }
}
