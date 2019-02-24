package util;

/**
 * @author tuyp
 * @create 2019-02-21 22:29
 */
public class Main {


    public static void main(String[] args){
        //访问静态方法
        Iconvert<String,String> convert = Something::startsWith;
        String converted = convert.convert("123");
        System.out.println("converted = [" + converted + "]");
        //访问对象方法
        Something something = new Something();
        Iconvert<String,String> converter = something::endWith;
        String convert1 = converter.convert("Java");
        System.out.println("convert1 = [" + convert1 + "]");

        Iconvert<String,Something> convert2 = Something::new;
        Something something2 = convert2.convert("constructors");
        System.out.println("something2 = [" +something2 + "]");
    }


}
