package annotation;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        //inspectService(SimpleService.class);
        myService(SimpleService.class);
        myService(LazyService.class);
    }

    static void myService(Class<?> service) throws IllegalAccessException, InstantiationException {
        Annotation[] annotations = service.getAnnotations();
        if(Arrays.stream(annotations).anyMatch(x->x instanceof Service)){
            SimpleService a = (SimpleService) service.newInstance();
            a.initService();
        }
    }

    static void inspectService(Class<?> service){
        System.out.println(Arrays.toString(service.getDeclaredFields()));
        System.out.println("Public fields:");
        System.out.println(Arrays.toString(service.getFields()));
        System.out.println("AnnotationS:");
        System.out.println(Arrays.toString(service.getAnnotations()));
        System.out.println();
    }
}
