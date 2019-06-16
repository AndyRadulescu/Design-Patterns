package behavioralPatterns.visitor;

public interface Visitable {
    public double accept(Visitor visitor);
}
