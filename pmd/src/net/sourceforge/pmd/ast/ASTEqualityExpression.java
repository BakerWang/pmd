/* Generated By:JJTree: Do not edit this line. ASTEqualityExpression.java */

package net.sourceforge.pmd.ast;

public class ASTEqualityExpression extends SimpleNode {
    public ASTEqualityExpression(int id) {
        super(id);
        this.setDiscardable();
    }

    public ASTEqualityExpression(JavaParser p, int id) {
        super(p, id);
        this.setDiscardable();
    }

    /**
     * Accept the visitor. *
     */
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    public void dump(String prefix) {
        System.out.println(toString(prefix) + ":" + getImage());
        dumpChildren(prefix);
    }
}
