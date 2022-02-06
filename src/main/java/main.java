import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//        HelloWorld bean = ctx.getBean(HelloWorld.class);
//        bean.setName("new world");
//
//        System.out.println(bean.getName());


//        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
//        context.start();
//        HelloWorld bean = context.getBean(HelloWorld.class);
//
//        System.out.println(bean.getName());
//
//        context.stop();

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");

        cvp.publish();

    }
}
