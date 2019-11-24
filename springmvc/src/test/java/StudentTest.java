import com.ssm.demo.controller.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2019/11/24
 * author:ljh
 */
public class StudentTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/spring/spring-mvc.xml");
        Student s = (Student) context.getBean("student");
        ((ClassPathXmlApplicationContext) context).close();
//        ((ClassPathXmlApplicationContext) context).destroy();
        System.out.println(s);
    }
}
