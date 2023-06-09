package com.poly.beeshoes.infrastructure.exception.rest;
;
import com.poly.beeshoes.infrastructure.exception.BeeShoesExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author thangncph26123
 */

public abstract class BeeShoesExceptionRestHandler<Z extends Exception>
        extends BeeShoesExceptionHandler<ResponseEntity<?>,Z> {

    @Override
    protected ResponseEntity<?> wrap(Z ex) {
        return new ResponseEntity<>(wrapApi(ex), HttpStatus.BAD_REQUEST);
    }

    protected abstract Object wrapApi(Z ex);
}
