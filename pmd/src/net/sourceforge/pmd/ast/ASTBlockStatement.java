/* Generated By:JJTree: Do not edit this line. ASTBlockStatement.java */

package net.sourceforge.pmd.ast;

public class ASTBlockStatement extends SimpleNode {
    public ASTBlockStatement(int id) {
        super(id);
    }

    public ASTBlockStatement(JavaParser p, int id) {
        super(p, id);
    }


    /**
     * Accept the visitor. *
     */
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
