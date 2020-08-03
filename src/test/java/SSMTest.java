import com.wk.bean.User;
import com.wk.mapper.UserMapper;
import com.wk.service.IUserService;
import com.wk.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SSMTest {
    @org.junit.Test
    public void test_ssm(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //IUserService userServicee = (IUserService) ac.getBean("UserServiceImpl");
        //System.out.println(userServicee);
        System.out.println(ac);
        UserMapper userMapper = (UserMapper) ac.getBean("userMapper");
        User user = userMapper.getUserById(1);
        System.out.println(user);

    }
}
