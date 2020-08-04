package annotation;

@Service("abc")
public class SimpleService{
    private String pr;
    public String pu;
    @Init
    public void initService(){
        System.out.println("Simple service");
    }
    public void other(){
        System.out.println("Other");
    }

}
