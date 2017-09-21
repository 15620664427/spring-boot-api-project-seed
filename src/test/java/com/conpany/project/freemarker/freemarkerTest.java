package com.conpany.project.freemarker;

import com.conpany.project.Tester;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 使用freemarker渲染模板
 */
public class freemarkerTest extends Tester {

    @Resource
    private Configuration configuration;

    /**
     * 测试通过
     * @throws IOException
     * @throws TemplateException
     */
    @Test
    public void freemarker() throws IOException, TemplateException {
        Map<String, Object> model = new HashMap<>();
        model.put("time", new Date());
        model.put("message", "这是测试的内容");
        Template t = configuration.getTemplate("welcome.ftl");
        String content= FreeMarkerTemplateUtils.processTemplateIntoString(t,model);
        System.out.println(content);
    }


}
