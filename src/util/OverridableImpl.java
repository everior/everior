package util;

/**
 * @author tuyp
 * @create 2019-02-21 22:05
 */
public class OverridableImpl implements Defaulable{

    @Override
    public String notRequired() {
        return "Overridden implementation";
    }

}
