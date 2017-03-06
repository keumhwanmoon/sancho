package com.sancho.polls;

/**
 * @author Jason, Moon
 * @since 2017-03-06.
 */
public class PollSQL {

    public static String selectAll() {
        StringBuilder sql =
                new StringBuilder('''
                        SELECT  A1.CATEGORY_CODE,
                                A1.TITLE,
                                A1.CRTN_DATE AS CREATION_DATE
                        FROM    POLL A1
                        ''')

        return sql.toString()
    }
}
