/* Generated By:JJTree: Do not edit this line. ASTInitializer.java */

package net.sourceforge.pmd.ast;

public class ASTInitializer extends SimpleNode {
    public ASTInitializer(int id) {
        super(id);
    }

    public ASTInitializer(JavaParser p, int id) {
        super(p, id);
    }


    /**
     * Accept the visitor. *
     */
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    private boolean isStatic;

    public boolean isStatic() {
        return isStatic;
    }

    public void setStatic() {
        isStatic = true;
    }
}
