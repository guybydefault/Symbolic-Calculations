package ru.guybydefault.domain;

public enum FunctionType {
    LOG ("log"),
    EXP ("exp"),
    POW ("pow"),
    SIN ("sin"),
    COS ("cos"),
    TG ("tg"),
    CTG ("ctg"),
    ARCSIN ("arcsin"),
    ARCCOS ("arccos"),
    ARCTG ("arctg"),
    ARCCTG ("arcctg");

    private String title;

    FunctionType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String toString(Expression arg1, Expression arg2) {
        switch (this) {
            case LOG: if (arg2 == null) {
                return "<mi>ln</mi>\n"
                        + "<mo>(</mo>"
                        + arg1.toString()
                        + "<mo>)</mo>";
            } else {
                return "<msub>\n"
                        + "<mi>log</mi>\n"
                        + arg1.toString()
                        + "</msub>\n"
                        + "";
            }
            case EXP: return "<msup>\n"
                    + "<mi>e</mi>"
                    + arg1.toString()
                    + "</msup>\n";
            case POW: return "<msup>\n"
                    + arg1.toString()
                    + arg2.toString()
                    + "</msup>\n";
            //all trigonometric functions looks kinda same
            default: return "<mo>(</mo>\n"
                    + "<mi>"
                    + this.getTitle()
                    + "</mi>\n"
                    + "<mo>(</mo>\n"
                    + arg1.toString()
                    + "<mo>)</mo>\n"
                    + "<mo>)</mo>\n";
        }
    }
}
