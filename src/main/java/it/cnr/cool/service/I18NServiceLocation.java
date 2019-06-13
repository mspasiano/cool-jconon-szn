package it.cnr.cool.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class I18NServiceLocation implements InitializingBean {
    @Autowired
    private I18nService i18nService;

    public void afterPropertiesSet() throws Exception {
        i18nService.addLocation("i18n.cool-jconon-szn");
        i18nService.addLocation("i18n.home");
    }
}
