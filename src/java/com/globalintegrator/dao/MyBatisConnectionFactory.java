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
 * Crea una instancia la sesion a la base de datos.
 */
public class MyBatisConnectionFactory {

    /**
     * @param sqlSessionFactory Genera la sesion a la base de datos.
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
     * @return getSqlSessionFactory() Entrega los datos obtenidos .
     */
    public static SqlSessionFactory getSqlSessionFactory() {

        return sqlSessionFactory;
    }

}
