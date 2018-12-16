/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mlkfinalwork.TeaIn.TeaImpl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import mlkfinalwork.TeaFactory.TeacherUser;
import mlkfinalwork.TeaIn.TeaIn;



/**
 * @version 1.0 基于文本IO输入
 * @author 马苓珂
 */
public class TeaImpl implements TeaIn{
    //定义文件
    public static File file=new File ("TeaUser.txt");
    //在加载类的时候创建文件
    static{
        try {
            file.createNewFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
        public boolean login(String tnumber,String tname){
            ArrayList<TeacherUser> al=new ArrayList <> (  );
            readTeacherUser ( al );
            boolean flag=false;
            for (int i = 0; i < al.size (); i++) {
                if (al.get ( i ).getTnumber ().equals ( tnumber ) && al.get ( i ).getTname ().equals ( tname )){
                    flag = true;
                }
            }
            return flag;
    }
        public void regist(ArrayList<TeacherUser> teacherUserArrayList){
           writeTeaUser ( teacherUserArrayList );
    }
    public void readTeacherUser(ArrayList<TeacherUser> al)  {
        boolean flag=false;
        BufferedReader br=null;
        try{
            br=new BufferedReader(new FileReader(file));
            String line=null;
            while((line=br.readLine())!=null){
                String []datas=line.split("=");
                TeacherUser tu=new TeacherUser();
                tu.setTnumber(datas[0]);
                tu.setTname(datas[1]);
                tu.setTaddress(datas[2]);
                tu.setTtel(datas[5]);
                tu.setTplace(datas[3]);
                tu.setTsex(datas[4]);
                tu.setFz(Double.parseDouble ( datas[7] ));
                tu.setGjj(Double.parseDouble ( datas[8] ));
                tu.setTjbgz (Double.parseDouble ( datas[14] ));
                tu.setDhf ( Double.parseDouble ( datas[6] ) );
                tu.setTjt (Double.parseDouble ( datas[15] ));
                tu.setSds(Double.parseDouble ( datas[11]));
                tu.setSdf(Double.parseDouble ( datas[10] ));
                tu.setShbt(Double.parseDouble ( datas[13] ));
                tu.setWsf(Double.parseDouble ( datas[16] ));
                al.add(tu);
            }
        }catch(IOException ioe){
            ioe.printStackTrace();
        }finally{
            try {
                br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    @Override
    public boolean modify(TeacherUser teacherUser) {
        boolean flag=false;
        ArrayList<TeacherUser> al=new ArrayList <> (  );
        readTeacherUser ( al );
        int index=-1;
        while(true){
            for (int i = 0; i < al.size (); i++) {
                TeacherUser tu=al.get ( i );
                if(tu.getTnumber ().equals ( teacherUser.getTnumber () )){
                    index=i;
                    break;
                }
                    tu.setTnumber(teacherUser.getTnumber ());
                    tu.setTname(teacherUser.getTname ());
                    tu.setTaddress(teacherUser.getTaddress ());
                    tu.setTtel(teacherUser.getTtel ());
                    tu.setTplace(teacherUser.getTplace ());
                    tu.setTsex(teacherUser.getTsex ());
                    tu.setFz(teacherUser.getFz ());
                    tu.setGjj(teacherUser.getGjj ());
                    tu.setTjbgz (teacherUser.getTjbgz ());
                    tu.setDhf ( teacherUser.getDhf () );
                    tu.setTjt (teacherUser.getTjt ());
                    tu.setSds(teacherUser.getSds ());
                    tu.setSdf(teacherUser.getSdf ());
                    tu.setShbt(teacherUser.getShbt ());
                    tu.setWsf(teacherUser.getWsf ());
                    al.add(tu);
                    writeTeaUser ( al );
                    flag=true;
                    break;
            }
            return flag;
        }
    }

    @Override
    public boolean remove(String tnumber) {
        boolean flag = false;
        ArrayList <TeacherUser> al = new ArrayList <> ();
        readTeacherUser ( al );
        int index = -1;
        while (true) {
            for (int i = 0; i < al.size (); i++) {
                TeacherUser tu = al.get ( i );
                if (tu.getTnumber ().equals ( tnumber )) {
                    index = i;
                    break;
                }
                al.remove ( index );
                writeTeaUser ( al );
                flag = true;
                break;
            }
            return flag;
        }
    }

    public static void writeTeaUser( ArrayList<TeacherUser> teacherUserArrayList) {
            BufferedWriter bw=null;
            try{
                bw=new BufferedWriter(new FileWriter (file));
                for (int i = 0; i < teacherUserArrayList.size (); i++) {
                    TeacherUser tu=teacherUserArrayList.get(i);
                    bw.write(tu.getTnumber()+"="+tu.getTname()+"="+tu.getTaddress()+"="+
                            tu.getTplace()+"="+tu.getTsex()+"="+tu.getTtel()+"="+tu.getDhf()
                            +"="+tu.getFz()+"="+tu.getGjj()+"="+tu.getHjkk()+"="+tu.getSdf()+"="+
                            tu.getSds()+"="+tu.getSfgz()+"="+tu.getShbt()+"="+tu.getTjbgz()+"="+
                            tu.getTjt()+"="+tu.getWsf()+"="+tu.getYfgz());
                    bw.newLine();
                    bw.flush();
                }

            }catch(IOException ioe){
                ioe.printStackTrace();
            }finally{
                try {
                    bw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
}
