package myjob;

import javax.batch.api.AbstractBatchlet;
import javax.batch.api.BatchProperty;
import javax.inject.Inject;

public class MyBatchlet extends AbstractBatchlet {

    @Inject
    @BatchProperty
    String someCommonProperty;

    @Override
    public String process() throws Exception {
        System.err.println("hello");
        System.out.println(someCommonProperty);
        return null;
    }
}
