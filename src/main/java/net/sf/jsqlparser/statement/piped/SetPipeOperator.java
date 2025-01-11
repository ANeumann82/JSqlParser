package net.sf.jsqlparser.statement.piped;

public class SetPipeOperator extends PipeOperator {
    @Override
    public <T, S> T accept(PipeOperatorVisitor<T> visitor, S context) {
        return visitor.visit(this, context);
    }
}
