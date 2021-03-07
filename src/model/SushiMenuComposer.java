package model;

/**
 * @author Jacinthe van Niele en Robert Kensen on 5-3-2021
 * @project ChainOfResponsibility
 * This class represents a handler in a 'Chain of Responsibility' design pattern
 *
 */
public abstract class SushiMenuComposer {
    protected SushiMenuComposer nextSushiComposer;

    public void setNextSushiComposer(SushiMenuComposer nextSushiComposer) {
        this.nextSushiComposer = nextSushiComposer;
    }


    public abstract void compose(Credits credits);

}
