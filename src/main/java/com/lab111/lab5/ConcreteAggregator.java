package com.lab111.lab5;

import java.util.Arrays;

/**
 * class ConcreteAggregator implements interface Aggregate
 * has a bult-in private class TaskIterator
 *
 * @author Volex
 * @version 5.0
 */
class ConcreteAggregator implements Aggregate {
    String[] tasks = {"Finish KPI", "Build a house", "Born a child", "Plant a tree"};

    @Override
    public Iterator getIterator() {
        return new TaskIteratot();
    }

    /**
     * class TaskIterator implements Iterator
     * overrides Iterator's methods
     *
     * @author Volex
     * @version 5.0
     */
    private class TaskIteratot implements Iterator {

        int index = 0;
        int indexPrev = tasks.length;

        @Override
        public boolean hasNext() {
            if (index < tasks.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }

        @Override
        public boolean hasPrevious() {
            if (indexPrev > 0) {
                return true;
            }
            return false;
        }

        @Override
        public Object previous() {
            return tasks[--indexPrev];
        }

        @Override
        public Object[] sort() {
            Arrays.sort(tasks);
            return tasks;
        }



    }
}
