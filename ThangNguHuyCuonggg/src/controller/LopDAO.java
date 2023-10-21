package controller;

import database.JDBCUtil;
import java.util.ArrayList;
import model.lop;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.plaf.metal.MetalToolTipUI;
import javax.xml.transform.Result;
import view.Form9Button;


/**
 *
 * @author minhius23
 */
public class LopDAO implements DAO<lop> {

    public static LopDAO getInstance() {
        return new LopDAO();
    }

    @Override
    public List<lop> viewLop() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public lop getModel() {
       lop Lop = new lop();
       Lop.setMalop("");
        return Lop;
    }


}
