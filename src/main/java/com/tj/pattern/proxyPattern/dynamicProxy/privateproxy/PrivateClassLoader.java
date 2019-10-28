package com.tj.pattern.proxyPattern.dynamicProxy.privateproxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 2019/10/28
 * author:ljh
 * 1.获取类路径
 * 2.将class文件加载到内存中
 */
public class PrivateClassLoader extends ClassLoader {
    private File classPathFile;

    public PrivateClassLoader() {
        String classPath = PrivateClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = PrivateClassLoader.class.getPackage() + "." + name;
        if(this.classPathFile != null ) {
            File classFile = new File(this.classPathFile,  name.replaceAll("\\.", "/") + ".class");
            if(classFile.exists()) {
                FileInputStream in = null;
                ByteArrayOutputStream out = null;
                try {
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte[] bytes = new byte[1024];
                    int len;
                    while ((len = in.read(bytes)) != -1) {
                        out.write(bytes, 0 , len);
                    }
                    return defineClass(className, out.toByteArray(), 0, out.size());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
