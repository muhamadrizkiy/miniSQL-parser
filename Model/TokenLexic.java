/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiniSQLParser.Model;

/**
 *
 * @author rizki
 */
public class TokenLexic {
    private String strTerm;
    private String besaranLexic;
    private int tokenLexic;
    
    public  TokenLexic(){
        
    }
    
    public TokenLexic(String strTerm, String besaranLexic, int tokenLexic) {
        this.strTerm = strTerm;
        this.besaranLexic = besaranLexic;
        this.tokenLexic = tokenLexic;
    }

    public String getStrTerm() {
        return strTerm;
    }

    public void setStrTerm(String strTerm) {
        this.strTerm = strTerm;
    }

    public String getBesaranLexic() {
        return besaranLexic;
    }

    public void setBesaranLexic(String besaranLexic) {
        this.besaranLexic = besaranLexic;
    }

    public int getTokenLexic() {
        return tokenLexic;
    }

    public void setTokenLexic(int tokenLexic) {
        this.tokenLexic = tokenLexic;
    }
    
    public static boolean FANumber(String input){
        int state = 0;
        int idx = 0;
        boolean status;
        
        while (idx < input.length()) {            
            switch(state){
                case 0:
                    if (input.charAt(idx) == ' ')
                        state = 0;
                    else if(input.charAt(idx)=='0' || input.charAt(idx)=='1' || 
                            input.charAt(idx)=='2' || input.charAt(idx)=='3' || 
                            input.charAt(idx)=='4' || input.charAt(idx)=='5' || 
                            input.charAt(idx)=='6' || input.charAt(idx)=='7' || 
                            input.charAt(idx)=='8' || input.charAt(idx)=='9')
                        state = 1;
                    break;
                case 1:
                    if(input.charAt(idx)=='0' || input.charAt(idx)=='1' || 
                            input.charAt(idx)=='2' || input.charAt(idx)=='3' || 
                            input.charAt(idx)=='4' || input.charAt(idx)=='5' || 
                            input.charAt(idx)=='6' || input.charAt(idx)=='7' || 
                            input.charAt(idx)=='8' || input.charAt(idx)=='9')
                        state = 1;
                    break;
            }
            idx++;
        }
        if (state == 1)
            status = true;
        else
            status = false;
        
        return status;
    }
    
    public static boolean FAVariabel(String input){
        int state = 0;
        int idx = 0;
        boolean status;
        
        while (idx < input.length()) {            
            switch(state){
                case 0:
                    if (input.charAt(idx) == ' ')
                        state = 0;
                    else if(
                            input.charAt(idx)=='a' || input.charAt(idx)=='b' || 
                            input.charAt(idx)=='c' || input.charAt(idx)=='d' || 
                            input.charAt(idx)=='e' || input.charAt(idx)=='f' || 
                            input.charAt(idx)=='g' || input.charAt(idx)=='h' || 
                            input.charAt(idx)=='i' || input.charAt(idx)=='j' ||
                            input.charAt(idx)=='k' || input.charAt(idx)=='l' || 
                            input.charAt(idx)=='m' || input.charAt(idx)=='n' || 
                            input.charAt(idx)=='o' || input.charAt(idx)=='p' ||
                            input.charAt(idx)=='q' || input.charAt(idx)=='r' || 
                            input.charAt(idx)=='s' || input.charAt(idx)=='t' || 
                            input.charAt(idx)=='u' || input.charAt(idx)=='v' || 
                            input.charAt(idx)=='w' || input.charAt(idx)=='x' || 
                            input.charAt(idx)=='y' || input.charAt(idx)=='z' || 
                            input.charAt(idx)=='_')
                        state = 1;
                    break;
                case 1:
                    if(
                            input.charAt(idx)=='a' || input.charAt(idx)=='b' ||
                            input.charAt(idx)=='c' || input.charAt(idx)=='d' || 
                            input.charAt(idx)=='e' || input.charAt(idx)=='f' || 
                            input.charAt(idx)=='g' || input.charAt(idx)=='h' || 
                            input.charAt(idx)=='i' || input.charAt(idx)=='j' ||
                            input.charAt(idx)=='k' || input.charAt(idx)=='l' || 
                            input.charAt(idx)=='m' || input.charAt(idx)=='n' || 
                            input.charAt(idx)=='o' || input.charAt(idx)=='p' ||
                            input.charAt(idx)=='q' || input.charAt(idx)=='r' || 
                            input.charAt(idx)=='s' || input.charAt(idx)=='t' || 
                            input.charAt(idx)=='u' || input.charAt(idx)=='v' || 
                            input.charAt(idx)=='w' || input.charAt(idx)=='x' || 
                            input.charAt(idx)=='y' || input.charAt(idx)=='z' || 
                            input.charAt(idx)=='_')
                        state = 1;
                    break;
            }
            idx++;
        }
        if (state == 1)
            status = true;
        else
            status = false;
        
        return status;
    }
    
