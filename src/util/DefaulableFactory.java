package util;

import java.util.function.Supplier;

/**
 * @author tuyp
 * @create 2019-02-21 22:08
 */
public interface DefaulableFactory {
    static Defaulable create( Supplier< Defaulable > supplier ) {
        return supplier.get();
    }
}
