package com.demo.abhijeet.more.selenium.utils.annotations.browser;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.demo.abhijeet.more.selenium.utils.browser.Screen;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
public @interface BrowserDimension {

    Screen value();
}