    public static boolean FASelect(String input){
        int state = 0;
        int idx = 0;
        boolean status;
        
        while (idx < input.length()) {            
            switch(state){
                case 0:
                    if (input.charAt(idx) == ' ')
                        state = 0;
                    else if(input.charAt(idx)=='s')
                        state = 1;
                    break;
                case 1:
                    if(input.charAt(idx)=='e')
                        state = 2;
                    break;
                case 2:
                    if(input.charAt(idx)=='l')
                        state = 3;
                    break;
                case 3:
                    if(input.charAt(idx)=='e')
                        state = 4;
                    break;
                case 4:
                    if(input.charAt(idx)=='c')
                        state = 5;
                    break;
                case 5:
                    if(input.charAt(idx)=='t')
                        state = 6;
                    break;
                default:
                    state = 0;
            }
            idx++;
        }
        if (state == 6)
            status = true;
        else
            status = false;
        
        return status;
    }
    
    public static boolean FAFrom(String input){
        int state = 0;
        int idx = 0;
        boolean status;
        
        while (idx < input.length()) {            
            switch(state){
                case 0:
                    if (input.charAt(idx) == ' ')
                        state = 0;
                    else if(input.charAt(idx)=='f')
                        state = 1;
                    break;
                case 1:
                    if(input.charAt(idx)=='r')
                        state = 2;
                    break;
                case 2:
                    if(input.charAt(idx)=='o')
                        state = 3;
                    break;
                case 3:
                    if(input.charAt(idx)=='m')
                        state = 4;
                    break;
                default:
                    state = 0;
            }
            idx++;
        }
        if (state == 4)
            status = true;
        else
            status = false;
        
        return status;
    }
    
    public static boolean FAWhere(String input){
        int state = 0;
        int idx = 0;
        boolean status;
        
        while (idx < input.length()) {            
            switch(state){
                case 0:
                    if (input.charAt(idx) == ' ')
                        state = 0;
                    else if(input.charAt(idx)=='w')
                        state = 1;
                    break;
                case 1:
                    if(input.charAt(idx)=='h')
                        state = 2;
                    break;
                case 2:
                    if(input.charAt(idx)=='e')
                        state = 3;
                    break;
                case 3:
                    if(input.charAt(idx)=='r')
                        state = 4;
                    break;
                case 4:
                    if(input.charAt(idx)=='e')
                        state = 5;
                    break;
                default:
                    state = 0;
            }
            idx++;
        }
        if (state == 5)
            status = true;
        else
            status = false;
        
        return status;
    }
    
    public static boolean FAAsterisk(String input){
        int state = 0;
        int idx = 0;
        boolean status;
        
        while (idx < input.length()) {            
            switch(state){
                case 0:
                    if (input.charAt(idx) == ' ')
                        state = 0;
                    else if(input.charAt(idx)=='*')
                        state = 1;
                    break;
                default:
                    state = 0;
            }
            idx++;
        }
        if (state == 1)
            status = true;
        else
            status = false;
        
        return status;
    }
    
    public static boolean FALeftKurung(String input){
        int state = 0;
        int idx = 0;
        boolean status;
        
        while (idx < input.length()) {            
            switch(state){
                case 0:
                    if (input.charAt(idx) == ' ')
                        state = 0;
                    else if(input.charAt(idx)=='(')
                        state = 1;
                    break;
                default:
                    state = 0;
            }
            idx++;
        }
        if (state == 1)
            status = true;
        else
            status = false;
        
        return status;
    }
    
