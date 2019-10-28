package com.tj.pattern.prototypePattern.deepClone;

import java.io.*;
import java.util.Date;

/**
 * 2019/10/5
 * author:ljh
 */
public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {

    public JinGuBang jinGuBang;
    public QiTianDaSheng() {
        this.jinGuBang = new JinGuBang();
        this.setBirthday(new Date());
    }

    @Override
    public Object clone() {
        return deepClone();
    }

    private Object deepClone() {
        try {
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream oot = new ObjectOutputStream(bao);
            oot.writeObject(this);

            ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream oit = new ObjectInputStream(bai);
            QiTianDaSheng copy = (QiTianDaSheng) oit.readObject();

            copy.setBirthday(new Date());
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
