package com.stackroute;
import com.stackroute.domain.Movie;
import com.stackroute.domain.MovieConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        //using application context
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MovieConfiguration.class);
        Movie movie = annotationConfigApplicationContext.getBean("movie", Movie.class);
        movie.display();
         //using bean factory
        XmlBeanFactory xmlBeanFactory=new XmlBeanFactory(new FileSystemResource("/home/pranathi/spring-xml-demo/src/main/resources/beans.xml"));
        Movie movie2=xmlBeanFactory.getBean("movie",Movie.class);
        movie2.display();

        //using beandefinitionregistry and beandefinitionreader
        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new FileSystemResource("src/main/resources/beans.xml"));
        Movie movie3 =((DefaultListableBeanFactory)beanDefinitionRegistry).getBean("movie",Movie.class);
        movie3.display();
     }



    }
}
