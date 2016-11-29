package br.com.vrnery.tutorial.mockito.junit.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.vrnery.tutorial.mockito.junit.helper.ArraysTest;
import br.com.vrnery.tutorial.mockito.junit.helper.StringHelperTest;

@RunWith(Suite.class)
@SuiteClasses({ArraysTest.class, StringHelperTest.class})
public class DummyTestSuite {

}
