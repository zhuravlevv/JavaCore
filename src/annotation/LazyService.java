package annotation;

import java.lang.annotation.Inherited;

@Service("LazyServiceName")
public class LazyService {
    @Init
    void lazyInit() throws Exception {
        System.out.println("Lazy service");
    }
}
