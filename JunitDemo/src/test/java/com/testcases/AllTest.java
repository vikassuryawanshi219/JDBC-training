package com.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
@RunWith(JUnitPlatform.class)
@SelectPackages({"com.testcases"})
//@IncludePackages({"com.testcases.demo"})
//@ExcludePackages({"com.testcases.shape"})
@IncludeTags({"A","wrong","pro"})
class AllTest {

	
}
