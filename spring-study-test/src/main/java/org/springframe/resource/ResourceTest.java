package org.springframe.resource;

import org.springframework.core.io.*;

/**
 * @ClassName Test
 * @Author HETAO
 * @Date 2021/5/24 12:53
 */
public class ResourceTest {
	public static void main(String[] args) {
		ResourceLoader resourceLoader = new DefaultResourceLoader();
		Resource fileResource1 = resourceLoader.getResource("F:/mynote/md/Spring源码学习.md");
		fileResource1 = new FileSystemResource("F:/mynote/md/Spring源码学习.md");
		System.out.println("fileResource1 is ClassPathResource:" + (fileResource1 instanceof FileSystemResource));

		Resource fileResource2 = resourceLoader.getResource("/mynote/md/Spring源码学习.md");
		System.out.println("fileResource2 is ClassPathResource:" + (fileResource2 instanceof ClassPathResource));

		Resource urlResource1 = resourceLoader.getResource("file:/mynote/md/Spring源码学习.md");
		System.out.println("urlResource1 is UrlResource:" + (urlResource1 instanceof UrlResource));

		Resource urlResource2 = resourceLoader.getResource("http://www.baidu.com");
		System.out.println("urlResource1 is urlResource:" + (urlResource2 instanceof  UrlResource));
	}
}
