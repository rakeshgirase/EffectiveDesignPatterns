package com.exuberant.tutorials.designpattern.visitor;

/**
 * Created by rakesh on 08-Jul-2017.
 */
public class InvalidUsernamePasswordException extends Throwable {
    public InvalidUsernamePasswordException(String message) {
        super(message);
    }
}