    public static boolean FARightKurung(String input){
        int state = 0;
        int idx = 0;
        boolean status;
        
        while (idx < input.length()) {            
            switch(state){
                case 0:
                    if (input.charAt(idx) == ' ')
                        state = 0;
                    else if(input.charAt(idx)==')')
                        state = 1;
                    break;
                default:
                    state = 0;
            }
            idx++;
        }
        if (state == 1)
            status = true;
        else
            status = false;
        
        return status;
    }
    
    public static boolean FADot(String input){
        int state = 0;
        int idx = 0;
        boolean status;
        
        while (idx < input.length()) {            
            switch(state){
                case 0:
                    if (input.charAt(idx) == ' ')
                        state = 0;
                    else if(input.charAt(idx)=='.')
                        state = 1;
                    break;
                default:
                    state = 0;
            }
            idx++;
        }
        if (state == 1)
            status = true;
        else
            status = false;
        
        return status;
    }
    
    public static boolean FASemiColon(String input){
        int state = 0;
        int idx = 0;
        boolean status;
        
        while (idx < input.length()) {            
            switch(state){
                case 0:
                    if (input.charAt(idx) == ' ')
                        state = 0;
                    else if(input.charAt(idx)==';')
                        state = 1;
                    break;
                default:
                    state = 0;
            }
            idx++;
        }
        if (state == 1)
            status = true;
        else
            status = false;
        
        return status;
    }
    
    public static boolean FAAnd(String input){
        int state = 0;
        int idx = 0;
        boolean status;
        
        while (idx < input.length()) {            
            switch(state){
                case 0:
                    if (input.charAt(idx) == ' ')
                        state = 0;
                    else if(input.charAt(idx)=='a')
                        state = 1;
                    else if(input.charAt(idx)=='n')
                        state = 2;
                    else if(input.charAt(idx)=='d')
                        state = 3;
                    break;
                default:
                    state = 0;
            }
            idx++;
        }
        if (state == 3)
            status = true;
        else
            status = false;
        
        return status;
    }
    
    public static boolean FAOr(String input){
        int state = 0;
        int idx = 0;
        boolean status;
        
        while (idx < input.length()) {            
            switch(state){
                case 0:
                    if (input.charAt(idx) == ' ')
                        state = 0;
                    else if(input.charAt(idx)=='o')
                        state = 1;
                    else if(input.charAt(idx)=='r')
                        state = 2;
                    break;
                default:
                    state = 0;
            }
            idx++;
        }
        if (state == 2)
            status = true;
        else
            status = false;
        
        return status;
    }
    
    public static boolean FANot(String input){
        int state = 0;
        int idx = 0;
        boolean status;
        
        while (idx < input.length()) {            
            switch(state){
                case 0:
                    if (input.charAt(idx) == ' ')
                        state = 0;
                    else if(input.charAt(idx)=='n')
                        state = 1;
                    else if(input.charAt(idx)=='o')
                        state = 2;
                    else if(input.charAt(idx)=='t')
                        state = 3;
                    break;
                default:
                    state = 0;
            }
            idx++;
        }
        if (state == 3)
            status = true;
        else
            status = false;
        
        return status;
    }
    
    public static boolean FAEqual(String input){
        int state = 0;
        int idx = 0;
        boolean status;
        
        while (idx < input.length()) {            
            switch(state){
                case 0:
                    if (input.charAt(idx) == ' ')
                        state = 0;
                    else if(input.charAt(idx)=='=')
                        state = 1;
                default:
                    state = 0;
            }
            idx++;
        }
        if (state == 3)
            status = true;
        else
            status = false;
        
        return status;
    }
    
    public static boolean FAMoreThan(String input){
        int state = 0;
        int idx = 0;
        boolean status;
        
        while (idx < input.length()) {            
            switch(state){
                case 0:
                    if (input.charAt(idx) == ' ')
                        state = 0;
                    else if(input.charAt(idx)=='>')
                        state = 1;
                    break;
                default:
                    state = 0;
            }
            idx++;
        }
        if (state == 1)
            status = true;
        else
            status = false;
        
        return status;
    }
    
