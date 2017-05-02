package linhtran.oec.com;

import DAO.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linhtran on 28/04/2017.
 */
public class Test {
    public static void main(String[] args) {
         ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");


         PersonIML personIML= (PersonIML) context.getBean("personIML");
//         System.out.println(personIML.getJdbc().getJdbcTemplate());
      //   personIML.insert(new Person("Tran Van Linh",20));

        DepartmentIML departmentIML=context.getBean("departmentIML",DepartmentIML.class);

        for(Department department:departmentIML.getAlls())
        {
            System.out.println(department);
        }
    }
}
