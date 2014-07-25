package com.globalintegrator.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * MyBatis Connection Factory, which reads the configuration data from a XML
 * file.
 *
 * @author Loiane Groner http://loianegroner.com (English) http://loiane.com
 * (Portuguese)
 */

/**
 *  
 * 
 */
public class MyBatisConnectionFactory {
    /** 
     * Crea de una instancia de conexion session para base de datos
     * 
     * @Param SqlSessionFactory Crea la conexion a una sesion a base de datos.
     * @exception fileNotFoundException Si no se encuentra archivo.
     * @throws fileNotFoundException.printStackTrace description.
     */
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            String resource = "SqlMapConfig.xml";
            Reader reader = Resources.getResourceAsReader(resource);
            if (sqlSessionFactory == null) {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    /**
     *
     * @return
     */
    
    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

}
