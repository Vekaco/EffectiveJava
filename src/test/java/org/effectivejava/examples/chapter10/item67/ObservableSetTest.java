package org.effectivejava.examples.chapter10.item67;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ObservableSetTest {
    private ObservableSet<Integer> set;

    @Before
    public void initSet() {
        set = new ObservableSet<Integer>(new HashSet<Integer>());
    }

    @Test
    public void testObservableSet() {


        set.addObserver(new SetObserver<Integer>() {
            @Override
            public void added(ObservableSet<Integer> e, Integer element) {
                System.out.println(element);
            }

            @Override
            public void added(CopyOnWriteObservableSet<Integer> e, Integer element) {

            }
        });

        for (int i = 0; i < 100; i++)
            set.add(i);
    }

    @Test

    public void testRemoveIf23() {
        set.addObserver(new SetObserver<Integer>() {
            @Override
            public void added(ObservableSet<Integer> e, Integer element) {
                System.out.println(element);
                if(element==23)
                    set.removeObserver(this);
            }

            @Override
            public void added(CopyOnWriteObservableSet<Integer> e, Integer element) {

            }
        });
        for (int i = 0; i < 100; i++)
            set.add(i);
    }

    @Test
    public void testExecutorRemove() {
        //observer that users a background thread needlessly
        set.addObserver(new SetObserver<Integer>() {
            @Override
            public void added(final ObservableSet<Integer> e, Integer element) {
                System.out.println(element);
                if (element==23) {
                    ExecutorService executor = Executors.newSingleThreadExecutor();

                    final SetObserver<Integer> observer = this;
                    try {
                        executor.submit(new Runnable() {
                            @Override
                            public void run() {
                                e.removeObserver(observer);
                            }
                        }).get();
                    } catch (InterruptedException ex) {
                        throw new AssertionError(ex.getCause());
                    } catch (ExecutionException ex) {
                        throw new AssertionError(ex.getCause());
                    }finally {
                        executor.shutdown();
                    }
                }
            }

            @Override
            public void added(CopyOnWriteObservableSet<Integer> e, Integer element) {

            }
        });
        for (int i = 0; i < 100; i++)
            set.add(i);
    }
}
