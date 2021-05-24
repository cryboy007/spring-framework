package org.springframe.bean;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @ClassName BeanTest
 * @Author HETAO
 * @Date 2021/5/24 15:33
 */
public class BeanTest {
	public static void main(String[] args) {
		final ClassPathResource resource = new ClassPathResource("spring.xml");
		final DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		final BeanDefinitionRegistry beanFactory = reader.getBeanFactory();
		final BeanDefinition studentService = beanFactory.getBeanDefinition("student");

	}
}
