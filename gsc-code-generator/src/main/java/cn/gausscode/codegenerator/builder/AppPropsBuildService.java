/*
 * FileName: ApplicationPropertiesBuildService.java
 * Author: jinlong.hao jinlong.hao@gausscode.cn
 * Date: 2017-11-03
 */

package cn.gausscode.codegenerator.builder;

import cn.gausscode.codegenerator.manager.entity.EppdevTable;
import cn.gausscode.codegenerator.utils.file.TemplateFileUtils;
import cn.gausscode.utils.template.Template;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author jinlong.hao
 */
@Service
public class AppPropsBuildService extends BasicBuildService {
    @Override
    protected Template loadTemplate() throws UnsupportedEncodingException {
        if (this.template == null) {
            String templateContent = TemplateFileUtils.read("/eppdev-code-generator/templates/proj/Application.properties.template");
            template = new Template(new ByteArrayInputStream(templateContent.getBytes("UTF-8")));
        }
        return template;
    }

    @Override
    public Map<String, String> buildFieldsMap(EppdevTable eppdevTable, String basicPackageName) throws UnsupportedEncodingException {
        Properties p = new Properties();
        try {
            p.load(this.getClass().getResourceAsStream("/application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, String> map = new HashMap<>();
        for(Object o: p.keySet()){
            map.put(o.toString().toUpperCase(), p.getProperty(o.toString()));
        }
        return map;
    }

    @Override
    public String buildPackageName(String basicPackageName, EppdevTable table) {
        return "";
    }

    @Override
    public String getSourceDir() {
        return "src/main/resources";
    }

    @Override
    public String getFileName(EppdevTable eppdevTable) {
        return "application.properties";
    }

    @Override
    public boolean needUpdate() {
        return false;
    }

    @Override
    public String update(String originContent, EppdevTable eppdevTable, String basicPackageName) throws IOException {
        return "";
    }
}
