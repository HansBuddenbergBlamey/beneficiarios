package com.globalintegrator.data;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.StatementType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.globalintegrator.dao.StoreProcedureDAO;

/**
 *
 * @author Carlos Dreves N
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
		
		StoreProcedureDAO DAO = new StoreProcedureDAO();
			//int a = DAO.callGetTotalCityStateId(1);
			//System.out.println(a);
                        String test = DAO.insertaBeneficioAnnotations(1, "1-9", 1, 1);
                        System.out.println(test);

        
	}

}
