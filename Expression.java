import org.w3c.dom.html.HTMLDivElement;
import java.math.*;
public class Expression  {
    private  Integer iRez;
    private  Main.Action action;



    public void calc(int ival, Main.Action operation) throws NoValidateTipExeption {
        if (iRez==null){
            iRez=ival;
        } else {    //если уже было , делаем ранее запомненное действие, а потом запоминаем новое действие
            switch (action) {
                case Plus:
                    iRez+=ival;
                    break;
                case Minus:
                    iRez-=ival;
                    break;
                case Mult:
                    iRez =iRez*ival;
                    break;
                case Div:
                    iRez = (int) iRez/ival;
                //case none:
                    //throw new NoValidateTipExeption("НЕТ ОПЕРАЦИИ:");
                case Eqv:
                    break;
                case Err:
                    break;
                default:
                    throw new NoValidateTipExeption("НЕТ ОПЕРАЦИИ и воще хрень какая-то:");
            }


        }
        action=operation;

    }

    public  String getiRez() throws NoValidateTipExeption {
        return StringParser.rezToString(iRez);
    }
}
