package ru.yandex.money.api;

/**
 * Запрошена операция, на которую у токена нет прав.
 * @author dvmelnikov
 */

public class InsufficientScopeException extends Exception {

    private static final long serialVersionUID = -1864981093896570732L;

    InsufficientScopeException(String message) {
        super(message);
    }
}
