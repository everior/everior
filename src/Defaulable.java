/**
 * @author tuyp
 * @create 2019-02-21 22:04
 */
public interface Defaulable {
    default String notRequired() {
        return "Default implementation";
    }
}