    public static boolean FALessThan(String input){
        int state = 0;
        int idx = 0;
        boolean status;
        
        while (idx < input.length()) {            
            switch(state){
                case 0:
                    if (input.charAt(idx) == ' ')
                        state = 0;
                    else if(input.charAt(idx)=='<')
                        state = 1;
                    break;
                default:
                    state = 0;
            }
            idx++;
        }
        if (state == 1)
            status = true;
        else
            status = false;
        
        return status;
    }
    
    public static boolean FALessThanEqual(String input){
        int state = 0;
        int idx = 0;
        boolean status;
        
        while (idx < input.length()) {            
            switch(state){
                case 0:
                    if (input.charAt(idx) == ' ')
                        state = 0;
                    else if(input.charAt(idx)=='<')
                        state = 1;
                    else if (input.charAt(idx)=='=') {
                        state = 2;
                    }
                    break;
                default:
                    state = 0;
            }
            idx++;
        }
        if (state == 2)
            status = true;
        else
            status = false;
        
        return status;
    }
    
    public static boolean FAMoreThanEqual(String input){
        int state = 0;
        int idx = 0;
        boolean status;
        
        while (idx < input.length()) {            
            switch(state){
                case 0:
                    if (input.charAt(idx) == ' ')
                        state = 0;
                    else if(input.charAt(idx)=='>')
                        state = 1;
                    else if(input.charAt(idx)=='=')
                        state = 2;
                    break;
                default:
                    state = 0;
            }
            idx++;
        }
        if (state == 2)
            status = true;
        else
            status = false;
        
        return status;
    }
    
    public static boolean FALike(String input){
        int state = 0;
        int idx = 0;
        boolean status;
        
        while (idx < input.length()) {            
            switch(state){
                case 0:
                    if (input.charAt(idx) == ' ')
                        state = 0;
                    else if(input.charAt(idx)=='l')
                        state = 1;
                    else if(input.charAt(idx)=='i')
                        state = 2;
                    else if(input.charAt(idx)=='k')
                        state = 3;
                    else if(input.charAt(idx)=='e')
                        state = 4;
                    break;
                default:
                    state = 0;
            }
            idx++;
        }
        if (state == 4)
            status = true;
        else
            status = false;
        
        return status;
    }
    public static boolean FAUnion(String input){
        int state = 0;
        int idx = 0;
        boolean status;
        
        while (idx < input.length()) {            
            switch(state){
                case 0:
                    if (input.charAt(idx) == ' ')
                        state = 0;
                    else if(input.charAt(idx)=='u')
                        state = 1;
                    else if(input.charAt(idx)=='n')
                        state = 2;
                    else if(input.charAt(idx)=='i')
                        state = 3;
                    else if(input.charAt(idx)=='o')
                        state = 4;
                    else if (input.charAt(idx)=='n') {
                        state = 5;
                    }
                    break;
                default:
                    state = 0;
            }
            idx++;
        }
        if (state == 5)
            status = true;
        else
            status = false;
        
        return status;
    }
    
    public static boolean FAJoin(String input){
        int state = 0;
        int idx = 0;
        boolean status;
        
        while (idx < input.length()) {            
            switch(state){
                case 0:
                    if (input.charAt(idx) == ' ')
                        state = 0;
                    else if(input.charAt(idx)=='j')
                        state = 1;
                    else if(input.charAt(idx)=='o')
                        state = 2;
                    else if(input.charAt(idx)=='i')
                        state = 3;
                    else if(input.charAt(idx)=='n')
                        state = 4;
                    break;
                default:
                    state = 0;
            }
            idx++;
        }
        if (state == 4)
            status = true;
        else
            status = false;
        
        return status;
    }
    
    public void setLexic(String input){
        if (FASelect(input)) {
            setStrTerm("SELECT");
            setBesaranLexic("KEYWORD");
            setTokenLexic(1);
        } else if (FAFrom(input)) {
            setStrTerm("FROM");
            setBesaranLexic("KEYWORD");
            setTokenLexic(2);
        } else if (FAWhere(input)) {
            setStrTerm("WHERE");
            setBesaranLexic("KEYWORD");
            setTokenLexic(3);
        }
    }
}
