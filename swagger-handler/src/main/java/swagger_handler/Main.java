package swagger_handler;

import swagger_handler.utils.Swagger2Verification;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    public static void main (String[] args){
        FileInputStream fileInputStream = null;
        Swagger2Verification swaggerUtils =  new Swagger2Verification();
        try {
             fileInputStream = new FileInputStream("D:\\Work\\swagger_handler\\swagger-handler\\src\\main\\resources\\api-docs.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        swaggerUtils.verificateJsonSwagger(swaggerUtils.getContentFile(fileInputStream));
    }
}
