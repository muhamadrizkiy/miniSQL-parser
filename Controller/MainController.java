/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiniSQLParser.Controller;

import java.util.ArrayList;
import MiniSQLParser.Model.TokenLexic;
import MiniSQLParser.View.FrameUtama;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author rizki
 */

public class MainController implements ActionListener{
    private FrameUtama frameUtama;
    private ArrayList<TokenLexic> SqlTerm;
    private String tmp = "";
    private TokenLexic lexic;
    
    public MainController() {
        lexic = new TokenLexic();
        
        frameUtama = new FrameUtama();
        
        frameUtama.addListener(this);
        frameUtama.setVisible(true);

        
    }
    
    
    
    public static ArrayList<TokenLexic> initTerms(){
        ArrayList<TokenLexic> listTerm = new ArrayList<>();
        
        listTerm.add(new TokenLexic("SELECT", "KEYWORD", 1));
        listTerm.add(new TokenLexic("*", "KEYWORD", 2));
        listTerm.add(new TokenLexic("WHERE", "KEYWORD", 3));
        listTerm.add(new TokenLexic("FROM", "KEYWORD", 4));
        listTerm.add(new TokenLexic("(", "KEYWORD", 5));
        listTerm.add(new TokenLexic(")", "KEYWORD", 6));
        listTerm.add(new TokenLexic(".", "KEYWORD", 7));
        listTerm.add(new TokenLexic(";", "KEYWORD", 8));
        listTerm.add(new TokenLexic("AND", "BOOLEAN OPERATOR", 9));
        listTerm.add(new TokenLexic("OR", "BOOLEAN OPERATOR", 10));
        listTerm.add(new TokenLexic("NOT", "BOOLEAN OPERATOR", 11));
        listTerm.add(new TokenLexic(">=", "LOGIC OPERATOR", 12));
        listTerm.add(new TokenLexic("=", "LOGIC OPERATOR", 13));
        listTerm.add(new TokenLexic("<=", "LOGIC OPERATOR", 14));
        listTerm.add(new TokenLexic("LIKE", "LOGIC OPERATOR", 15));
        listTerm.add(new TokenLexic("UNION", "SET OPERATOR", 16));
        listTerm.add(new TokenLexic("JOIN", "SET OPERATOR", 17));
        
        return listTerm;
    }
    
 
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object e = ae.getSource();
        if (e.equals(frameUtama.getBtnParse())) {
            frameUtama.clearTable();
            //String[] sqlString = frameUtama.getTxtSQLInput().getText().split("\\s+");
            String sql = "and";
            System.out.println(TokenLexic.FANumber(sql));
            System.out.println(TokenLexic.FAVariabel(sql));
            System.out.println(TokenLexic.FASelect(sql));
            System.out.println(TokenLexic.FAAnd(sql));
        }
    }
}
