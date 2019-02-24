package util;

/**
 * @author tuyp
 * @create 2019-02-21 22:04
 */
public interface Defaulable {
    default String notRequired() {
        return "Default implementation";
    }

    /**
     * @author tuyp
     * @create 2019-02-19 15:38
     */
    class Main {

        public static void main(String[] args0){
            System.out.println("hello20190102, git");
        }

    }
}
